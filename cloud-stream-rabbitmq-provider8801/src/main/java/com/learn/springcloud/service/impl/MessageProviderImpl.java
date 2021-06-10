package com.learn.springcloud.service.impl;

import com.learn.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/11/2 22:38<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*******serial:" + serial);
        return null;
    }
}
