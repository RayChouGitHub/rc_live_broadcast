package com.rc.rc_live_broadcast_ribbon.web;

import com.rc.rc_live_broadcast_ribbon.service.ComputeService;
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
    private ComputeService computeService;

    @GetMapping("add")
    public String add(){
        return computeService.add();
    }
}
