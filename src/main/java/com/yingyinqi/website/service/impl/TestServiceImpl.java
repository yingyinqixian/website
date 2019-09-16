package com.yingyinqi.website.service.impl;

import com.yingyinqi.website.mapper.TestMapper;
import com.yingyinqi.website.service.TestService;
import com.yingyinqi.website.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: create by libin
 * @version: v1.0
 * @description: com.yingyinqi.website.service.impl
 * @date:2019/9/14
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper ;
    @Autowired
    private RedisUtil redisUtil;
    @Override
    public String findName() {
        redisUtil.set("libin",18);
        return testMapper.findName();
    }
}
