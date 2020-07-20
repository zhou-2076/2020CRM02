package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XsOut implements Serializable {
    private Long saleId;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date makeSaleDate;

    private BigDecimal invoice;

    private Long userId;

    private Long customId;

    private BigDecimal saleAmount;

    private String saleOutStatus;

    private String rebate;

    private String orderStatus;

    private String outRemark;

    private Long companyId;
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    //扩展属性 用于制单日期范围查询
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemin;
    
    //扩展属性 用于制单日期范围查询
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemax;
    //生成它的set get方法-start
    public Date getDatemin() {
		return datemin;
	}

	public void setDatemin(Date datemin) {
		this.datemin = datemin;
	}

	public Date getDatemax() {
		return datemax;
	}

	public void setDatemax(Date datemax) {
		this.datemax = datemax;
	}//生成它的set get方法-end
    private static final long serialVersionUID = 1L;

    public XsOut(Long saleId, Date makeSaleDate, BigDecimal invoice, Long userId, Long customId, BigDecimal saleAmount, String saleOutStatus, String rebate, String orderStatus, String outRemark, Long companyId, Date lastModifyDate) {
        this.saleId = saleId;
        this.makeSaleDate = makeSaleDate;
        this.invoice = invoice;
        this.userId = userId;
        this.customId = customId;
        this.saleAmount = saleAmount;
        this.saleOutStatus = saleOutStatus;
        this.rebate = rebate;
        this.orderStatus = orderStatus;
        this.outRemark = outRemark;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XsOut() {
        super();
    }

    public Long getSaleId() {
        return saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public Date getMakeSaleDate() {
        return makeSaleDate;
    }

    public void setMakeSaleDate(Date makeSaleDate) {
        this.makeSaleDate = makeSaleDate;
    }

    public BigDecimal getInvoice() {
        return invoice;
    }

    public void setInvoice(BigDecimal invoice) {
        this.invoice = invoice;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCustomId() {
        return customId;
    }

    public void setCustomId(Long customId) {
        this.customId = customId;
    }

    public BigDecimal getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(BigDecimal saleAmount) {
        this.saleAmount = saleAmount;
    }

    public String getSaleOutStatus() {
        return saleOutStatus;
    }

    public void setSaleOutStatus(String saleOutStatus) {
        this.saleOutStatus = saleOutStatus == null ? null : saleOutStatus.trim();
    }

    public String getRebate() {
        return rebate;
    }

    public void setRebate(String rebate) {
        this.rebate = rebate == null ? null : rebate.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getOutRemark() {
        return outRemark;
    }

    public void setOutRemark(String outRemark) {
        this.outRemark = outRemark == null ? null : outRemark.trim();
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

	@Override
	public String toString() {
		return "XsOut [saleId=" + saleId + ", makeSaleDate=" + makeSaleDate + ", invoice=" + invoice + ", userId="
				+ userId + ", customId=" + customId + ", saleAmount=" + saleAmount + ", saleOutStatus=" + saleOutStatus
				+ ", rebate=" + rebate + ", orderStatus=" + orderStatus + ", outRemark=" + outRemark + ", companyId="
				+ companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
    
}