package com.learn.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/10/29 23:59<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
