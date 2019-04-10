package com.rc.rc_live_broadcast_zuul.config;

import com.rc.rc_live_broadcast_zuul.filter.AccessFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Functional description：
 * @Author: RayChou
 * @Date: 2019/4/10 0010 9:45
 * @Version 1.0
 */
@Configuration
public class ZuulConfig {

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
