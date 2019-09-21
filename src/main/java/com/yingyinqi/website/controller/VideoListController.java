package com.yingyinqi.website.controller;

import com.yingyinqi.website.bean.request.VideoReq;
import com.yingyinqi.website.commons.CommonResult;
import com.yingyinqi.website.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author: create by libin
 * @version: v1.0
 * @description: com.yingyinqi.website.controller
 * @date:2019/9/21
 */
@RequestMapping(value = "/video")
@RestController
public class VideoListController {
    @Autowired
    private VideoService videoService;
    @PostMapping(value = "/list")
    public CommonResult list(VideoReq req){
       return CommonResult.success(videoService.list(req));
    }
    @PostMapping(value = "/add")
    public CommonResult add(@Valid VideoReq req){
        if (videoService.add(req)>0) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

}
