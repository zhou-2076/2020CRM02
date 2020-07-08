package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class BgPersonageSchedule implements Serializable {
    private Long scheduleArrangeId;

    private String arrangeCategory;

    private String arrangeTheme;

    private Date startDate;

    private Date startTime;

    private Long fillPersommelId;

    private String arrangeDescribe;

    private Long companyId;

    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public BgPersonageSchedule(Long scheduleArrangeId, String arrangeCategory, String arrangeTheme, Date startDate, Date startTime, Long fillPersommelId, String arrangeDescribe, Long companyId, Date lastModifyDate) {
        this.scheduleArrangeId = scheduleArrangeId;
        this.arrangeCategory = arrangeCategory;
        this.arrangeTheme = arrangeTheme;
        this.startDate = startDate;
        this.startTime = startTime;
        this.fillPersommelId = fillPersommelId;
        this.arrangeDescribe = arrangeDescribe;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public BgPersonageSchedule() {
        super();
    }

    public Long getScheduleArrangeId() {
        return scheduleArrangeId;
    }

    public void setScheduleArrangeId(Long scheduleArrangeId) {
        this.scheduleArrangeId = scheduleArrangeId;
    }

    public String getArrangeCategory() {
        return arrangeCategory;
    }

    public void setArrangeCategory(String arrangeCategory) {
        this.arrangeCategory = arrangeCategory == null ? null : arrangeCategory.trim();
    }

    public String getArrangeTheme() {
        return arrangeTheme;
    }

    public void setArrangeTheme(String arrangeTheme) {
        this.arrangeTheme = arrangeTheme == null ? null : arrangeTheme.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Long getFillPersommelId() {
        return fillPersommelId;
    }

    public void setFillPersommelId(Long fillPersommelId) {
        this.fillPersommelId = fillPersommelId;
    }

    public String getArrangeDescribe() {
        return arrangeDescribe;
    }

    public void setArrangeDescribe(String arrangeDescribe) {
        this.arrangeDescribe = arrangeDescribe == null ? null : arrangeDescribe.trim();
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