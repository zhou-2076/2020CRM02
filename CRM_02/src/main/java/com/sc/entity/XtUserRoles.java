package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XtUserRoles implements Serializable {
    private Long userRolesId;

    private Long userId;

    private Long roleId;

    private Long operaterId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XtUserRoles(Long userRolesId, Long userId, Long roleId, Long operaterId, Date lastModifyDate) {
        this.userRolesId = userRolesId;
        this.userId = userId;
        this.roleId = roleId;
        this.operaterId = operaterId;
        this.lastModifyDate = lastModifyDate;
    }

    public XtUserRoles() {
        super();
    }

    public Long getUserRolesId() {
        return userRolesId;
    }

    public void setUserRolesId(Long userRolesId) {
        this.userRolesId = userRolesId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getOperaterId() {
        return operaterId;
    }

    public void setOperaterId(Long operaterId) {
        this.operaterId = operaterId;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

	@Override
	public String toString() {
		return "XtUserRoles [userRolesId=" + userRolesId + ", userId=" + userId + ", roleId=" + roleId + ", operaterId="
				+ operaterId + ", lastModifyDate=" + lastModifyDate + "]";
	}
    
}