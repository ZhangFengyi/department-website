package com.baohao.departmentwebsite.config;

import com.baohao.departmentwebsite.realm.ShiroDBRealm;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

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

        Map<String, String> filterChainDefinitionMap = shiroFilterFactoryBean.getFilterChainDefinitionMap();
        filterChainDefinitionMap.put("/resource/**", "anon");
        filterChainDefinitionMap.put("/page/**", "anon");
        filterChainDefinitionMap.put("/api/**", "anon");
        filterChainDefinitionMap.put("/login", "anon");
        filterChainDefinitionMap.put("/403", "anon");
        filterChainDefinitionMap.put("/**", "authc");

        return shiroFilterFactoryBean;
    }

    @Bean
    public DefaultWebSecurityManager securityManager() {
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setSessionManager(sessionManager());
//        defaultWebSecurityManager.setRealm(shiroDBRealm());
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

    @Bean(name = "shiroDBRealm")
    @DependsOn("lifecycleBeanPostProcessor")
    public ShiroDBRealm shiroDBRealm() {
        return new ShiroDBRealm();
    }

    @Bean(name = "lifecycleBeanPostProcessor")
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }


//    @Bean(name = "shiroDBRealm")
//    @DependsOn("lifecycleBeanPostProcessor")
//    public ShiroDBRealm getShiroDBRealm() {
//        return new ShiroDBRealm();
//    }
//
//    @Bean(name = "lifecycleBeanPostProcessor")
//    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
//        return new LifecycleBeanPostProcessor();
//    }

//    等到 ApplicationConText 加载完成之后再装配 shiroRealm
    @EventListener
    public void handleContextRefresh(ContextRefreshedEvent event) {
        ApplicationContext context = event.getApplicationContext();
        ((DefaultWebSecurityManager) context.getBean("securityManager")).setRealm(shiroDBRealm());
    }


    /**
     * 等到ApplicationContext 加载完成之后 装配shiroRealm
     */
//    @EventListener
//    public void handleContextRefresh(ContextRefreshedEvent event) {
//        ApplicationContext context = event.getApplicationContext();
//
//        ((DefaultWebSecurityManager) context.getBean("securityManager")).setRealm(getShiroDBRealm());
//    }
}
