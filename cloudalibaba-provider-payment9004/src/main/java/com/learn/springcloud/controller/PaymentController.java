package com.learn.springcloud.controller;

import com.learn.springcloud.entities.CommonResult;
import com.learn.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.UUID;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/11/4 13:04<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put(1L, new Payment(1L, UUID.randomUUID().toString()));
        hashMap.put(2L, new Payment(2L, UUID.randomUUID().toString()));
        hashMap.put(3L, new Payment(3L, UUID.randomUUID().toString()));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        Payment payment = hashMap.get(id);
        CommonResult result = new CommonResult(200, "from mysql,serverPort:" + serverPort, payment);
        return result;
    }
}
