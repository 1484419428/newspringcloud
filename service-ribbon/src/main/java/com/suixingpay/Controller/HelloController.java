package com.suixingpay.Controller;

import com.suixingpay.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: newcloud
 * @description:
 * @author: zheng_y
 * @create: 2018-12-20 20:44
 **/
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @GetMapping("/hi")
  public String hi(@RequestParam(value = "name",defaultValue = "789") String name){
      return helloService.hiService(name);
  }
  @Autowired
    private LoadBalancerClient loadBalancerClient;
    @GetMapping("/test")
    public String testRibbon(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");

        return serviceInstance.getHost()+":"+serviceInstance.getPort();
    }
}