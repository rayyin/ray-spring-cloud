package com.ray.cloud.app.provider.service.impl;

import com.ray.cloud.app.provider.service.IProviderService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author yinrui
 * @version 1.0
 */
@Service
public class ProviderServiceImpl implements IProviderService {

    @Override
    public String getMessage() {
        return "I am service provider";
    }


    @Override
    public String postMessage(String message) {
        String newMsg = null;
        if (StringUtils.isEmpty(message)) {
            newMsg = "unknown";
        } else {
            newMsg = "hello " +  message;
        }

        return newMsg;
    }
}
