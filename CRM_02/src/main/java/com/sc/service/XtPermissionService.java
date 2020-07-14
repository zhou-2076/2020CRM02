package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtPermission;
import com.sc.entity.XtUserNum;

public interface XtPermissionService {

    public void addPer(XtPermission perion);
	
	public void updatePer(XtPermission perion);
	
	public void deletePer(Long qxId);
	
	public XtPermission getPer(Long qxId);
	
	public PageInfo<XtPermission> selectPer(Integer pageNum,Integer pageSize,XtPermission perion);
}
