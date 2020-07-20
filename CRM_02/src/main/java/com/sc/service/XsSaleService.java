package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.CgOrderDetail;
import com.sc.entity.CgSupMsg;
import com.sc.entity.XsConRecord;
import com.sc.entity.XsConnect;
import com.sc.entity.XsCustom;
import com.sc.entity.XsDetail;
import com.sc.entity.XsOut;

public interface XsSaleService {
	
	//添加销售出库表  对象
	public void addXsOut(XsOut Xsout);
	//添加销售详情表对象
	public void addXsDetail(XsDetail Xsdetail);
	
	
	//修改销售出库表对象
	public void updateXsOut(XsOut Xsout);
	//修改销售详情表对象
	public void updateXsDetail(XsDetail Xsdetail);
	
	
	//通过id删除销售出库表信息
	public void deleteXsOut(Long saleId);
	//通过id删除销售详情表对象
	public void deleteXsDetail(Long saleDetailId);
	
	
	
	//通过id获得销售出库表信息
	public XsOut getXsOut(Long saleId);
	//通过id获得销售详情表
	public XsDetail getXsDetail(Long saleDetailId);
	
	
	
	//直接查询销售出库表（制单时间范围  模糊查询）
	public PageInfo<XsOut> selectXsOut(Integer pageNum,Integer pageSize,XsOut Xsout);
	
	//直接查询销售详情表（商品编号的   模糊查询）
	public PageInfo<XsDetail> selectXsDetail(Integer pageNum,Integer pageSize,XsDetail Xsdetail);
	// 通过销售单ID查询销售详情表
	public PageInfo<XsDetail> selectXsDetailByid(Integer pageNum, Integer pageSize, Long saleDetailId);
	
	
}
