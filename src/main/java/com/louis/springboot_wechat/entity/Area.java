package com.louis.springboot_wechat.entity;

import java.util.Date;

public class Area {
    // 主键ID
    private Integer areaId;
    // 名称
    private String areaName;
    // 权重
    private Integer priority;

    public Integer getAreaId() {
        return areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    // 创建时间
    private Date createTime;
    // 修改时间
    private Date lastEditTime;
}
