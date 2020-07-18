package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtPermissionSubfield;

public interface XtPerSubfieldService {

	public void addXtPerSubld(XtPermissionSubfield xtpersubld);
	
	public void updateXtPerSubld(XtPermissionSubfield xtpersubld);
	
	public void deleteXtPerSubld(Long qxFlId);
	
	public XtPermissionSubfield getXtPerSubld(XtPermissionSubfield xtpersubld);
	
	public PageInfo<XtPermissionSubfield> selectXtPerSubld(Integer pageNum,Integer pageSize,XtPermissionSubfield xtpersubld);
}
