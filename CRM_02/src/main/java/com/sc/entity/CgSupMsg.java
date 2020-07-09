package com.sc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CgSupMsg implements Serializable {
	private Long gysId;

	private String gysName;

	private String gysShortName;

	private String lxr;

	private Long tel;

	private Long moblePhone;

	private Long cz;

	private String address;

	private Long yb;

	private String emil;

	private String khYh;

	private Long yhZh;

	private String companyZy;

	private String sfYx;

	private Long operaterId;

	private String bzXx;

	private Long companyId;

	private Date lastTime;

	// 公司信息
	private List<XtCompanyInfo> xtCompanyInfo;
	// 用户信息
	private XtUserInfo xtUserInfo;
	// 公司名称
	private String compname;

	private static final long serialVersionUID = 1L;

	public CgSupMsg(Long gysId, String gysName, String gysShortName, String lxr, Long tel, Long moblePhone, Long cz,
			String address, Long yb, String emil, String khYh, Long yhZh, String companyZy, String sfYx,
			Long operaterId, String bzXx, Long companyId, Date lastTime) {
		this.gysId = gysId;
		this.gysName = gysName;
		this.gysShortName = gysShortName;
		this.lxr = lxr;
		this.tel = tel;
		this.moblePhone = moblePhone;
		this.cz = cz;
		this.address = address;
		this.yb = yb;
		this.emil = emil;
		this.khYh = khYh;
		this.yhZh = yhZh;
		this.companyZy = companyZy;
		this.sfYx = sfYx;
		this.operaterId = operaterId;
		this.bzXx = bzXx;
		this.companyId = companyId;
		this.lastTime = lastTime;
	}

	public CgSupMsg() {
		super();
	}

	public String getCompname() {
		return compname;
	}

	public void setCompname(String compname) {
		this.compname = compname;
	}

	public XtUserInfo getXtUserInfo() {
		return xtUserInfo;
	}

	public void setXtUserInfo(XtUserInfo xtUserInfo) {
		this.xtUserInfo = xtUserInfo;
	}

	public List<XtCompanyInfo> getXtCompanyInfo() {
		return xtCompanyInfo;
	}

	public void setXtCompanyInfo(List<XtCompanyInfo> xtCompanyInfo) {
		this.xtCompanyInfo = xtCompanyInfo;
	}

	public Long getGysId() {
		return gysId;
	}

	public void setGysId(Long gysId) {
		this.gysId = gysId;
	}

	public String getGysName() {
		return gysName;
	}

	public void setGysName(String gysName) {
		this.gysName = gysName == null ? null : gysName.trim();
	}

	public String getGysShortName() {
		return gysShortName;
	}

	public void setGysShortName(String gysShortName) {
		this.gysShortName = gysShortName == null ? null : gysShortName.trim();
	}

	public String getLxr() {
		return lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr == null ? null : lxr.trim();
	}

	public Long getTel() {
		return tel;
	}

	public void setTel(Long tel) {
		this.tel = tel;
	}

	public Long getMoblePhone() {
		return moblePhone;
	}

	public void setMoblePhone(Long moblePhone) {
		this.moblePhone = moblePhone;
	}

	public Long getCz() {
		return cz;
	}

	public void setCz(Long cz) {
		this.cz = cz;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public Long getYb() {
		return yb;
	}

	public void setYb(Long yb) {
		this.yb = yb;
	}

	public String getEmil() {
		return emil;
	}

	public void setEmil(String emil) {
		this.emil = emil == null ? null : emil.trim();
	}

	public String getKhYh() {
		return khYh;
	}

	public void setKhYh(String khYh) {
		this.khYh = khYh == null ? null : khYh.trim();
	}

	public Long getYhZh() {
		return yhZh;
	}

	public void setYhZh(Long yhZh) {
		this.yhZh = yhZh;
	}

	public String getCompanyZy() {
		return companyZy;
	}

	public void setCompanyZy(String companyZy) {
		this.companyZy = companyZy == null ? null : companyZy.trim();
	}

	public String getSfYx() {
		return sfYx;
	}

	public void setSfYx(String sfYx) {
		this.sfYx = sfYx == null ? null : sfYx.trim();
	}

	public Long getOperaterId() {
		return operaterId;
	}

	public void setOperaterId(Long operaterId) {
		this.operaterId = operaterId;
	}

	public String getBzXx() {
		return bzXx;
	}

	public void setBzXx(String bzXx) {
		this.bzXx = bzXx == null ? null : bzXx.trim();
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	@Override
	public String toString() {
		return "CgSupMsg [gysId=" + gysId + ", gysName=" + gysName + ", gysShortName=" + gysShortName + ", lxr=" + lxr
				+ ", tel=" + tel + ", moblePhone=" + moblePhone + ", cz=" + cz + ", address=" + address + ", yb=" + yb
				+ ", emil=" + emil + ", khYh=" + khYh + ", yhZh=" + yhZh + ", companyZy=" + companyZy + ", sfYx=" + sfYx
				+ ", operaterId=" + operaterId + ", bzXx=" + bzXx + ", companyId=" + companyId + ", lastTime="
				+ lastTime + ", xtCompanyInfo=" + xtCompanyInfo + ", xtUserInfo=" + xtUserInfo + ", compname="
				+ compname + "]";
	}

}