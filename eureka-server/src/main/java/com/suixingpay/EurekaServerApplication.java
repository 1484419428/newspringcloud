package com.suixingpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ImportResource;

/**
 * @program: cloudtest
 * @description:
 * @author: zheng_y
 * @create: 2018-12-19 20:16
 **/
@EnableEurekaServer
@SpringBootApplication
@ImportResource()
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}