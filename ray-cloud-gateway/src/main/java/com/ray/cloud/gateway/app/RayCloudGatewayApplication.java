package com.ray.cloud.gateway.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yinrui
 * @version 1.0
 */
@SpringBootApplication(scanBasePackages = "com.ray.cloud.gateway")
@EnableEurekaClient
public class RayCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(RayCloudGatewayApplication.class, args);
    }

}
