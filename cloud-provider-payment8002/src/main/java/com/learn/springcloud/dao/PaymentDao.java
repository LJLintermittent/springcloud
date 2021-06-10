package com.learn.springcloud.dao;

import com.learn.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/10/27 23:14<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
