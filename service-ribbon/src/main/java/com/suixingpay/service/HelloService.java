package com.suixingpay.service;

//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

/**
 * @program: newcloud
 * @description:
 * @author: zheng_y
 * @create: 2018-12-20 20:39
 **/
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

   @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        return restTemplate.getForObject("http://eureka-client/hi",String.class);
    }

    public String hiError(@RequestParam(value = "name",defaultValue = "1789") String name){
        return "hi,"+name+"sorry,error";
    }
}