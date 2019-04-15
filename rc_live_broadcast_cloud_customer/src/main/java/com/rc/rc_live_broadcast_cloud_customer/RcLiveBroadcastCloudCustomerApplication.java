package com.rc.rc_live_broadcast_cloud_customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RcLiveBroadcastCloudCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RcLiveBroadcastCloudCustomerApplication.class, args);
    }

}
