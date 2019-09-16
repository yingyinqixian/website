package com.yingyinqi.website.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author: create by libin
 * @version: v1.0
 * @description: com.yingyinqi.website.mapper
 * @date:2019/9/14
 */
@Mapper
public interface TestMapper {

    String findName();
}
