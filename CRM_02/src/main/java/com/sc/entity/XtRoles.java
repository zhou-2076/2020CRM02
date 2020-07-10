package com.sc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class XtRoles implements Serializable {
    private Long roleId;

    private String roleName;

    private String roleDescribe;

    private Long upRoleId;

    private String operator;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date lastModifyDate;
    
    //拓展属性（将权限装到角色中）
    
    private List<XtPermission> xtPermission;

    private static final long serialVersionUID = 1L;

    public XtRoles(Long roleId, String roleName, String roleDescribe, Long upRoleId, String operator, Date lastModifyDate) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDescribe = roleDescribe;
        this.upRoleId = upRoleId;
        this.operator = operator;
        this.lastModifyDate = lastModifyDate;
    }

    public XtRoles() {
        super();
    }

    //拓展属性需生成get和set方法
    public List<XtPermission> getXtPermission() {
  		return xtPermission;
  	}

  	public void setXtPermission(List<XtPermission> xtPermission) {
  		this.xtPermission = xtPermission;
  	}
    
    public Long getRoleId() {
        return roleId;
    }

	public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDescribe() {
        return roleDescribe;
    }

    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe == null ? null : roleDescribe.trim();
    }

    public Long getUpRoleId() {
        return upRoleId;
    }

    public void setUpRoleId(Long upRoleId) {
        this.upRoleId = upRoleId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

	@Override
	public String toString() {
		return "XtRoles [roleId=" + roleId + ", roleName=" + roleName + ", roleDescribe=" + roleDescribe + ", upRoleId="
				+ upRoleId + ", operator=" + operator + ", lastModifyDate=" + lastModifyDate + ", xtPermission="
				+ xtPermission + "]";
	}
    
    
    
}