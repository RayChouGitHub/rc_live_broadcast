package com.rc.rc_live_broadcast_feign.hystrix;

import com.rc.rc_live_broadcast_feign.client.ComputeClient;
import org.springframework.stereotype.Component;

/**
 * @Functional description：
 * @Author: RayChou
 * @Date: 2019/4/9 0009 9:12
 * @Version 1.0
 */
@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public Integer add(Integer a, Integer b) {
        return -9999;
    }
}
