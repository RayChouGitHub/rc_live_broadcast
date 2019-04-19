package com.rc.rc_live_broadcast_cloud_account.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @Functional description：
 * @Author: RayChou
 * @Date: 2019/4/15 0015 16:28
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "accounts")
public class Account implements Serializable {
    @Id
    private String id;
    private String customerId;
    private Double amount;
}
