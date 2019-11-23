package com.jinli.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@ComponentScan("com.jinli")
public class AuthApplication {

    public static void main(String[] args) throws InterruptedException {

        SpringApplication.run(AuthApplication.class, args);
        CountDownLatch countDownLatch = new CountDownLatch(2);
        countDownLatch.await();
    }
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }

}
