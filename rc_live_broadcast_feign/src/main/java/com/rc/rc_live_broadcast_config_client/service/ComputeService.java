package com.rc.rc_live_broadcast_config_client.service;

import com.rc.rc_live_broadcast_config_client.client.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Functional description：
 * @Author: RayChou
 * @Date: 2019/4/8 0008 17:29
 * @Version 1.0
 */
@Service
public class ComputeService {

    @Autowired
    private ComputeClient computeClient;

    public Integer add(Integer a,Integer b){
        return computeClient.add(a,b);
    }
}
