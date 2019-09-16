package com.yingyinqi.website.controller;

import com.yingyinqi.website.bean.TestDto;
import com.yingyinqi.website.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author: create by libin
 * @version: v1.0
 * @description: com.yingyinqi.website.controller
 * @date:2019/9/14
 */

@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @PostMapping(value = "/test")
    public String testMybatis(@Valid @RequestBody TestDto testDto){
       String name = testService.findName();
       return name;
    }
}
