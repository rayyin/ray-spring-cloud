package com.ray.cloud.app.consumer.service.impl;

import com.ray.cloud.app.consumer.service.IConsumerService;
import com.ray.cloud.app.provider.client.service.IProviderFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yinrui
 * @version 1.0
 */
@Service
public class ConsumerServiceImpl implements IConsumerService {

    @Resource
    IProviderFeignService providerFeignService;

    @Override
    public String getMessage() {
        return "I am service consumer";
    }

    @Override
    public String getProviderMessage() {
        String providerTest = providerFeignService.getMessage();
        return providerTest;
    }


}
