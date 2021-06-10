package com.learn.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/11/1 19:16<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Component
public class PaymentFallBackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_Ok(Integer id) {
        return "-------------PaymentFallBackService-----paymentInfo_Ok----fallback";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-------------PaymentFallBackService-----paymentInfo_TimeOut----fallback";
    }
}
