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

public class ShiroDBRealm extends AuthorizingRealm {

    private Logger logger = LoggerFactory.getLogger("loginLogger");

    @Resource
    private ManagerService managerService;

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

        return new SimpleAuthenticationInfo(email, password, getName());
    }
}
