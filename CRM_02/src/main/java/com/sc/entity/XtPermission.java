package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XtPermission implements Serializable {
    private Long qxId;

    private String qxName;

    private String qx;

    private Long qxFlId;

    private String bz;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XtPermission(Long qxId, String qxName, String qx, Long qxFlId, String bz, Date lastModifyDate) {
        this.qxId = qxId;
        this.qxName = qxName;
        this.qx = qx;
        this.qxFlId = qxFlId;
        this.bz = bz;
        this.lastModifyDate = lastModifyDate;
    }

    public XtPermission() {
        super();
    }

    public Long getQxId() {
        return qxId;
    }

    public void setQxId(Long qxId) {
        this.qxId = qxId;
    }

    public String getQxName() {
        return qxName;
    }

    public void setQxName(String qxName) {
        this.qxName = qxName == null ? null : qxName.trim();
    }

    public String getQx() {
        return qx;
    }

    public void setQx(String qx) {
        this.qx = qx == null ? null : qx.trim();
    }

    public Long getQxFlId() {
        return qxFlId;
    }

    public void setQxFlId(Long qxFlId) {
        this.qxFlId = qxFlId;
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