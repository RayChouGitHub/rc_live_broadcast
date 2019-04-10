package com.rc.rc_live_broadcast_eureka_service.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Functional description：
 * @Author: RayChou
 * @Date: 2019/4/8 0008 16:36
 * @Version 1.0
 */
@RestController
public class ComputeController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        Integer r = a + b;
        discoveryClient.getServices().forEach(id -> {
            discoveryClient.getInstances(id).forEach(instance -> {
                logger.info("/hello, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
            });
        });
        return r;
    }
}
