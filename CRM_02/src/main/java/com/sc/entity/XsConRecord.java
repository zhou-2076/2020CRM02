package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class XsConRecord implements Serializable {
    private Long conRecordId;

    private String conTheme;

    private Date conTime;

    private Long customId;

    private String conContent;

    private Long companyId;

    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XsConRecord(Long conRecordId, String conTheme, Date conTime, Long customId, String conContent, Long companyId, Date lastModifyDate) {
        this.conRecordId = conRecordId;
        this.conTheme = conTheme;
        this.conTime = conTime;
        this.customId = customId;
        this.conContent = conContent;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XsConRecord() {
        super();
    }

    public Long getConRecordId() {
        return conRecordId;
    }

    public void setConRecordId(Long conRecordId) {
        this.conRecordId = conRecordId;
    }

    public String getConTheme() {
        return conTheme;
    }

    public void setConTheme(String conTheme) {
        this.conTheme = conTheme == null ? null : conTheme.trim();
    }

    public Date getConTime() {
        return conTime;
    }

    public void setConTime(Date conTime) {
        this.conTime = conTime;
    }

    public Long getCustomId() {
        return customId;
    }

    public void setCustomId(Long customId) {
        this.customId = customId;
    }

    public String getConContent() {
        return conContent;
    }

    public void setConContent(String conContent) {
        this.conContent = conContent == null ? null : conContent.trim();
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