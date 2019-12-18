package com.ray.cloud.app.consumer.controller;

import com.ray.cloud.app.consumer.service.IConsumerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinrui
 * @version 1.0
 */
@RestController
@RequestMapping("/service-consumer/v1")
@Api(value = "/sampleAPI", description = "Sample API")
public class ConsumerController {

    @Autowired
    IConsumerService consumerService;

    @GetMapping(value = "/message")
    public String getMessage() {
        return consumerService.getMessage();
    }

    @GetMapping(value = "/provider/message")
    public String getProviderMessage() {
        return consumerService.getProviderMessage();
    }
}
