package com.rc.rc_live_broadcast_config_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RcLiveBroadcastConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RcLiveBroadcastConfigClientApplication.class, args);
    }

}
