package com.rc.rc_live_broadcast_ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class RcLiveBroadcastRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RcLiveBroadcastRibbonApplication.class, args);
    }

}
