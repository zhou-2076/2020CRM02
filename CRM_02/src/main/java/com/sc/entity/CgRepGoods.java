package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class CgRepGoods implements Serializable {
	private Long cgRepId;

	private Long cpId;

	private Date jhDate;

	private String zt;

	private Long operaterId;

	private String bzXx;

	private Long companyId;

	private Date lastTime;

	// 一对一采购详情
	private CgOrderDetail cgOrderDetail;
	// 一对一库存详情
	private KcGoodsInfo kcGoodsInfo;
	// 拓展属性（公司名）
	private String compname;
	// 拓展属性（操作人名）
	private String czrname;
	

	private static final long serialVersionUID = 1L;

	public CgRepGoods(Long cgRepId, Long cpId, Date jhDate, String zt, Long operaterId, String bzXx, Long companyId,
			Date lastTime) {
		this.cgRepId = cgRepId;
		this.cpId = cpId;
		this.jhDate = jhDate;
		this.zt = zt;
		this.operaterId = operaterId;
		this.bzXx = bzXx;
		this.companyId = companyId;
		this.lastTime = lastTime;
	}

	public CgRepGoods() {
		super();
	}

	public String getCompname() {
		return compname;
	}

	public void setCompname(String compname) {
		this.compname = compname;
	}

	public String getCzrname() {
		return czrname;
	}

	public void setCzrname(String czrname) {
		this.czrname = czrname;
	}

	public KcGoodsInfo getKcGoodsInfo() {
		return kcGoodsInfo;
	}

	public void setKcGoodsInfo(KcGoodsInfo kcGoodsInfo) {
		this.kcGoodsInfo = kcGoodsInfo;
	}

	public CgOrderDetail getCgOrderDetail() {
		return cgOrderDetail;
	}

	public void setCgOrderDetail(CgOrderDetail cgOrderDetail) {
		this.cgOrderDetail = cgOrderDetail;
	}

	public Long getCgRepId() {
		return cgRepId;
	}

	public void setCgRepId(Long cgRepId) {
		this.cgRepId = cgRepId;
	}

	public Long getCpId() {
		return cpId;
	}

	public void setCpId(Long cpId) {
		this.cpId = cpId;
	}

	public Date getJhDate() {
		return jhDate;
	}

	public void setJhDate(Date jhDate) {
		this.jhDate = jhDate;
	}

	public String getZt() {
		return zt;
	}

	public void setZt(String zt) {
		this.zt = zt == null ? null : zt.trim();
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
		return "CgRepGoods [cgRepId=" + cgRepId + ", cpId=" + cpId + ", jhDate=" + jhDate + ", zt=" + zt
				+ ", operaterId=" + operaterId + ", bzXx=" + bzXx + ", companyId=" + companyId + ", lastTime="
				+ lastTime + ", cgOrderDetail=" + cgOrderDetail + ", kcGoodsInfo=" + kcGoodsInfo + ", compname="
				+ compname + ", czrname=" + czrname + "]";
	}

}