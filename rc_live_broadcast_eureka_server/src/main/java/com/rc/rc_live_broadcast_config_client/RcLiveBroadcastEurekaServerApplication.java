package com.rc.rc_live_broadcast_config_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RcLiveBroadcastEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RcLiveBroadcastEurekaServerApplication.class, args);
    }

}
