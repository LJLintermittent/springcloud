package com.learn.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/11/3 22:38<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        return "-----------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + "\t" + "....testB");
//        try {
//            TimeUnit.MILLISECONDS.sleep(800);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "-----------testB";
    }

    @GetMapping("/testD")
    public String testD() {
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        log.info("testD---------测试RT");

        log.info("testD------------测试异常比例");
        int age = 10 / 0;
        return "-----------testD";
    }

    @GetMapping("/testE")
    public String testE() {
        log.info("testE------------测试异常数");
        int age = 10 / 0;
        return "-------------testE";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {
        //@SentinelResource处理的是sentinel控制台配置的违规情况，有blockHandler方法配置的兜底处理
        //int a = 10/0;是java运行时异常，@SentinelResource不管
        //int a = 10/0;
        return "-------------testHotKey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException blockException) {
        return "---------deal_testHotKey ..";
    }
}
