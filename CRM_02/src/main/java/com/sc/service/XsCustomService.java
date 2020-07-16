package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.CgOrderDetail;
import com.sc.entity.CgSupMsg;
import com.sc.entity.XsConnect;
import com.sc.entity.XsCustom;

public interface XsCustomService {
	
	public void addCustom(XsCustom custom);
	
	//添加联系人对象
	public void addConnect(XsConnect xsConnect);
	
	public void updateCustom(XsCustom custom);
	
	//修改联系人对象
	public void updateConnect(XsConnect xsConnect);
	
	public void deleteCustom(Long customId);
	
	//通过id删除客户联系人信息对象
	public void deleteConnect(Long connectId);
	
	//通过id获得客户信息对象
	public XsCustom getCustom(Long customId);
	
	//通过id获得客户联系人信息
	public XsConnect getXsConnect(Long customId);
	
	//分页查询
	public PageInfo<XsCustom> selectCustom(Integer pageNum,Integer pageSize,XsCustom custom);

	// 通过客户ID查询联系人表
	public PageInfo<XsConnect> selectoneXsConnectByCgid(Integer pageNum, Integer pageSize, Long customId
			,String name);

	// 直接查询联系人表（模糊查询）
	public	PageInfo<XsConnect> selectoneXsConnect(Integer pageNum, Integer pageSize, XsConnect xsconnect);

	
}
