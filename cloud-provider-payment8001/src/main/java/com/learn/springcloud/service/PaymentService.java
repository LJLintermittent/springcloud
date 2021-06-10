package com.learn.springcloud.service;

import com.learn.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/10/27 23:37<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
