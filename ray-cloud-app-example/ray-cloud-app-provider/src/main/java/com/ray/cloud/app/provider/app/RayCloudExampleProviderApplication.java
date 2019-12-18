package com.ray.cloud.app.provider.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author yinrui
 * @version 1.0
 */
@SpringBootApplication(scanBasePackages = "com.ray.cloud.app.provider")
@ServletComponentScan
@EnableEurekaClient
@EnableTransactionManagement
public class RayCloudExampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RayCloudExampleProviderApplication.class, args);
    }
}
