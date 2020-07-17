package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XtJournal implements Serializable {
    private Long journalId;

    private Long userId;

    private String ip;

    private String qx;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date fwdate;

    private Long companyId;

    private static final long serialVersionUID = 1L;

    public XtJournal(Long journalId, Long userId, String ip, String qx, Date fwdate, Long companyId) {
        this.journalId = journalId;
        this.userId = userId;
        this.ip = ip;
        this.qx = qx;
        this.fwdate = fwdate;
        this.companyId = companyId;
    }

    public XtJournal() {
        super();
    }

    public Long getJournalId() {
        return journalId;
    }

    public void setJournalId(Long journalId) {
        this.journalId = journalId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getQx() {
        return qx;
    }

    public void setQx(String qx) {
        this.qx = qx == null ? null : qx.trim();
    }

    public Date getFwdate() {
        return fwdate;
    }

    public void setFwdate(Date fwdate) {
        this.fwdate = fwdate;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

	@Override
	public String toString() {
		return "XtJournal [journalId=" + journalId + ", userId=" + userId + ", ip=" + ip + ", qx=" + qx + ", fwdate="
				+ fwdate + ", companyId=" + companyId + "]";
	}
    
}