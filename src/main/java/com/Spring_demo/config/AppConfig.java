package com.Spring_demo.config;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.util.Properties;

@Configuration
public class AppConfig {

    @Bean(name = "yamlProperties")
    public Properties yamlProperties() {
        YamlPropertiesFactoryBean factoryBean = new YamlPropertiesFactoryBean();
        factoryBean.setResources(new ClassPathResource("application.yml"));
        return factoryBean.getObject();
    }
}

