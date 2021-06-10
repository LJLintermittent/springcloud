package com.learn.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/10/29 14:50<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@RestController
@Slf4j
public class OrderConsulController {

    public static final String INVOKE_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo(){
        String object = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        return object;
    }
}
