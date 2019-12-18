package com.ray.cloud.app.provider.controller;

import com.ray.cloud.app.provider.common.result.Result;
import com.ray.cloud.app.provider.model.ProviderModel;
import com.ray.cloud.app.provider.service.IProviderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yinrui
 * @version 1.0
 */
@RestController
@RequestMapping("/service-provider/v1")
@Api(value = "/sampleAPI", description = "Sample API")
public class ProviderController {

    @Autowired
    IProviderService providerService;

    @ApiOperation("get message")
    @GetMapping(value = "/message")
    public String getMessage() {
        return providerService.getMessage();
    }

    @ApiOperation("post message")
    @PostMapping(value = "/message")
    public Result<String> postMessage(@RequestBody String message) {
        Result result = new Result();

        String newMessage = providerService.postMessage(message);
        result.setCode(0);
        result.setData(newMessage);

        return result;
    }
}
