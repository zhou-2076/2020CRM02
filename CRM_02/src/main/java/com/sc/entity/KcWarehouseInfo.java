package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class KcWarehouseInfo implements Serializable {
    private Long warehouseId;

    private String warehouseName;

    private String orderRemark;

    private Long companyId;

    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public KcWarehouseInfo(Long warehouseId, String warehouseName, String orderRemark, Long companyId, Date lastModifyDate) {
        this.warehouseId = warehouseId;
        this.warehouseName = warehouseName;
        this.orderRemark = orderRemark;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public KcWarehouseInfo() {
        super();
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName == null ? null : warehouseName.trim();
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
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