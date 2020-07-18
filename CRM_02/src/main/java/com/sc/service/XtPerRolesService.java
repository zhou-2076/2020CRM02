package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtPermissionRole;


public interface XtPerRolesService {

    public void addxtperle(XtPermissionRole xtperle);
	
	public void updatextperle(XtPermissionRole xtperle);
	
	public void deletextperle(Long userId);
	
	public XtPermissionRole getxtperle(Long userId);
	
	public PageInfo<XtPermissionRole> selectxtperle(Integer pageNum,Integer pageSize,XtPermissionRole xtperle);
}
