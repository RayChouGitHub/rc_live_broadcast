package com.rc.rc_live_broadcast_cloud_gateway.config;

import com.rc.rc_live_broadcast_cloud_gateway.filter.ElapsedGatewayFilterFactory;
import com.rc.rc_live_broadcast_cloud_gateway.filter.TokenFilter;
import com.rc.rc_live_broadcast_cloud_gateway.resolver.RemoteAddrKeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Functional description：
 * @Author: RayChou
 * @Date: 2019/4/18 0018 10:56
 * @Version 1.0
 */
@Configuration
public class GatewayConfig {

    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }

    @Bean
    public ElapsedGatewayFilterFactory elapsedGatewayFilterFactory() {
        return new ElapsedGatewayFilterFactory();
    }

    @Bean(name= RemoteAddrKeyResolver.BEAN_NAME)
    public RemoteAddrKeyResolver remoteAddrKeyResolver(){
        return new RemoteAddrKeyResolver();
    }
}
