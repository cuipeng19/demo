package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

/**
 * @author cuipeng 2019/12/20 11:41
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Bean
    public RestTemplate build() {
        Duration duration = Duration.ofSeconds(10);
        this.restTemplateBuilder.setConnectTimeout(duration);
        this.restTemplateBuilder.setReadTimeout(duration);
        return this.restTemplateBuilder.build();
    }

}
