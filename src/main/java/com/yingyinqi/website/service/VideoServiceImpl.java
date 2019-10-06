package com.yingyinqi.website.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yingyinqi.website.bean.entity.VideoList;
import com.yingyinqi.website.bean.request.VideoReq;
import com.yingyinqi.website.mapper.VideoListMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author: create by libin
 * @version: v1.0
 * @description: com.yingyinqi.website.service
 * @date:2019/9/21
 */
@Slf4j
@Service
public class VideoServiceImpl implements  VideoService{
    @Autowired
    private VideoListMapper videoMapper;
    @Override
    public PageInfo<VideoList> list(VideoReq req) {
        if (req.getPageNum()>0&&req.getPageSize()>0) {
            PageHelper.startPage(req.getPageNum(), req.getPageSize());
        }
        List<VideoList> list = videoMapper.list(req);
        return new PageInfo<>(list);
    }

    @Override
    public int add(VideoReq req) {
        req.setId(UUID.randomUUID().toString());
        req.setActive(1);
        return videoMapper.insert(req);
    }

    @Override
    public int delete(String id) {
        return videoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean update(VideoReq req) {
        if (req.getActive()==null) {
            req.setActive(1);
        }
        if (req.getCategory()==null) {
            req.setCategory(1);
        }
        if (videoMapper.updateByPrimaryKey(req)>0) {
            return true;
        }
        return false;
    }
}
