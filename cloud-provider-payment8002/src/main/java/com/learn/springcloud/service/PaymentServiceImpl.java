package com.learn.springcloud.service;

import com.learn.springcloud.dao.PaymentDao;
import com.learn.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/10/27 23:37<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
