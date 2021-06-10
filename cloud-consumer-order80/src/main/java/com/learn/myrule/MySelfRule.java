package com.learn.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/10/29 19:20<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();//随机算法  负载均衡
    }
}
