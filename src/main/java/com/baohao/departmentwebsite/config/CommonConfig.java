package com.baohao.departmentwebsite.config;

import com.zwzx.common.spring.CommonBeanFactory;
import com.zwzx.common.spring.PropertiesConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

@Configuration
public class CommonConfig {

    @Bean
    public PropertiesConfigurer propertiesConfigurer() {
        PropertiesConfigurer propertiesConfigurer = new PropertiesConfigurer();
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        Resource fileSystemResource = resourcePatternResolver.getResource("file:/opt/BaoHao/department_website.properties");
        Resource[] resources = {fileSystemResource};
        propertiesConfigurer.setLocations(resources);
        return propertiesConfigurer;
    }

    @Bean
    public CommonBeanFactory commonBeanFactory() {
        return new CommonBeanFactory();
    }
}
