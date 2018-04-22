package com.baohao.departmentwebsite.config;

import com.zwzx.common.spring.CommonBeanFactory;
import com.zwzx.common.spring.PropertiesConfigurer;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

@Configuration
public class CommonConfig {

    @Bean
    public PropertiesConfigurer propertiesConfigurer() throws IOException {
        PropertiesConfigurer propertiesConfigurer = new PropertiesConfigurer();
        propertiesConfigurer.setIgnoreResourceNotFound(true);
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        Resource[] classPathResources = resourcePatternResolver.getResources("classpath*:properties/*.properties");
        Resource applicationResource = resourcePatternResolver.getResource("classpath:application.properties");
        Resource fileSystemResource = resourcePatternResolver.getResource("file:/opt/BaoHao/department_website.properties");
        Resource[] resources = ArrayUtils.addAll(classPathResources, applicationResource, fileSystemResource);
        propertiesConfigurer.setLocations(resources);
        return propertiesConfigurer;
    }

    @Bean
    public CommonBeanFactory commonBeanFactory() {
        return new CommonBeanFactory();
    }
}
