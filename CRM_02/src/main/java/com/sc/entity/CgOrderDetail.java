package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class CgOrderDetail implements Serializable {
	private Long cgXqId;

	private Long cgId;

	private Long cpId;

	private String cpName;

	private Long cpNum;

	private BigDecimal cpJg;

	private String sfRk;

	private Long operaterId;

	private String bzXx;

	private Long conpanyId;

	private Date lastTime;

	// 拓展属性
	private String czrmc;
	// 拓展属性
	private String comname;
	//拓展属性（采购单）
	private CgOrder cgOrder;
	//拓展属性（仓库）
	private List<KcWarehouseInfo> kcWarehouseInfo;

	private static final long serialVersionUID = 1L;

	public CgOrderDetail(Long cgXqId, Long cgId, Long cpId, String cpName, Long cpNum, BigDecimal cpJg, String sfRk,
			Long operaterId, String bzXx, Long conpanyId, Date lastTime) {
		this.cgXqId = cgXqId;
		this.cgId = cgId;
		this.cpId = cpId;
		this.cpName = cpName;
		this.cpNum = cpNum;
		this.cpJg = cpJg;
		this.sfRk = sfRk;
		this.operaterId = operaterId;
		this.bzXx = bzXx;
		this.conpanyId = conpanyId;
		this.lastTime = lastTime;
	}

	public CgOrderDetail() {
		super();
	}
	
	public List<KcWarehouseInfo> getKcWarehouseInfo() {
		return kcWarehouseInfo;
	}

	public void setKcWarehouseInfo(List<KcWarehouseInfo> kcWarehouseInfo) {
		this.kcWarehouseInfo = kcWarehouseInfo;
	}

	public CgOrder getCgOrder() {
		return cgOrder;
	}

	public void setCgOrder(CgOrder cgOrder) {
		this.cgOrder = cgOrder;
	}

	public String getCzrmc() {
		return czrmc;
	}

	public void setCzrmc(String czrmc) {
		this.czrmc = czrmc;
	}

	public String getComname() {
		return comname;
	}

	public void setComname(String comname) {
		this.comname = comname;
	}

	public Long getCgXqId() {
		return cgXqId;
	}

	public void setCgXqId(Long cgXqId) {
		this.cgXqId = cgXqId;
	}

	public Long getCgId() {
		return cgId;
	}

	public void setCgId(Long cgId) {
		this.cgId = cgId;
	}

	public Long getCpId() {
		return cpId;
	}

	public void setCpId(Long cpId) {
		this.cpId = cpId;
	}

	public String getCpName() {
		return cpName;
	}

	public void setCpName(String cpName) {
		this.cpName = cpName == null ? null : cpName.trim();
	}

	public Long getCpNum() {
		return cpNum;
	}

	public void setCpNum(Long cpNum) {
		this.cpNum = cpNum;
	}

	public BigDecimal getCpJg() {
		return cpJg;
	}

	public void setCpJg(BigDecimal cpJg) {
		this.cpJg = cpJg;
	}

	public String getSfRk() {
		return sfRk;
	}

	public void setSfRk(String sfRk) {
		this.sfRk = sfRk == null ? null : sfRk.trim();
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

	public Long getConpanyId() {
		return conpanyId;
	}

	public void setConpanyId(Long conpanyId) {
		this.conpanyId = conpanyId;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	@Override
	public String toString() {
		return "CgOrderDetail [cgXqId=" + cgXqId + ", cgId=" + cgId + ", cpId=" + cpId + ", cpName=" + cpName
				+ ", cpNum=" + cpNum + ", cpJg=" + cpJg + ", sfRk=" + sfRk + ", operaterId=" + operaterId + ", bzXx="
				+ bzXx + ", conpanyId=" + conpanyId + ", lastTime=" + lastTime + ", czrmc=" + czrmc + ", comname="
				+ comname + ", cgOrder=" + cgOrder + ", kcWarehouseInfo=" + kcWarehouseInfo + "]";
	}



}