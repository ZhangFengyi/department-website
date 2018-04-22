package com.baohao.departmentwebsite.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.zwzx.common.spring.PropertiesConfigurer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;


@Configuration
@MapperScan(basePackages = "com.baohao.departmentwebsite.dao", sqlSessionFactoryRef = "sqlSessionFactory")
public class MyBatisConfig {

    @Bean
    @Primary
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(PropertiesConfigurer.getProperty("rdb.driver"));
        dataSource.setJdbcUrl(PropertiesConfigurer.getProperty("rdb.url"));
        dataSource.setUser(PropertiesConfigurer.getProperty("rdb.user"));
        dataSource.setPassword(PropertiesConfigurer.getProperty("rdb.password"));
        return dataSource;
    }
}
