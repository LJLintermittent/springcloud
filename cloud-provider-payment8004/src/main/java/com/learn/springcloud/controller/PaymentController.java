package com.learn.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/10/29 12:43<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentZk(){
        return "springCloud with zookeeper" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
