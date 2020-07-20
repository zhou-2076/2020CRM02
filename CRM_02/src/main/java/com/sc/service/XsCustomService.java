package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.CgOrderDetail;
import com.sc.entity.CgSupMsg;
import com.sc.entity.XsConRecord;
import com.sc.entity.XsConnect;
import com.sc.entity.XsCustom;

public interface XsCustomService {
	
	//添加客户信息  对象
	public void addCustom(XsCustom custom);
	//添加联系人对象
	public void addConnect(XsConnect xsConnect);
	//添加联系记录对象
	public void addConRecord(XsConRecord conRecord);
	
	//修改客户信息对象
	public void updateCustom(XsCustom custom);
	//修改联系人对象
	public void updateConnect(XsConnect xsConnect);
	//修改联系记录对象
	public void updateConRecord(XsConRecord conRecord);
	
	//通过id删除客户信息
	public void deleteCustom(Long customId);
	//通过id删除客户联系人对象
	public void deleteConnect(Long connectId);
	//通过id删除联系记录对象
	public void deleteConRecord(Long conRecordId);
	
	
	//通过id获得客户信息
	public XsCustom getCustom(Long customId);
	//通过id获得客户联系人
	public XsConnect getXsConnect(Long customId);
	//通过id获得联系记录
	public XsConRecord getConRecord(Long conRecordId);
	
	
	//直接查询客户信息表（分页、名字模糊、时间范围 查询）
	public PageInfo<XsCustom> selectCustom(Integer pageNum,Integer pageSize,XsCustom custom);
	//查询所有的   用于客户的下拉框
	public List<XsCustom> selectCustomAll();
	// 直接查询联系人表（名字模糊查询）
	public	PageInfo<XsConnect> selectoneXsConnect(Integer pageNum, Integer pageSize, XsConnect xsconnect);
	// 通过客户ID查询联系人表
	public PageInfo<XsConnect> selectoneXsConnectByid(Integer pageNum, Integer pageSize, Long customId,String name);
	//直接查询联系记录表（联系内容、时间范围 查询）
	public PageInfo<XsConRecord> selectConRecord(Integer pageNum,Integer pageSize,XsConRecord conRecord);
	// 通过客户ID查询联系记录表
	public PageInfo<XsConRecord> selectoneConRecordByid(Integer pageNum, Integer pageSize, Long conRecordId);
	
	
}
