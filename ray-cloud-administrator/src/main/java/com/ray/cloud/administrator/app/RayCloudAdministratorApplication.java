package com.ray.cloud.administrator.app;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author yinrui
 * @version 1.0
 */
@EnableAdminServer
@Configuration
@EnableEurekaClient
@ServletComponentScan
@SpringBootApplication(scanBasePackages = "com.ray.cloud.administrator")
public class RayCloudAdministratorApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RayCloudAdministratorApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(RayCloudAdministratorApplication.class, args);
    }
}
