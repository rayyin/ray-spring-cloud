package com.ray.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @author yinrui
 * @version 1.0
 */
@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class RayCloudZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(RayCloudZipkinApplication.class, args);
    }
}
