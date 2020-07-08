package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class BgSmsDetail implements Serializable {
    private Long detaileId;

    private Long smsId;

    private Long receiverId;

    private String informationState;

    private Long companyId;

    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public BgSmsDetail(Long detaileId, Long smsId, Long receiverId, String informationState, Long companyId, Date lastModifyDate) {
        this.detaileId = detaileId;
        this.smsId = smsId;
        this.receiverId = receiverId;
        this.informationState = informationState;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public BgSmsDetail() {
        super();
    }

    public Long getDetaileId() {
        return detaileId;
    }

    public void setDetaileId(Long detaileId) {
        this.detaileId = detaileId;
    }

    public Long getSmsId() {
        return smsId;
    }

    public void setSmsId(Long smsId) {
        this.smsId = smsId;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public String getInformationState() {
        return informationState;
    }

    public void setInformationState(String informationState) {
        this.informationState = informationState == null ? null : informationState.trim();
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