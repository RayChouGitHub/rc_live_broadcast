package com.rc.rc_live_broadcast_config_client.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Functional description：
 * @Author: RayChou
 * @Date: 2019/4/8 0008 18:22
 * @Version 1.0
 */
@Service
public class ComputeService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String add() {
        return restTemplate.getForEntity("http://rc-live-broadcast-eureka-service/add?a=10&b=20", String.class).getBody();
    }

    public String addServiceFallback(){
        return "error";
    }
}
