package com.rc.rc_live_broadcast_cloud_gateway.fallback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/fallback")
    public String fallback() {
        return "Hello World!\nfrom gateway";
    }

}
