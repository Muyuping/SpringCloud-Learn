package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Dept8003BootAlication {
    public static void main(String[] args){
        SpringApplication.run(Dept8003BootAlication.class, args);
    }
}
