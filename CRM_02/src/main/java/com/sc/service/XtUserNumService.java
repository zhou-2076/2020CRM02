package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtUserNum;

public interface XtUserNumService {
       
	public void addUser(XtUserNum usernum);
	
	public void updateUser(XtUserNum usernum);
	
	public void deleteUser(Long userId);
	
	public XtUserNum getUser(Long userId);
	
	public PageInfo<XtUserNum> selectUser(Integer pageNum,Integer pageSize,XtUserNum usernum);
	
} 
