package com.baohao.departmentwebsite.realm;

import com.baohao.departmentwebsite.common.constant.SessionConstants;
import com.baohao.departmentwebsite.model.ManagerInfo;
import com.baohao.departmentwebsite.service.ManagerService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
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
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        return null;
    }
}
