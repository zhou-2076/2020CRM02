package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class XsFeedback implements Serializable {
    private Long feedbackId;

    private Long prior;

    private Long customId;

    private String feedbackStatus;

    private String feedbackType;

    private Date feedbackTime;

    private String feedbackReason;

    private String principal;

    private String feedbackSource;

    private String feedbackTheme;

    private String analyse;

    private Long companyId;

    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XsFeedback(Long feedbackId, Long prior, Long customId, String feedbackStatus, String feedbackType, Date feedbackTime, String feedbackReason, String principal, String feedbackSource, String feedbackTheme, String analyse, Long companyId, Date lastModifyDate) {
        this.feedbackId = feedbackId;
        this.prior = prior;
        this.customId = customId;
        this.feedbackStatus = feedbackStatus;
        this.feedbackType = feedbackType;
        this.feedbackTime = feedbackTime;
        this.feedbackReason = feedbackReason;
        this.principal = principal;
        this.feedbackSource = feedbackSource;
        this.feedbackTheme = feedbackTheme;
        this.analyse = analyse;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XsFeedback() {
        super();
    }

    public Long getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Long feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Long getPrior() {
        return prior;
    }

    public void setPrior(Long prior) {
        this.prior = prior;
    }

    public Long getCustomId() {
        return customId;
    }

    public void setCustomId(Long customId) {
        this.customId = customId;
    }

    public String getFeedbackStatus() {
        return feedbackStatus;
    }

    public void setFeedbackStatus(String feedbackStatus) {
        this.feedbackStatus = feedbackStatus == null ? null : feedbackStatus.trim();
    }

    public String getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType == null ? null : feedbackType.trim();
    }

    public Date getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Date feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    public String getFeedbackReason() {
        return feedbackReason;
    }

    public void setFeedbackReason(String feedbackReason) {
        this.feedbackReason = feedbackReason == null ? null : feedbackReason.trim();
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getFeedbackSource() {
        return feedbackSource;
    }

    public void setFeedbackSource(String feedbackSource) {
        this.feedbackSource = feedbackSource == null ? null : feedbackSource.trim();
    }

    public String getFeedbackTheme() {
        return feedbackTheme;
    }

    public void setFeedbackTheme(String feedbackTheme) {
        this.feedbackTheme = feedbackTheme == null ? null : feedbackTheme.trim();
    }

    public String getAnalyse() {
        return analyse;
    }

    public void setAnalyse(String analyse) {
        this.analyse = analyse == null ? null : analyse.trim();
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