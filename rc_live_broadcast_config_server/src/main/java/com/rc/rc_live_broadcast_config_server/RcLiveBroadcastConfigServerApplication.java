package com.rc.rc_live_broadcast_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class RcLiveBroadcastConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RcLiveBroadcastConfigServerApplication.class, args);
    }

}
