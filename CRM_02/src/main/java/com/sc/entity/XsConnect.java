package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class XsConnect implements Serializable {
    private Long connectId;

    private Long customId;

    private String connectName;

    private String connectEname;

    private String position;

    private String depart;

    private BigDecimal mobilephone;

    private BigDecimal phoneOffice;

    private String email;

    private String connectAddress;

    private String connectRemark;

    private Long companyId;

    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XsConnect(Long connectId, Long customId, String connectName, String connectEname, String position, String depart, BigDecimal mobilephone, BigDecimal phoneOffice, String email, String connectAddress, String connectRemark, Long companyId, Date lastModifyDate) {
        this.connectId = connectId;
        this.customId = customId;
        this.connectName = connectName;
        this.connectEname = connectEname;
        this.position = position;
        this.depart = depart;
        this.mobilephone = mobilephone;
        this.phoneOffice = phoneOffice;
        this.email = email;
        this.connectAddress = connectAddress;
        this.connectRemark = connectRemark;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XsConnect() {
        super();
    }

    public Long getConnectId() {
        return connectId;
    }

    public void setConnectId(Long connectId) {
        this.connectId = connectId;
    }

    public Long getCustomId() {
        return customId;
    }

    public void setCustomId(Long customId) {
        this.customId = customId;
    }

    public String getConnectName() {
        return connectName;
    }

    public void setConnectName(String connectName) {
        this.connectName = connectName == null ? null : connectName.trim();
    }

    public String getConnectEname() {
        return connectEname;
    }

    public void setConnectEname(String connectEname) {
        this.connectEname = connectEname == null ? null : connectEname.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart == null ? null : depart.trim();
    }

    public BigDecimal getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(BigDecimal mobilephone) {
        this.mobilephone = mobilephone;
    }

    public BigDecimal getPhoneOffice() {
        return phoneOffice;
    }

    public void setPhoneOffice(BigDecimal phoneOffice) {
        this.phoneOffice = phoneOffice;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getConnectAddress() {
        return connectAddress;
    }

    public void setConnectAddress(String connectAddress) {
        this.connectAddress = connectAddress == null ? null : connectAddress.trim();
    }

    public String getConnectRemark() {
        return connectRemark;
    }

    public void setConnectRemark(String connectRemark) {
        this.connectRemark = connectRemark == null ? null : connectRemark.trim();
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