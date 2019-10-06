package com.yingyinqi.website.bean.request;

import com.yingyinqi.website.bean.entity.BaseEntity;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 * @author: create by libin
 * @version: v1.0
 * @description: com.yingyinqi.website.bean.request
 * @date:2019/9/21
 */
@Data
@Table(name="video_list")
public class VideoReq extends BaseEntity {
    @Id
    private String id;

    @NotBlank
    @Length(min=6,message = "长度不能小于6")
    private String videoUrl;// 视频url

    @NotBlank
    @Length(min=6,message = "长度不能小于6")
    private String imgUrl;// 封面图片

    @NotBlank
    private String videoTitle;// 视频标题

    private String description;// 视频描述

    private Integer active;// 是否有效，0无效，1有效

    private Integer category;// 类别，如喜剧，动作

}
