package com.rc.rc_live_broadcast_cloud_account.controller;

import com.alibaba.fastjson.JSONObject;
import com.rc.rc_live_broadcast_cloud_account.domain.Account;
import com.rc.rc_live_broadcast_cloud_account.service.AccountMongoReactiveRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @Functional description：
 * @Author: RayChou
 * @Date: 2019/4/15 0015 19:45
 * @Version 1.0
 */
@RequestMapping("account")
@RestController
@Slf4j
public class AccountController {

    @Autowired
    private AccountMongoReactiveRepository repository;

    @GetMapping(value = "/customer/{customer}",produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Account> findByCustomer(@PathVariable(name = "customer") String customer) {
        log.info("Customer => " + customer + " [ " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")) + " ]");
        return repository.findByCustomerId(customer);
    }

    @PostMapping("/save")
    public Mono<Account> save(Account account){
        return repository.save(account);
    }
}
