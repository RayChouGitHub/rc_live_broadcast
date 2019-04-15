package com.rc.rc_live_broadcast_cloud_customer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Functional description：
 * @Author: RayChou
 * @Date: 2019/4/15 0015 19:51
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Slf4j
@Document(collection = "customers")
public class Customer {
    @Id
    private String id;
    private String name;
    private String mobile;
}
