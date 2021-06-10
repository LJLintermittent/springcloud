package com.learn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import sun.applet.Main;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/11/3 17:41<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3377.class,args);
    }
}
