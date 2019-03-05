package com.suixingpay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: newcloud
 * @description:
 * @author: zheng_y
 * @create: 2019-03-04 15:06
 **/
@Service
public class HiService {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    public String hi(String name){
     return schedualServiceHi.sayHiFromClientOne(name);
    }
}