package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class XsCustom<ConnectDetail> implements Serializable {
    private Long customId;

    private String customName;

    private String customProperty;

    private String website;

    private Long sharaCode;

    private String superDepart;

    private String owner;

    private Long empNum;

    private BigDecimal industryId;

    private String customType;

    private String customStatus;

    private String customSource;

    private BigDecimal principalId;

    private BigDecimal telephone;

    private BigDecimal mobilephone;

    private String customFax;

    private String bank;

    private String bankAccount;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date nextTime;
    
    
	
	//扩展属性 用于日期范围查询
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date datemin;
    
    //扩展属性 用于日期范围查询
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

	private String email;

    private String sic;

    private String payMethod;

    private String enabled;

    private String address;

    private String customRemark;

    private Long companyId;
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XsCustom(Long customId, String customName, String customProperty, String website, Long sharaCode, String superDepart, String owner, Long empNum, BigDecimal industryId, String customType, String customStatus, String customSource, BigDecimal principalId, BigDecimal telephone, BigDecimal mobilephone, String customFax, String bank, String bankAccount, Date nextTime, String email, String sic, String payMethod, String enabled, String address, String customRemark, Long companyId, Date lastModifyDate) {
        this.customId = customId;
        this.customName = customName;
        this.customProperty = customProperty;
        this.website = website;
        this.sharaCode = sharaCode;
        this.superDepart = superDepart;
        this.owner = owner;
        this.empNum = empNum;
        this.industryId = industryId;
        this.customType = customType;
        this.customStatus = customStatus;
        this.customSource = customSource;
        this.principalId = principalId;
        this.telephone = telephone;
        this.mobilephone = mobilephone;
        this.customFax = customFax;
        this.bank = bank;
        this.bankAccount = bankAccount;
        this.nextTime = nextTime;
        this.email = email;
        this.sic = sic;
        this.payMethod = payMethod;
        this.enabled = enabled;
        this.address = address;
        this.customRemark = customRemark;
        this.companyId = companyId;
        this.lastModifyDate = lastModifyDate;
    }

    public XsCustom() {
        super();
    }

    public Long getCustomId() {
        return customId;
    }

    public void setCustomId(Long customId) {
        this.customId = customId;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName == null ? null : customName.trim();
    }

    public String getCustomProperty() {
        return customProperty;
    }

    public void setCustomProperty(String customProperty) {
        this.customProperty = customProperty == null ? null : customProperty.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public Long getSharaCode() {
        return sharaCode;
    }

    public void setSharaCode(Long sharaCode) {
        this.sharaCode = sharaCode;
    }

    public String getSuperDepart() {
        return superDepart;
    }

    public void setSuperDepart(String superDepart) {
        this.superDepart = superDepart == null ? null : superDepart.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public Long getEmpNum() {
        return empNum;
    }

    public void setEmpNum(Long empNum) {
        this.empNum = empNum;
    }

    public BigDecimal getIndustryId() {
        return industryId;
    }

    public void setIndustryId(BigDecimal industryId) {
        this.industryId = industryId;
    }

    public String getCustomType() {
        return customType;
    }

    public void setCustomType(String customType) {
        this.customType = customType == null ? null : customType.trim();
    }

    public String getCustomStatus() {
        return customStatus;
    }

    public void setCustomStatus(String customStatus) {
        this.customStatus = customStatus == null ? null : customStatus.trim();
    }

    public String getCustomSource() {
        return customSource;
    }

    public void setCustomSource(String customSource) {
        this.customSource = customSource == null ? null : customSource.trim();
    }

    public BigDecimal getPrincipalId() {
        return principalId;
    }

    public void setPrincipalId(BigDecimal principalId) {
        this.principalId = principalId;
    }

    public BigDecimal getTelephone() {
        return telephone;
    }

    public void setTelephone(BigDecimal telephone) {
        this.telephone = telephone;
    }

    public BigDecimal getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(BigDecimal mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getCustomFax() {
        return customFax;
    }

    public void setCustomFax(String customFax) {
        this.customFax = customFax == null ? null : customFax.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public Date getNextTime() {
        return nextTime;
    }

    public void setNextTime(Date nextTime) {
        this.nextTime = nextTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSic() {
        return sic;
    }

    public void setSic(String sic) {
        this.sic = sic == null ? null : sic.trim();
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCustomRemark() {
        return customRemark;
    }

    public void setCustomRemark(String customRemark) {
        this.customRemark = customRemark == null ? null : customRemark.trim();
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
		return "XsCustom [customId=" + customId + ", customName=" + customName + ", customProperty=" + customProperty
				+ ", website=" + website + ", sharaCode=" + sharaCode + ", superDepart=" + superDepart + ", owner="
				+ owner + ", empNum=" + empNum + ", industryId=" + industryId + ", customType=" + customType
				+ ", customStatus=" + customStatus + ", customSource=" + customSource + ", principalId=" + principalId
				+ ", telephone=" + telephone + ", mobilephone=" + mobilephone + ", customFax=" + customFax + ", bank="
				+ bank + ", bankAccount=" + bankAccount + ", nextTime=" + nextTime + ", email=" + email + ", sic=" + sic
				+ ", payMethod=" + payMethod + ", enabled=" + enabled + ", address=" + address + ", customRemark="
				+ customRemark + ", companyId=" + companyId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
    
}