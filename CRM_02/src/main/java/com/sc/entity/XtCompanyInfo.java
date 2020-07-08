package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class XtCompanyInfo implements Serializable {
    private Long companyId;

    private String companyName;

    private String companyCode;

    private String emlil;

    private String liaison;

    private String companyAdd;

    private String tel;

    private String mp;

    private String fax;

    private String bankDeposit;

    private String bankAcc;

    private String effect;

    private String orderRemark;

    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XtCompanyInfo(Long companyId, String companyName, String companyCode, String emlil, String liaison, String companyAdd, String tel, String mp, String fax, String bankDeposit, String bankAcc, String effect, String orderRemark, Date lastModifyDate) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyCode = companyCode;
        this.emlil = emlil;
        this.liaison = liaison;
        this.companyAdd = companyAdd;
        this.tel = tel;
        this.mp = mp;
        this.fax = fax;
        this.bankDeposit = bankDeposit;
        this.bankAcc = bankAcc;
        this.effect = effect;
        this.orderRemark = orderRemark;
        this.lastModifyDate = lastModifyDate;
    }

    public XtCompanyInfo() {
        super();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getEmlil() {
        return emlil;
    }

    public void setEmlil(String emlil) {
        this.emlil = emlil == null ? null : emlil.trim();
    }

    public String getLiaison() {
        return liaison;
    }

    public void setLiaison(String liaison) {
        this.liaison = liaison == null ? null : liaison.trim();
    }

    public String getCompanyAdd() {
        return companyAdd;
    }

    public void setCompanyAdd(String companyAdd) {
        this.companyAdd = companyAdd == null ? null : companyAdd.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getMp() {
        return mp;
    }

    public void setMp(String mp) {
        this.mp = mp == null ? null : mp.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getBankDeposit() {
        return bankDeposit;
    }

    public void setBankDeposit(String bankDeposit) {
        this.bankDeposit = bankDeposit == null ? null : bankDeposit.trim();
    }

    public String getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(String bankAcc) {
        this.bankAcc = bankAcc == null ? null : bankAcc.trim();
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect == null ? null : effect.trim();
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

	@Override
	public String toString() {
		return "XtCompanyInfo [companyId=" + companyId + ", companyName=" + companyName + ", companyCode=" + companyCode
				+ ", emlil=" + emlil + ", liaison=" + liaison + ", companyAdd=" + companyAdd + ", tel=" + tel + ", mp="
				+ mp + ", fax=" + fax + ", bankDeposit=" + bankDeposit + ", bankAcc=" + bankAcc + ", effect=" + effect
				+ ", orderRemark=" + orderRemark + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
    
    
}