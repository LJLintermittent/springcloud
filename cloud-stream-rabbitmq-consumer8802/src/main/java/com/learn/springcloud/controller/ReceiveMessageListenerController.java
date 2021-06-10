package com.learn.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/11/2 23:04<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("消费者1号，——————————>接收到的消息是：" + message.getPayload() + "\t   port:" + serverPort);
    }
}
