package com.sc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CgOrder implements Serializable {
    private Long cgId;

    private String cgTitle;

    private Date cgDate;

    private Long gysId;

    private Long dkJe;

    private Long fpNumber;

    private String fkQk;

    private String cgJz;

    private Date jhDate;

    private String jhAddress;

    private String jhFs;

    private Long operaterId;

    private String bzXx;
    
    private List<CgOrderDetail>  cgOrderDetail;

    private Long companyId;

    private Date lastTime;

    private static final long serialVersionUID = 1L;

    public CgOrder(Long cgId, String cgTitle, Date cgDate, Long gysId, Long dkJe, Long fpNumber, String fkQk, String cgJz, Date jhDate, String jhAddress, String jhFs, Long operaterId, String bzXx, Long companyId, Date lastTime) {
        this.cgId = cgId;
        this.cgTitle = cgTitle;
        this.cgDate = cgDate;
        this.gysId = gysId;
        this.dkJe = dkJe;
        this.fpNumber = fpNumber;
        this.fkQk = fkQk;
        this.cgJz = cgJz;
        this.jhDate = jhDate;
        this.jhAddress = jhAddress;
        this.jhFs = jhFs;
        this.operaterId = operaterId;
        this.bzXx = bzXx;
        this.companyId = companyId;
        this.lastTime = lastTime;
    }

    public CgOrder() {
        super();
    }

     
    
    public List<CgOrderDetail> getCgOrderDetail() {
		return cgOrderDetail;
	}

	public void setCgOrderDetail(List<CgOrderDetail> cgOrderDetail) {
		this.cgOrderDetail = cgOrderDetail;
	}

	public Long getCgId() {
        return cgId;
    }

    public void setCgId(Long cgId) {
        this.cgId = cgId;
    }

    public String getCgTitle() {
        return cgTitle;
    }

    public void setCgTitle(String cgTitle) {
        this.cgTitle = cgTitle == null ? null : cgTitle.trim();
    }

    public Date getCgDate() {
        return cgDate;
    }

    public void setCgDate(Date cgDate) {
        this.cgDate = cgDate;
    }

    public Long getGysId() {
        return gysId;
    }

    public void setGysId(Long gysId) {
        this.gysId = gysId;
    }

    public Long getDkJe() {
        return dkJe;
    }

    public void setDkJe(Long dkJe) {
        this.dkJe = dkJe;
    }

    public Long getFpNumber() {
        return fpNumber;
    }

    public void setFpNumber(Long fpNumber) {
        this.fpNumber = fpNumber;
    }

    public String getFkQk() {
        return fkQk;
    }

    public void setFkQk(String fkQk) {
        this.fkQk = fkQk == null ? null : fkQk.trim();
    }

    public String getCgJz() {
        return cgJz;
    }

    public void setCgJz(String cgJz) {
        this.cgJz = cgJz == null ? null : cgJz.trim();
    }

    public Date getJhDate() {
        return jhDate;
    }

    public void setJhDate(Date jhDate) {
        this.jhDate = jhDate;
    }

    public String getJhAddress() {
        return jhAddress;
    }

    public void setJhAddress(String jhAddress) {
        this.jhAddress = jhAddress == null ? null : jhAddress.trim();
    }

    public String getJhFs() {
        return jhFs;
    }

    public void setJhFs(String jhFs) {
        this.jhFs = jhFs == null ? null : jhFs.trim();
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
		return "CgOrder [cgId=" + cgId + ", cgTitle=" + cgTitle + ", cgDate=" + cgDate + ", gysId=" + gysId + ", dkJe="
				+ dkJe + ", fpNumber=" + fpNumber + ", fkQk=" + fkQk + ", cgJz=" + cgJz + ", jhDate=" + jhDate
				+ ", jhAddress=" + jhAddress + ", jhFs=" + jhFs + ", operaterId=" + operaterId + ", bzXx=" + bzXx
				+ ", cgOrderDetail=" + cgOrderDetail + ", companyId=" + companyId + ", lastTime=" + lastTime + "]";
	}


    
    
}