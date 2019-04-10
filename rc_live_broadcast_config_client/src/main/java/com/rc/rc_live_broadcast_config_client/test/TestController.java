package com.rc.rc_live_broadcast_config_client.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Functional description：
 * @Author: RayChou
 * @Date: 2019/4/9 0009 12:57
 * @Version 1.0
 */

@RestController
@RefreshScope
public class TestController {

    @Value("${foo}")
    String foo;

    @RequestMapping("/foo")
    public String hi(){
        return foo;
    }
}
