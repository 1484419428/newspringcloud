package com.suixingpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @program: newcloud
 * @description:
 * @author: zheng_y
 * @create: 2018-12-21 14:27
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
public class ServiceFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class,args);
    }
}