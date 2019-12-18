package com.ray.cloud.app.provider.client.fallback;

import com.ray.cloud.app.provider.client.service.IProviderFeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author yinrui
 * @version 1.0
 */
@Component
public class ProviderFeignServiceFallback implements IProviderFeignService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProviderFeignServiceFallback.class);

    @Override
    public String getMessage() {
        return "ProviderFeignServiceFallback getMessage fallback";
    }

}
