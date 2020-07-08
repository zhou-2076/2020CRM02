package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class BgAssessIndex implements Serializable {
    private Long indexId;

    private String assessIndex;

    private String remark;

    private Long companyId;

    private Date lastModifyDtae;

    private static final long serialVersionUID = 1L;

    public BgAssessIndex(Long indexId, String assessIndex, String remark, Long companyId, Date lastModifyDtae) {
        this.indexId = indexId;
        this.assessIndex = assessIndex;
        this.remark = remark;
        this.companyId = companyId;
        this.lastModifyDtae = lastModifyDtae;
    }

    public BgAssessIndex() {
        super();
    }

    public Long getIndexId() {
        return indexId;
    }

    public void setIndexId(Long indexId) {
        this.indexId = indexId;
    }

    public String getAssessIndex() {
        return assessIndex;
    }

    public void setAssessIndex(String assessIndex) {
        this.assessIndex = assessIndex == null ? null : assessIndex.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getLastModifyDtae() {
        return lastModifyDtae;
    }

    public void setLastModifyDtae(Date lastModifyDtae) {
        this.lastModifyDtae = lastModifyDtae;
    }
}