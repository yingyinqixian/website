package com.yingyinqi.website.service;

import com.github.pagehelper.PageInfo;
import com.yingyinqi.website.bean.entity.VideoList;
import com.yingyinqi.website.bean.request.VideoReq;

/**
 * @author: create by libin
 * @version: v1.0
 * @description: com.yingyinqi.website.service
 * @date:2019/9/21
 */
public interface VideoService {
    PageInfo<VideoList> list(VideoReq req);

    int add(VideoReq req);
}
