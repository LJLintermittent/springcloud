package com.learn.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/11/4 13:25<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
