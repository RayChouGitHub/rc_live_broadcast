package com.rc.rc_live_broadcast_cloud_account.service;

import com.rc.rc_live_broadcast_cloud_account.domain.Account;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

/**
 * @Functional description：
 * @Author: RayChou
 * @Date: 2019/4/15 0015 16:31
 * @Version 1.0
 */
public interface AccountMongoReactiveRepository extends ReactiveCrudRepository<Account, String> {

    Flux<Account> findByCustomerId(String customerId);
}
