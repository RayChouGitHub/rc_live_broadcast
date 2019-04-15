package com.rc.rc_live_broadcast_cloud_customer.dao;

import com.rc.rc_live_broadcast_cloud_customer.domain.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @Functional description：
 * @Author: RayChou
 * @Date: 2019/4/15 0015 19:53
 * @Version 1.0
 */
public interface CustomerMongoReactiveRepository extends ReactiveCrudRepository<Customer, String>{

}
