package com.ray.cloud.app.provider.client.service;

import com.ray.cloud.app.provider.client.fallback.ProviderFeignServiceFallback;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author yinrui
 * @version 1.0
 */
@FeignClient(value = "RAY-CLOUD-APP-EXAMPLE-PROVIDER", configuration = IProviderFeignService.Configuration.class, fallback = ProviderFeignServiceFallback.class)
public interface IProviderFeignService {

    @RequestMapping(value = "/service-provider/v1/message", method = RequestMethod.GET)
    String getMessage();

    class Configuration implements RequestInterceptor {

        private static Logger LOGGER = LoggerFactory.getLogger(IProviderFeignService.class);

        @Override
        public void apply(RequestTemplate template) {
            LOGGER.info("IProviderService Configuration apply template={}", template);
            template.header("appKey", "example_key");
        }

        @Bean
        public ProviderFeignServiceFallback fallback(){
            return new ProviderFeignServiceFallback();
        }
    }
}
