package com.ray.cloud.eureka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yinrui
 * @version 1.0
 */
@EnableEurekaServer
@ServletComponentScan
@SpringBootApplication(scanBasePackages = "com.ray.cloud.eureka")
public class RayCloudEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(RayCloudEurekaApplication.class, args);
    }
}
