package com.suixingpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @program: newcloud
 * @description:
 * @author: zheng_y
 * @create: 2018-12-25 18:54
 **/
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
//@EnableDiscoveryClient
public class ServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class,args);
    }
}