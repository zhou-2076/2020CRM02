package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustom;

public interface XsCustomService {
	
	public void addCustom(XsCustom custom);
	
	public void updateCustom(XsCustom custom);
	
	public void deleteCustom(Long customId);
	
	//通过id获得用户信息对象
	public XsCustom getCustom(Long customId);
	
	//分页查询
	public PageInfo<XsCustom> selectCustom(Integer pageNum,Integer pageSize,XsCustom custom);
}
