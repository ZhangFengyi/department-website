package com.baohao.departmentwebsite.common.realm;

import com.baohao.departmentwebsite.common.GlobalConfigurations;
import com.baohao.departmentwebsite.common.constant.SessionConstants;
import com.baohao.departmentwebsite.common.util.EncryptUtils;
import com.baohao.departmentwebsite.model.ManagerInfo;
import com.baohao.departmentwebsite.service.ManagerService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class ShiroDBRealm extends AuthorizingRealm {
    private Logger logger = LoggerFactory.getLogger("loginLogger");

    @Resource
    private ManagerService managerService;

    @Resource
    private HttpServletRequest httpServletRequest;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        String name = (String) principals.fromRealm(getName()).iterator().next();
        if (StringUtils.isBlank(name)) {
            return null;
        }
        Subject subject = SecurityUtils.getSubject();
        ManagerInfo manager = (ManagerInfo) subject.getSession().getAttribute(SessionConstants.ATTR_USER);
        if (manager == null || !manager.getMagEmail().equalsIgnoreCase(name)) {
            manager = managerService.findManagerByEmail(name);
        }
        if (manager != null) {
            authorizationInfo.addRole("admin");
        }
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token ;
        String email = usernamePasswordToken.getUsername();
        String password = String.valueOf(usernamePasswordToken.getPassword());

        ManagerInfo manager = managerService.findManagerByEmail(email);
        if (manager == null) {
            logger.warn("Not exists manager is trying to login, manager email: " + email);
            throw new UnknownAccountException("Manager does not exist");
        }
        if (GlobalConfigurations.isReleaseMode()) {
            if (!StringUtils.equals(EncryptUtils.md5Encrypt(password).toString(), manager.getMagPsw())) {
                logger.warn("Wrong password inout, email: " + email + " password: " + password);
                throw new IncorrectCredentialsException("Incorrect password");
            }
        }
        SecurityUtils.getSubject().getSession().setAttribute(SessionConstants.ATTR_USER, manager);
        logger.info("Manager login, email: " + email);
        // 更新 manager 登录信息
        Date date = new Date();
        date.setTime(System.currentTimeMillis());
        manager.setMagLoginTime(date);
        String ip = getIpAddr(httpServletRequest);
        manager.setMagLoginIp(ip);
        managerService.updateManagerLoginInfo(manager);

        return new SimpleAuthenticationInfo(email, password, getName());
    }

    private String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknow".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknow".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknow".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
            if ("127.0.0.1".equalsIgnoreCase(ip)) {
                // 根据网卡读取本机配置
                InetAddress inet = null;
                try {
                    inet = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                ip = inet.getHostAddress();
            }
        }
        // 多个代理的情况，多个 IP 按','分割，第一个 IP 为客户端真实 IP
        if (ip != null && ip.length() > 15) {
            if (ip.indexOf(",") > 0) {
                ip = ip.substring(0, ip.indexOf(","));
            }
        }
        return ip;
    }
}
