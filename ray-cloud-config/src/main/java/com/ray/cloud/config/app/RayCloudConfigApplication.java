package com.ray.cloud.config.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yinrui
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class RayCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(RayCloudConfigApplication.class, args);
    }

}
