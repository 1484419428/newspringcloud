package com.suixingpay.service;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @program: newcloud
 * @description:
 * @author: zheng_y
 * @create: 2018-12-21 17:12
 **/
@Configuration
public class SchedualServiceHiHystric  {
   @Bean
    public Retryer  feignRetryer (){
       return new Retryer.Default(100, SECONDS . toMillis(1) , 5) ;
   }
}