package com.jinli.resource_service_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
public class ResourceServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResourceServiceDemoApplication.class, args);
    }

}
