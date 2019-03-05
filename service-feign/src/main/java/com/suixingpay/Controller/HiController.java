package com.suixingpay.Controller;

import com.suixingpay.service.HiService;
import com.suixingpay.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: newcloud
 * @description:
 * @author: zheng_y
 * @create: 2018-12-21 14:32
 **/
@RestController
public class HiController {
    @Autowired
    private HiService hiService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam(required = false,defaultValue = "111") String name){
        return hiService.hi(name);
    }
}