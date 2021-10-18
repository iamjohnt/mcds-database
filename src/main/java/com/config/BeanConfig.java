package com.config;

import com.dbservice.DbService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public DbService dbService() {
        return new DbService();
    }
}
