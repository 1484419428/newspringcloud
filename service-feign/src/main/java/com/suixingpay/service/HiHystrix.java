package com.suixingpay.service;

import org.springframework.stereotype.Component;

/**
 * @program: newcloud
 * @description:
 * @author: zheng_y
 * @create: 2019-03-04 15:59
 **/
@Component
public class HiHystrix implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "hi,"+name+"sorry,error";
    }
}