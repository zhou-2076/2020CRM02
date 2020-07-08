package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class XsDetail implements Serializable {
    private Long saleDetailId;

    private Long saleId;

    private Long goodId;

    private Long goodNum;

    private BigDecimal goodPrice;

    private String saleDetailRemark;

    private Long companyId;

    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XsDetail(Long saleDetailId, Long saleId, Long goodId, Long goodNum, BigDecimal goodPrice, String saleDetailRemark, Long companyId, Date lastModifyDate) {
        this.saleDetailId = saleDetailId;
        this.saleId = saleId;
        this.goodId = goodId;
        this.goodNum = goodNum;
        this.goodPrice = goodPrice;
        this.saleDetailRemark = saleDetailRemark;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XsDetail() {
        super();
    }

    public Long getSaleDetailId() {
        return saleDetailId;
    }

    public void setSaleDetailId(Long saleDetailId) {
        this.saleDetailId = saleDetailId;
    }

    public Long getSaleId() {
        return saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }

    public Long getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Long goodNum) {
        this.goodNum = goodNum;
    }

    public BigDecimal getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(BigDecimal goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getSaleDetailRemark() {
        return saleDetailRemark;
    }

    public void setSaleDetailRemark(String saleDetailRemark) {
        this.saleDetailRemark = saleDetailRemark == null ? null : saleDetailRemark.trim();
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