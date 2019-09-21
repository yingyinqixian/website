package com.yingyinqi.website.bean.entity;

/**
 * @author: create by libin
 * @version: v1.0
 * @description: com.yingyinqi.website.bean.entity
 * @date:2019/9/21
 */
public class BaseEntity {
    private int pageSize=20;
    private int pageNum=1;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                '}';
    }
}
