package com.yingyinqi.website.bean.dto;


import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

/**
 * @author: create by libin
 * @version: v1.0
 * @description: com.yingyinqi.website.bean
 * @date:2019/9/14
 */
@Data
public class TestDto {
    @NotBlank
    @Length(min=3, max=10,message = "长度不能小于3")
    private String name;
    private String value;
    /*@Email
    private String email;
    @NotBlank
    @Pattern(regexp="^((13[0-9])|(15[^4,\\D])|(18[0,3-9]))\\d{8}$", message="手机号格式不正确")
    private String phone;
    @Min(value=18)
    @Max(value = 200)
    private int age;*/
}
