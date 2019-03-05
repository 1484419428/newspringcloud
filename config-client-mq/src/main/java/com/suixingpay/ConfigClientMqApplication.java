package com.suixingpay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: newcloud
 * @description:
 * @author: zheng_y
 * @create: 2019-01-22 11:45
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
@RefreshScope
public class ConfigClientMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMqApplication.class,args);
    }

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}