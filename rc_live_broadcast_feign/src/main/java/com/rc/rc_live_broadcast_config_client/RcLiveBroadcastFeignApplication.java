package com.rc.rc_live_broadcast_config_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableTurbine
@EnableHystrix
@EnableHystrixDashboard
public class RcLiveBroadcastFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(RcLiveBroadcastFeignApplication.class, args);
    }

}
