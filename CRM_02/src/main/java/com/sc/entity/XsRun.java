package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class XsRun implements Serializable {
    private Long runId;

    private Long customId;

    private Long operatorId;

    private String dealWay;

    private String dealMeasure;

    private String run;

    private Long companyId;

    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XsRun(Long runId, Long customId, Long operatorId, String dealWay, String dealMeasure, String run, Long companyId, Date lastModifyDate) {
        this.runId = runId;
        this.customId = customId;
        this.operatorId = operatorId;
        this.dealWay = dealWay;
        this.dealMeasure = dealMeasure;
        this.run = run;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XsRun() {
        super();
    }

    public Long getRunId() {
        return runId;
    }

    public void setRunId(Long runId) {
        this.runId = runId;
    }

    public Long getCustomId() {
        return customId;
    }

    public void setCustomId(Long customId) {
        this.customId = customId;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public String getDealWay() {
        return dealWay;
    }

    public void setDealWay(String dealWay) {
        this.dealWay = dealWay == null ? null : dealWay.trim();
    }

    public String getDealMeasure() {
        return dealMeasure;
    }

    public void setDealMeasure(String dealMeasure) {
        this.dealMeasure = dealMeasure == null ? null : dealMeasure.trim();
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run == null ? null : run.trim();
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