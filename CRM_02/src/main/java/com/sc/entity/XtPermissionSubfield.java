package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class XtPermissionSubfield implements Serializable {
    private Long qxFlId;

    private String flName;

    private String bz;

    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XtPermissionSubfield(Long qxFlId, String flName, String bz, Date lastModifyDate) {
        this.qxFlId = qxFlId;
        this.flName = flName;
        this.bz = bz;
        this.lastModifyDate = lastModifyDate;
    }

    public XtPermissionSubfield() {
        super();
    }

    public Long getQxFlId() {
        return qxFlId;
    }

    public void setQxFlId(Long qxFlId) {
        this.qxFlId = qxFlId;
    }

    public String getFlName() {
        return flName;
    }

    public void setFlName(String flName) {
        this.flName = flName == null ? null : flName.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}