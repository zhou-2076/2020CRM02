package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class XtPermissionRole implements Serializable {
    private Long permissionRoleId;

    private Long qxId;

    private Long roleId;

    private Long operaterId;

    private Date lastModifyDate;

    private static final long serialVersionUID = 1L;

    public XtPermissionRole(Long permissionRoleId, Long qxId, Long roleId, Long operaterId, Date lastModifyDate) {
        this.permissionRoleId = permissionRoleId;
        this.qxId = qxId;
        this.roleId = roleId;
        this.operaterId = operaterId;
        this.lastModifyDate = lastModifyDate;
    }

    public XtPermissionRole() {
        super();
    }

    public Long getPermissionRoleId() {
        return permissionRoleId;
    }

    public void setPermissionRoleId(Long permissionRoleId) {
        this.permissionRoleId = permissionRoleId;
    }

    public Long getQxId() {
        return qxId;
    }

    public void setQxId(Long qxId) {
        this.qxId = qxId;
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
}