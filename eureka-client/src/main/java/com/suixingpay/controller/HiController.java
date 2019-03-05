package com.suixingpay.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: newcloud
 * @description:
 * @author: zheng_y
 * @create: 2019-03-01 10:23
 **/
@RestController
public class HiController {

    @Value("${server.port}")
    public String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name",defaultValue = "forezp111") String name){
        return  "hi"+name+" , i am from port"+port;
    }
}