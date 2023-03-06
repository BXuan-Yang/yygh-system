package com.BXuan.yygh.hosp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.BXuan")
@EnableDiscoveryClient
/*
openfeign的用途：服务发现，负载均衡，服务调用
openfeign的实现原理：
基于@EnableFeignClients 将所有被@FeignClient注解的类 注册到容器中。
当这些被@FeignClient注解的类被调用时会创建一个动态代理的对象为我们创建被调用类的实例，
然后都会被统一转发给 Feign 框架所定义的一个 InvocationHandler ，
由该 Handler 完成后续的 HTTP 转换， 发送， 接收， 翻译HTTP响应的工作。
 */
@EnableFeignClients(basePackages = "com.BXuan")
public class ServiceHospApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHospApplication.class, args);
    }
}
