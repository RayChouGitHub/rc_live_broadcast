package com.rc.rc_live_broadcast_eureka_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RcLiveBroadcastEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RcLiveBroadcastEurekaServiceApplication.class, args);
    }

}
