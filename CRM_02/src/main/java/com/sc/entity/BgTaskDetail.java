package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class BgTaskDetail implements Serializable {
    private Long taskDetailId;

    private Long taskId;

    private Long acceptUserId;

    private String whetherComplete;

    private String state;

    private Long companyId;

    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public BgTaskDetail(Long taskDetailId, Long taskId, Long acceptUserId, String whetherComplete, String state, Long companyId, Date lastModifyDate) {
        this.taskDetailId = taskDetailId;
        this.taskId = taskId;
        this.acceptUserId = acceptUserId;
        this.whetherComplete = whetherComplete;
        this.state = state;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public BgTaskDetail() {
        super();
    }

    public Long getTaskDetailId() {
        return taskDetailId;
    }

    public void setTaskDetailId(Long taskDetailId) {
        this.taskDetailId = taskDetailId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getAcceptUserId() {
        return acceptUserId;
    }

    public void setAcceptUserId(Long acceptUserId) {
        this.acceptUserId = acceptUserId;
    }

    public String getWhetherComplete() {
        return whetherComplete;
    }

    public void setWhetherComplete(String whetherComplete) {
        this.whetherComplete = whetherComplete == null ? null : whetherComplete.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}