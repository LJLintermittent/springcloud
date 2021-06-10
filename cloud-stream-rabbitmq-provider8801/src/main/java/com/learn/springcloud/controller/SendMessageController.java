package com.learn.springcloud.controller;

import com.learn.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/11/2 22:45<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider iMessageProvider;

    @GetMapping("/send")
    public String sendMessage(){
        return iMessageProvider.send();
    }
}
