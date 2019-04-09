package com.rc.rc_live_broadcast_config_client.client;

import com.rc.rc_live_broadcast_config_client.config.FeignConfig;
import com.rc.rc_live_broadcast_config_client.hystrix.ComputeClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Functional description：
 * @Author: RayChou
 * @Date: 2019/4/8 0008 16:54
 * @Version 1.0
 */
@Component
@FeignClient(value = "rc-live-broadcast-eureka-service",configuration = FeignConfig.class,fallback = ComputeClientHystrix.class)
public interface ComputeClient {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
