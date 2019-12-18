package com.amarsoft.jbmei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients  // 开启feign服务
@EnableCircuitBreaker //声明启用数据监控
@EnableHystrixDashboard // 声明启用可视化数据监控
public class HysTrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HysTrixApplication.class,args);
    }
}
