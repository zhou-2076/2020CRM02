package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XsConnect;
import com.sc.entity.XsCustom;
import com.sc.entity.XsDetail;
import com.sc.entity.XsDetailExample;
import com.sc.entity.XsOut;
import com.sc.entity.XsOutExample;
import com.sc.entity.XsOutExample.Criteria;
import com.sc.mapper.XsDetailMapper;
import com.sc.mapper.XsOutMapper;
import com.sc.service.XsSaleService;
@Service
public class XsSaleServiceImpl implements XsSaleService {

	@Autowired
	XsOutMapper xsOutMapper;
	@Autowired
	XsDetailMapper xsDetailMapper;
	
	
	/********************************************************************/
	/**************************以下是销售出库表****************************/
	//添加销售出库表  对象
	@Override
	public void addXsOut(XsOut Xsout) {
		xsOutMapper.insert(Xsout);

	}
	//修改销售出库表对象
	@Override
	public void updateXsOut(XsOut Xsout) {
		if(Xsout!=null&&Xsout.getSaleId()!=null){
			xsOutMapper.updateByPrimaryKey(Xsout);
		}//修改先判断不为空，再根据主键id取修改

	}
	//通过id删除销售出库表信息
	@Override
	public void deleteXsOut(Long saleId) {
		if(saleId!=null){
			System.out.println("***********************开始通过id删除销售出库表信息");
			xsOutMapper.deleteByPrimaryKey(saleId);
			System.out.println("***********************结束通过id删除销售出库表信息");
		}

	}
	//通过id获得销售出库表信息
	@Override
	public XsOut getXsOut(Long saleId) {
		if(saleId!=null){
			XsOut out=xsOutMapper.selectByPrimaryKey(saleId);
			return	out;
			
		}//如果不为空的话，通过主键id查询并直接返回该对象
		
		return null;
	}
	//直接查询销售出库表（制单时间范围  模糊查询）
	@Override
	public PageInfo<XsOut> selectXsOut(Integer pageNum, Integer pageSize, XsOut Xsout) {
		XsOutExample example=new XsOutExample();
		if(Xsout!=null){//如果传入的对象不等于空，就要进行条件查询
			Criteria criteria = example.createCriteria();
			//通过制单范围执行查询
			//对最小输入日期进行判断，如果不为空的话，就让最后修改时间大于等于它
			if(!StringUtils.isEmpty(Xsout.getDatemin())){
				System.out.println("------小时间-----"+Xsout.getDatemin());
				criteria.andMakeSaleDateGreaterThanOrEqualTo(Xsout.getDatemin());
				
			}
			//对最答输入日期进行判断，如果不为空的话，就让最后修改时间小与等于它
			if(!StringUtils.isEmpty(Xsout.getDatemax())){
				
				Date d=Xsout.getDatemax();//这里解决当天时间零点后时间差的问题
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("------大时间-----"+d);
				criteria.andMakeSaleDateLessThanOrEqualTo(d);//到这里是按加一的时间来查的
				
			}
		}
		//分页查询
		PageHelper.startPage(pageNum, pageSize);
		List<XsOut> list=xsOutMapper.selectByExample(example);//之前这里面放的是空
		PageInfo<XsOut> page=new PageInfo<XsOut>(list);
		return page;
	}
	
	/********************************************************************/
	/**************************以下是销售详情表****************************/
	//添加销售详情表对象
	@Override
	public void addXsDetail(XsDetail Xsdetail) {
		xsDetailMapper.insert(Xsdetail);

	}
	//修改销售详情表对象
	@Override
	public void updateXsDetail(XsDetail Xsdetail) {
		if(Xsdetail!=null&&Xsdetail.getSaleDetailId()!=null){
			xsDetailMapper.updateByPrimaryKey(Xsdetail);
		}//修改先判断不为空，再根据主键id取修改

	}
	//通过id删除销售详情表对象
	@Override
	public void deleteXsDetail(Long saleDetailId) {
		if(saleDetailId!=null){
			xsDetailMapper.selectByPrimaryKey(saleDetailId);
			System.out.println("***********************通过id删除销售详情表对象");
		}

	}
	//通过id获得销售详情 这里指单个
	@Override
	public XsDetail getXsDetail(Long saleId) {
		if(saleId!=null){
			System.out.println("**********************开始查详情表");
			XsDetail detail=xsDetailMapper.selectByPrimaryKey(saleId);
			System.out.println(detail);
			return	detail;
					
		}//如果不为空的话，通过主键id查询并直接返回该对象
		return null;
	}
	//直接查询销售详情表（商品编号的   模糊查询）
	@Override
	public PageInfo<XsDetail> selectXsDetail(Integer pageNum, Integer pageSize, XsDetail Xsdetail) {
		XsDetailExample example=new XsDetailExample();
		//通过输入的商品编号进行查询
		if(Xsdetail!=null){//如果传入的对象不等于空，就要进行条件查询
			com.sc.entity.XsDetailExample.Criteria criteria = example.createCriteria();
			if(!StringUtils.isEmpty(Xsdetail.getGoodId())){//地址不为空并且内容不为空
				System.out.println("------此时要查询的商品id为-----"+Xsdetail.getGoodId());
				criteria.andGoodIdEqualTo(Xsdetail.getGoodId());
			}
		}
		//分页查询
		PageHelper.startPage(pageNum, pageSize);
		List<XsDetail> list=xsDetailMapper.selectByExample(example);
		PageInfo<XsDetail> page=new PageInfo<XsDetail>(list);
		return page;
	}
	// 通过销售单ID查询销售详情表
	@Override
	public PageInfo<XsDetail> selectXsDetailByid(Integer pageNum, Integer pageSize, Long saleId) {
		PageHelper.startPage(pageNum, pageSize);
		XsDetailExample example=new XsDetailExample();
		com.sc.entity.XsDetailExample.Criteria criteria = example.createCriteria();
		
		criteria.andSaleIdEqualTo(saleId);
		List<XsDetail> list=xsDetailMapper.selectByExample(example);
		PageInfo<XsDetail> page=new PageInfo<XsDetail>(list);
		return page;
	}

}
