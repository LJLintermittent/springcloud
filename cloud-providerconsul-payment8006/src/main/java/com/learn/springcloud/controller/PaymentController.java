package com.learn.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/10/29 14:33<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/consul")
    public String paymentConsul(){
        return "spring cloud with consul : "+ serverPort +"\t" + UUID.randomUUID().toString();
    }

}
