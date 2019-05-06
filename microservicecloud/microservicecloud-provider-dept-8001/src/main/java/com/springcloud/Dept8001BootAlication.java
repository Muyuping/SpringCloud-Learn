package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Dept8001BootAlication {
    public static void main(String[] args){
        SpringApplication.run(Dept8001BootAlication.class, args);
    }
}
