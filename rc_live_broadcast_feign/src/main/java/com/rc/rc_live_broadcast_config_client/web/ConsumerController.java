package com.rc.rc_live_broadcast_config_client.web;

import com.rc.rc_live_broadcast_config_client.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Functional description：
 * @Author: RayChou
 * @Date: 2019/4/8 0008 16:36
 * @Version 1.0
 */
@RestController
public class ConsumerController {

    @Autowired
    ComputeService computeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeService.add(10, 20);
    }

}
