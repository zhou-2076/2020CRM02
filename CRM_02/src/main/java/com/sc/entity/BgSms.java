package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class BgSms implements Serializable {
    private Long smsId;

    private String smsTitle;

    private String smsContent;

    private String smsSender;

    private Long companyId;

    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public BgSms(Long smsId, String smsTitle, String smsContent, String smsSender, Long companyId, Date lastModifyDate) {
        this.smsId = smsId;
        this.smsTitle = smsTitle;
        this.smsContent = smsContent;
        this.smsSender = smsSender;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public BgSms() {
        super();
    }

    public Long getSmsId() {
        return smsId;
    }

    public void setSmsId(Long smsId) {
        this.smsId = smsId;
    }

    public String getSmsTitle() {
        return smsTitle;
    }

    public void setSmsTitle(String smsTitle) {
        this.smsTitle = smsTitle == null ? null : smsTitle.trim();
    }

    public String getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent == null ? null : smsContent.trim();
    }

    public String getSmsSender() {
        return smsSender;
    }

    public void setSmsSender(String smsSender) {
        this.smsSender = smsSender == null ? null : smsSender.trim();
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
		return "BgSms [smsId=" + smsId + ", smsTitle=" + smsTitle + ", smsContent=" + smsContent + ", smsSender="
				+ smsSender + ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
}