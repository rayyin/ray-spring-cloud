package com.ray.cloud.app.consumer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author yinrui
 * @version 1.0
 */
@SpringBootApplication(scanBasePackages = "com.ray.cloud.app.consumer")
@ServletComponentScan
@EnableEurekaClient
@EnableFeignClients("com.ray.cloud.app.provider.client")
@EnableTransactionManagement
@EnableCircuitBreaker
public class RayCloudExampleConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RayCloudExampleConsumerApplication.class, args);
    }
}
