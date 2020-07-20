package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BgAssessTask implements Serializable {
    private Long taskId;

    private String taskTitle;

    private String taskSpecificContrnt;

    private String taskPromulgator;

    private String assessIndex;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date taskStartTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date taskFinishTime;

    private Long companyId;

    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;
    
    private BgTaskDetail bgTaskDetail;
    
    //一对一配置

    public BgTaskDetail getBgTaskDetail() {
		return bgTaskDetail;
	}

	public void setBgTaskDetail(BgTaskDetail bgTaskDetail) {
		this.bgTaskDetail = bgTaskDetail;
	}

	//
	
	public BgAssessTask(Long taskId, String taskTitle, String taskSpecificContrnt, String taskPromulgator, String assessIndex, Date taskStartTime, Date taskFinishTime, Long companyId, Date lastModifyDate) {
        this.taskId = taskId;
        this.taskTitle = taskTitle;
        this.taskSpecificContrnt = taskSpecificContrnt;
        this.taskPromulgator = taskPromulgator;
        this.assessIndex = assessIndex;
        this.taskStartTime = taskStartTime;
        this.taskFinishTime = taskFinishTime;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public BgAssessTask() {
        super();
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle == null ? null : taskTitle.trim();
    }

    public String getTaskSpecificContrnt() {
        return taskSpecificContrnt;
    }

    public void setTaskSpecificContrnt(String taskSpecificContrnt) {
        this.taskSpecificContrnt = taskSpecificContrnt == null ? null : taskSpecificContrnt.trim();
    }

    public String getTaskPromulgator() {
        return taskPromulgator;
    }

    public void setTaskPromulgator(String taskPromulgator) {
        this.taskPromulgator = taskPromulgator == null ? null : taskPromulgator.trim();
    }

    public String getAssessIndex() {
        return assessIndex;
    }

    public void setAssessIndex(String assessIndex) {
        this.assessIndex = assessIndex == null ? null : assessIndex.trim();
    }

    public Date getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    public Date getTaskFinishTime() {
        return taskFinishTime;
    }

    public void setTaskFinishTime(Date taskFinishTime) {
        this.taskFinishTime = taskFinishTime;
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

	@Override
	public String toString() {
		return "BgAssessTask [taskId=" + taskId + ", taskTitle=" + taskTitle + ", taskSpecificContrnt="
				+ taskSpecificContrnt + ", taskPromulgator=" + taskPromulgator + ", assessIndex=" + assessIndex
				+ ", taskStartTime=" + taskStartTime + ", taskFinishTime=" + taskFinishTime + ", companyId=" + companyId
				+ ", lastModifyDate=" + lastModifyDate + ", bgTaskDetail=" + bgTaskDetail + "]";
	}
    
    
}