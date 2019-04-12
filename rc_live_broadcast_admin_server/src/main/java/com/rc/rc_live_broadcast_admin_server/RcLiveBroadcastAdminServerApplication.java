package com.rc.rc_live_broadcast_admin_server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class RcLiveBroadcastAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RcLiveBroadcastAdminServerApplication.class, args);
    }

}
