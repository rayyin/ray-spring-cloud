package com.ray.cloud.app.provider.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author yinrui
 * @version 1.0
 */
@Data
public class ProviderModel {

    @ApiModelProperty(value = "Id")
    private Long id;

    @ApiModelProperty(value = "Name")
    private String name;
}
