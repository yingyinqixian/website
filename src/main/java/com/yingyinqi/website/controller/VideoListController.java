package com.yingyinqi.website.controller;

import com.yingyinqi.website.bean.request.VideoReq;
import com.yingyinqi.website.commons.CommonResult;
import com.yingyinqi.website.service.VideoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public CommonResult list(@RequestBody VideoReq req){
       return CommonResult.success(videoService.list(req));
    }

    @PostMapping(value = "/add")
    public CommonResult add(@Valid @RequestBody VideoReq req){
        if (videoService.add(req)>0) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

    @DeleteMapping(value = "/delete/{id}")
    public CommonResult delete(@PathVariable String id){
        if (StringUtils.isBlank(id)) {
            return CommonResult.failed("id不能为空");
        }
        if (videoService.delete(id)>0) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }

    @PutMapping(value = "/update")
    public CommonResult update(@Valid @RequestBody VideoReq req){
        if (StringUtils.isBlank(req.getId())) {
            return CommonResult.failed("id不能为空");
        }
        if (videoService.update(req)) {
            return CommonResult.success();
        }
        return CommonResult.failed();
    }
}
