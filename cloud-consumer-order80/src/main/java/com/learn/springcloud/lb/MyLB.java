package com.learn.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/10/29 19:54<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Component
public class MyLB implements LoadBalancer{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0:current + 1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("******第几次访问，次数next: "+ next);
        return next;
    }
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
