package com.baohao.departmentwebsite.config;

import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean() {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager());
        shiroFilterFactoryBean.setLoginUrl("/login");
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");
        shiroFilterFactoryBean.setSuccessUrl("/");

//        Map<String, String> filterChainDefinitionMap = shiroFilterFactoryBean.getFilterChainDefinitionMap();
//        filterChainDefinitionMap.put("/resource/**", "anon");
//        filterChainDefinitionMap.put("/page/**", "anon");
//        filterChainDefinitionMap.put("/api/**", "anon");
//        filterChainDefinitionMap.put("/login", "anon");
//        filterChainDefinitionMap.put("/403", "anon");
//        filterChainDefinitionMap.put("/**", "authc");

        return shiroFilterFactoryBean;
    }

    @Bean
    public DefaultWebSecurityManager securityManager() {
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setSessionManager(sessionManager());
        return defaultWebSecurityManager;
    }

    @Bean
    public SessionManager sessionManager() {
        DefaultWebSessionManager webSessionManager = new DefaultWebSessionManager();
        webSessionManager.setSessionIdUrlRewritingEnabled(false);
        webSessionManager.setGlobalSessionTimeout(28800000);
        webSessionManager.setDeleteInvalidSessions(true);
        webSessionManager.setSessionValidationSchedulerEnabled(true);
        SimpleCookie cookie = new SimpleCookie();
        cookie.setName("baoHao.resource.boot.sessionId");
        cookie.setPath("/");
        webSessionManager.setSessionIdCookie(cookie);
        return webSessionManager;
    }
}
