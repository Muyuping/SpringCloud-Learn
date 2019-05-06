package com.muyuping.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
//注意！！！！这里的包扫描的是api中标注@FeignClient类所在的包，不然controller注入Service会提示找不到bean
@EnableFeignClients(basePackages= {"com.springcloud"})
//扫描 fallback类所在的包，不然注入不到容器
@ComponentScan("com.springcloud.Service")
//扫描controller，因为上面扫描fallback会导致扫描不到controller，所以手动加上
@ComponentScan("com.muyuping.springcloud")
public class ConsumerFeignApplication {
    public static void main(String[] args){
        SpringApplication.run(ConsumerFeignApplication.class, args);
    }
}
