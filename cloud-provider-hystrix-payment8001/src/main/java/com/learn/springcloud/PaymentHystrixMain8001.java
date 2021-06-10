package com.learn.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/10/30 0:43<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8001.class,args);
    }

    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean RegistrationBean = new ServletRegistrationBean(streamServlet);
        RegistrationBean.setLoadOnStartup(1);
        RegistrationBean.addUrlMappings("/actuator/hystrix.stream");
        RegistrationBean.setName("HystrixMetricsStreamServlet");
        return RegistrationBean;
    }
}
