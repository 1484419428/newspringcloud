package com.suixingpay.service;

import com.netflix.hystrix.Hystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",configuration = SchedualServiceHiHystric.class,fallback = HiHystrix.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi")
    String sayHiFromClientOne( @RequestParam("/name") String name);
}
