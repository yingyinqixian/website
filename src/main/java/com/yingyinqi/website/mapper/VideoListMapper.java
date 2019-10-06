package com.yingyinqi.website.mapper;

import com.yingyinqi.website.bean.entity.VideoList;
import com.yingyinqi.website.bean.request.VideoReq;
import com.yingyinqi.website.commons.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoListMapper extends BaseMapper<VideoReq> {
    List<VideoList> list(VideoReq req);
}