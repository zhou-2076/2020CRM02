package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class XtUserInfo implements Serializable {
    private Long workerId;

    private String workerName;

    private String workerSex;

    private String workerPhoto;

    private String idCard;

    private String homeAdd;

    private String nowAdd;

    private String workerEdu;

    private String politics;

    private String school;

    private String workerTel;

    private String webRelation;

    private String webDeta;

    private String audIt;

    private Long dutiesId;

    private String workerSta;

    private String orderRemark;

    private Long companyId;

    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XtUserInfo(Long workerId, String workerName, String workerSex, String workerPhoto, String idCard, String homeAdd, String nowAdd, String workerEdu, String politics, String school, String workerTel, String webRelation, String webDeta, String audIt, Long dutiesId, String workerSta, String orderRemark, Long companyId, Date lastModifyDate) {
        this.workerId = workerId;
        this.workerName = workerName;
        this.workerSex = workerSex;
        this.workerPhoto = workerPhoto;
        this.idCard = idCard;
        this.homeAdd = homeAdd;
        this.nowAdd = nowAdd;
        this.workerEdu = workerEdu;
        this.politics = politics;
        this.school = school;
        this.workerTel = workerTel;
        this.webRelation = webRelation;
        this.webDeta = webDeta;
        this.audIt = audIt;
        this.dutiesId = dutiesId;
        this.workerSta = workerSta;
        this.orderRemark = orderRemark;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XtUserInfo() {
        super();
    }

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName == null ? null : workerName.trim();
    }

    public String getWorkerSex() {
        return workerSex;
    }

    public void setWorkerSex(String workerSex) {
        this.workerSex = workerSex == null ? null : workerSex.trim();
    }

    public String getWorkerPhoto() {
        return workerPhoto;
    }

    public void setWorkerPhoto(String workerPhoto) {
        this.workerPhoto = workerPhoto == null ? null : workerPhoto.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getHomeAdd() {
        return homeAdd;
    }

    public void setHomeAdd(String homeAdd) {
        this.homeAdd = homeAdd == null ? null : homeAdd.trim();
    }

    public String getNowAdd() {
        return nowAdd;
    }

    public void setNowAdd(String nowAdd) {
        this.nowAdd = nowAdd == null ? null : nowAdd.trim();
    }

    public String getWorkerEdu() {
        return workerEdu;
    }

    public void setWorkerEdu(String workerEdu) {
        this.workerEdu = workerEdu == null ? null : workerEdu.trim();
    }

    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics == null ? null : politics.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getWorkerTel() {
        return workerTel;
    }

    public void setWorkerTel(String workerTel) {
        this.workerTel = workerTel == null ? null : workerTel.trim();
    }

    public String getWebRelation() {
        return webRelation;
    }

    public void setWebRelation(String webRelation) {
        this.webRelation = webRelation == null ? null : webRelation.trim();
    }

    public String getWebDeta() {
        return webDeta;
    }

    public void setWebDeta(String webDeta) {
        this.webDeta = webDeta == null ? null : webDeta.trim();
    }

    public String getAudIt() {
        return audIt;
    }

    public void setAudIt(String audIt) {
        this.audIt = audIt == null ? null : audIt.trim();
    }

    public Long getDutiesId() {
        return dutiesId;
    }

    public void setDutiesId(Long dutiesId) {
        this.dutiesId = dutiesId;
    }

    public String getWorkerSta() {
        return workerSta;
    }

    public void setWorkerSta(String workerSta) {
        this.workerSta = workerSta == null ? null : workerSta.trim();
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

	@Override
	public String toString() {
		return "XtUserInfo [workerId=" + workerId + ", workerName=" + workerName + ", workerSex=" + workerSex
				+ ", workerPhoto=" + workerPhoto + ", idCard=" + idCard + ", homeAdd=" + homeAdd + ", nowAdd=" + nowAdd
				+ ", workerEdu=" + workerEdu + ", politics=" + politics + ", school=" + school + ", workerTel="
				+ workerTel + ", webRelation=" + webRelation + ", webDeta=" + webDeta + ", audIt=" + audIt
				+ ", dutiesId=" + dutiesId + ", workerSta=" + workerSta + ", orderRemark=" + orderRemark
				+ ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
    
}