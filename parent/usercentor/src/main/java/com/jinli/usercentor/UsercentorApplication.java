package com.jinli.usercentor;



import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.jinli.usercentor.service")
@EntityScan("com.jinli.common.domain")
public class UsercentorApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsercentorApplication.class, args);
    }

}
