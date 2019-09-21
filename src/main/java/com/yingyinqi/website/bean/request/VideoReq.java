package com.yingyinqi.website.bean.request;

import com.yingyinqi.website.bean.entity.BaseEntity;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

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
    private String id;

    @NotBlank
    @Length(min=6,message = "长度不能小于6")
    private String videoUrl;

    @NotBlank
    @Length(min=6,message = "长度不能小于6")
    private String imgUrl;

    @NotBlank
    private String videoTitle;

    private String desc;

    private Integer active;

    private Integer category;
}
