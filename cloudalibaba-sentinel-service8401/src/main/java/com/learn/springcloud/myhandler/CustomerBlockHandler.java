package com.learn.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.learn.springcloud.entities.CommonResult;
import com.learn.springcloud.entities.Payment;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/11/4 12:03<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException1(BlockException exception){
        return new CommonResult(444,"按客户自定义，global handlerException-----------1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(444,"按客户自定义，global handlerException-----------2");
    }
}
