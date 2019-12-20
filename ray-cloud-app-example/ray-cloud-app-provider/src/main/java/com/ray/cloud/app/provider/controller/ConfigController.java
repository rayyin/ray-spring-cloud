package com.ray.cloud.app.provider.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinrui
 * @version 1.0
 */
@RestController
@RequestMapping("/service-provider/v1")
@Api(value = "/sampleConfigAPI", description = "Sample Config API")
public class ConfigController {

    @Value("${test_key}")
    private String testValue;

    @ApiOperation("get config property")
    @GetMapping(value = "/config")
    public String getConfig() {
        return testValue;
    }
}
