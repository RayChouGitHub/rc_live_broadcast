package com.rc.rc_live_broadcast_config_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RcLiveBroadcastConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RcLiveBroadcastConfigServerApplication.class, args);
    }

}
