package com.yingyinqi.website.bean.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class VideoList extends BaseEntity {
    private String id;

    private String videoUrl;

    private String imgUrl;

    private String videoTitle;

    private String desc;

    private Integer active;

    private Integer category;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private String createBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    private String updateBy;

}