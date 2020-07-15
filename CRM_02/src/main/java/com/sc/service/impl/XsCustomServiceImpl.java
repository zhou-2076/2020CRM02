package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.sc.entity.XsConnect;
import com.sc.entity.XsConnectExample;
import com.sc.entity.XsCustom;
import com.sc.entity.XsCustomExample;
import com.sc.entity.XsCustomExample.Criteria;
import com.sc.mapper.XsConnectMapper;
import com.sc.mapper.XsCustomMapper;
import com.sc.service.XsCustomService;
@Service
public class XsCustomServiceImpl implements XsCustomService {

	@Autowired
	XsCustomMapper	xsCustomMapper;
	@Autowired
	XsConnectMapper xsConnectMapper;
	
	
	
	@Override
	public void addCustom(XsCustom custom) {
		xsCustomMapper.insert(custom);

	}

	@Override
	public void updateCustom(XsCustom custom) {
		if(custom!=null&&custom.getCustomId()!=null){
			xsCustomMapper.updateByPrimaryKey(custom);
		}//修改先判断不为空，再根据主键id取修改

	}

	@Override
	public void deleteCustom(Long customId) {
		if(customId!=null){
			xsCustomMapper.deleteByPrimaryKey(customId);
		}

	}

	@Override
	public XsCustom getCustom(Long customId) {
		if(customId!=null){
			return	xsCustomMapper.selectByPrimaryKey(customId);
		}//如果不为空的话，通过主键id查询并直接返回该对象
		
		return null;
	}
	
	//修改联系人对象
	@Override
	public void updateConnect(XsConnect xsConnect) {
		if(xsConnect!=null&&xsConnect.getConnectId()!=null){
			xsConnectMapper.updateByPrimaryKey(xsConnect);
		}//修改先判断不为空，再根据主键id取修改
		
	}
	
	//查询客户信息
	@Override
	public PageInfo<XsCustom> selectCustom(Integer pageNum, Integer pageSize, XsCustom custom) {
		
		
		//通过客户名字对客户信息查询
		XsCustomExample example=new XsCustomExample();
		if(custom!=null){ //如果传入的对象不等于空，就要进行条件查询
			
			Criteria criteria = example.createCriteria();
			//通过输入的名字进行客户信息查询，所以需要判断传入的客户名字
			//以前是这样写的，现在用(这里选用的是spring框架的)工具类if(custom.getCustomName()!=null&&!custom.getCustomName().equals(""))
			if(!StringUtils.isEmpty(custom.getCustomName())){//地址不为空并且内容不为空
				criteria.andCustomNameLike("%"+custom.getCustomName()+"%");//带上通配符
			}
			//对最小输入日期进行判断，如果不为空的话，就让最后修改时间大于等于它
			if(!StringUtils.isEmpty(custom.getDatemin())){
				System.out.println("------小时间-----"+custom.getDatemin());
				criteria.andLastModifyDateGreaterThanOrEqualTo(custom.getDatemin());
				
			}
			//对最答输入日期进行判断，如果不为空的话，就让最后修改时间小与等于它
			if(!StringUtils.isEmpty(custom.getDatemax())){
				
				Date d=custom.getDatemax();//这里解决当天时间零点后时间差的问题
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("------大时间-----"+d);
				criteria.andLastModifyDateLessThanOrEqualTo(d);//到这里是按加一的时间来查的
				
			}
		}
		
		//分页查询
		PageHelper.startPage(pageNum, pageSize);
		List<XsCustom> list=xsCustomMapper.selectByExample(example);//之前这里面放的是空
		PageInfo<XsCustom> page=new PageInfo<XsCustom>(list);
		return page;
	}
	
	// 直接查询联系人表 （不通过id哪种，用于模糊搜索）
	@Override
	public PageInfo<XsConnect> selectoneXsConnect(Integer pageNum, Integer pageSize, XsConnect xsconnect) {
		
		//通过联系人名字查询
		XsConnectExample example=new XsConnectExample();
		if(xsconnect!=null){ //如果传入的对象不等于空，就要进行条件查询
			
			com.sc.entity.XsConnectExample.Criteria criteria = example.createCriteria();
			//通过输入的名字进行联系人查询，所以需要判断传入的名字
			//以前是这样写的，现在用(这里选用的是spring框架的)工具类if(custom.getCustomName()!=null&&!custom.getCustomName().equals(""))
			if(!StringUtils.isEmpty(xsconnect.getConnectName())){//地址不为空并且内容不为空
				criteria.andConnectNameLike("%"+xsconnect.getConnectName()+"%");//带上通配符
			}
		}	
		//分页查询
		PageHelper.startPage(pageNum, pageSize);
		List<XsConnect> list=xsConnectMapper.selectByExample(example);
		PageInfo<XsConnect> page=new PageInfo<XsConnect>(list);
		return page;
	}
	

	// 通过客户ID查询联系人表
	@Override
	public PageInfo<XsConnect> selectoneXsConnectByCgid(Integer pageNum, Integer pageSize, Long customId,String name) {
		PageHelper.startPage(pageNum, pageSize);
		XsConnectExample xsConnectExample =new XsConnectExample();
		com.sc.entity.XsConnectExample.Criteria criteria = xsConnectExample.createCriteria();
		criteria.andCustomIdEqualTo(customId);
		/*if(name!=null){
			criteria.andConnectNameLike("%"+name+"%");
		}*/
		List<XsConnect> list=xsConnectMapper.selectByExample(xsConnectExample);
		PageInfo<XsConnect> page=new PageInfo<XsConnect>(list);
		return page;
	}

	//通过id获得客户联系人信息
	@Override
	public XsConnect getXsConnect(Long customId) {
		if(customId!=null){
			return	xsConnectMapper.selectByPrimaryKey(customId);
		}//如果不为空的话，通过主键id查询并直接返回该对象
		return null;
	}

	//通过id删除客户联系人信息对象
	@Override
	public void deleteConnect(Long connectId) {
		if(connectId!=null){
			xsCustomMapper.deleteByPrimaryKey(connectId);
		}
		
	}

	//添加   联系人对象
	@Override
	public void addConnect(XsConnect xsConnect) {
		xsConnectMapper.insert(xsConnect);
		
	}

	

}
