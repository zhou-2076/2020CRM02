package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtUserRoles;


public interface XtUserRolesService {

	public void addUR(XtUserRoles userrole);
	
	public void updateUR(XtUserRoles userrole);
	
	public void deleteUR(Long userRolesId);
	
	public XtUserRoles getUR(Long userRolesId);
	
	public PageInfo<XtUserRoles> selectUR(Integer pageNum,Integer pageSize,XtUserRoles userrole);
}
