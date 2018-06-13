package com.example.demotrace2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoTrace2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoTrace2Application.class, args);
    }
}
