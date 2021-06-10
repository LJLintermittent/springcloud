package com.learn.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/10/29 19:51<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
