package com.shangke.springbootkkyp.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "用户类")
public class User {
    @ApiModelProperty(value = "用户id")
    private Long id;
    @ApiModelProperty(value = "用户手机号码")
    private String phone;
    @ApiModelProperty(value = "用户手机验证码")
    private String code;
    @ApiModelProperty(value = "授权编码")
    private String xxlSsoSessionid;

    public User(Long id,String phone, String code) {
        this.id = id;
        this.phone = phone;
        this.code = code;
    }

    public User() {
    }
}
