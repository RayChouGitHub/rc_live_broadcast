package com.rc.rc_live_broadcast_cloud_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RcLiveBroadcastCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(RcLiveBroadcastCloudGatewayApplication.class, args);
    }

}
