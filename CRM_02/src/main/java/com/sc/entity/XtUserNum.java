package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class XtUserNum implements Serializable {
	private Long userId;

	private String userName;

	private String userCode;

	private Long staffId;

	private Long companyId;

	private String accountStatus;

	private Date lastModifyDate;

	/* 显示在主页的个人数据不要删 */
	// 公司id
	private Long gsid;
	// 公司名称
	private String gsmc;
	// 操作人id
	private Long czrid;
	// 操作人名字
	private String czrmc;
	// 职务id
	private Long zwid;
	// 职务名称
	private String zwmc;
	// 部门id
	private Long bmid;
	// 部门名称
	private String bmmc;

	private static final long serialVersionUID = 1L;

	public XtUserNum(Long userId, String userName, String userCode, Long staffId, Long companyId, String accountStatus,
			Date lastModifyDate) {
		this.userId = userId;
		this.userName = userName;
		this.userCode = userCode;
		this.staffId = staffId;
		this.companyId = companyId;
		this.accountStatus = accountStatus;
		this.lastModifyDate = lastModifyDate;
	}

	public XtUserNum() {
		super();
	}

	public Long getGsid() {
		return gsid;
	}

	public void setGsid(Long gsid) {
		this.gsid = gsid;
	}

	public String getGsmc() {
		return gsmc;
	}

	public void setGsmc(String gsmc) {
		this.gsmc = gsmc;
	}

	public Long getCzrid() {
		return czrid;
	}

	public void setCzrid(Long czrid) {
		this.czrid = czrid;
	}

	public String getCzrmc() {
		return czrmc;
	}

	public void setCzrmc(String czrmc) {
		this.czrmc = czrmc;
	}

	public Long getZwid() {
		return zwid;
	}

	public void setZwid(Long zwid) {
		this.zwid = zwid;
	}

	

	public String getZwmc() {
		return zwmc;
	}

	public void setZwmc(String zwmc) {
		this.zwmc = zwmc;
	}

	public Long getBmid() {
		return bmid;
	}

	public void setBmid(Long bmid) {
		this.bmid = bmid;
	}

	public String getBmmc() {
		return bmmc;
	}

	public void setBmmc(String bmmc) {
		this.bmmc = bmmc;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode == null ? null : userCode.trim();
	}

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus == null ? null : accountStatus.trim();
	}

	public Date getLastModifyDate() {
		return lastModifyDate;
	}

	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}

	@Override
	public String toString() {
		return "XtUserNum [userId=" + userId + ", userName=" + userName + ", userCode=" + userCode + ", staffId="
				+ staffId + ", companyId=" + companyId + ", accountStatus=" + accountStatus + ", lastModifyDate="
				+ lastModifyDate + ", gsid=" + gsid + ", gsmc=" + gsmc + ", czrid=" + czrid + ", czrmc=" + czrmc
				+ ", zwid=" + zwid + ", zwmc=" + zwmc + ", bmid=" + bmid + ", bmmc=" + bmmc + "]";
	}

	

}