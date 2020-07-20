package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XsConRecord;
import com.sc.entity.XsConRecordExample;
import com.sc.entity.XsConnect;
import com.sc.entity.XsConnectExample;
import com.sc.entity.XsCustom;
import com.sc.entity.XsCustomExample;
import com.sc.entity.XsCustomExample.Criteria;
import com.sc.mapper.XsConRecordMapper;
import com.sc.mapper.XsConnectMapper;
import com.sc.mapper.XsCustomMapper;
import com.sc.service.XsCustomService;
@Service
public class XsCustomServiceImpl implements XsCustomService {

	@Autowired
	XsCustomMapper	xsCustomMapper;
	@Autowired
	XsConnectMapper xsConnectMapper;
	@Autowired
	XsConRecordMapper xsConRecordMapper;
	
	
	/********************************************************************/
	/**************************以下是客户信息表表****************************/
	//添加客户信息  对象
	@Override
	public void addCustom(XsCustom custom) {
		xsCustomMapper.insert(custom);

	}
	//修改客户信息对象
	@Override
	public void updateCustom(XsCustom custom) {
		if(custom!=null&&custom.getCustomId()!=null){
			xsCustomMapper.updateByPrimaryKey(custom);
		}//修改先判断不为空，再根据主键id取修改

	}
	//通过id删除客户信息
	@Override
	public void deleteCustom(Long customId) {
		if(customId!=null){
			xsCustomMapper.deleteByPrimaryKey(customId);
		}

	}
	//通过id获得客户信息
	@Override
	public XsCustom getCustom(Long customId) {
		if(customId!=null){
			return	xsCustomMapper.selectByPrimaryKey(customId);
		}//如果不为空的话，通过主键id查询并直接返回该对象
		
		return null;
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
	//查询所有的 用于客户的下拉框
	@Override
	public List<XsCustom> selectCustomAll() {
		
		List<XsCustom> list=xsCustomMapper.selectByExample(null);//之前这里面放的是空
		/*for (XsCustom cc : list) {
		System.out.println("@@@@@@@@@@@@@@@@@"+cc);
			}*/
		return list;
	}
	/********************************************************************/
	/**************************以下是客户联系人表****************************/
	//添加   联系人对象
	@Override
	public void addConnect(XsConnect xsConnect) {
		xsConnectMapper.insert(xsConnect);
		
	}
	//修改联系人对象
	@Override
	public void updateConnect(XsConnect xsConnect) {
		if(xsConnect!=null&&xsConnect.getConnectId()!=null){
			xsConnectMapper.updateByPrimaryKey(xsConnect);
		}//修改先判断不为空，再根据主键id取修改
		
	}
	//通过id删除客户联系人信息对象
	@Override
	public void deleteConnect(Long connectId) {
		if(connectId!=null){
			xsConnectMapper.deleteByPrimaryKey(connectId);
			System.out.println("***********************删除成功");
		}
	}
	//通过id获得客户联系人信息
	@Override
	public XsConnect getXsConnect(Long customId) {
		if(customId!=null){
			return	xsConnectMapper.selectByPrimaryKey(customId);
		}//如果不为空的话，通过主键id查询并直接返回该对象
		return null;
	}
	// 通过客户ID查询联系人表
	@Override
	public PageInfo<XsConnect> selectoneXsConnectByid(Integer pageNum, Integer pageSize, Long customId, String name) {
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
				System.out.println("------此时的联系人名字为-----"+xsconnect.getConnectName());
				criteria.andConnectNameLike("%"+xsconnect.getConnectName()+"%");//带上通配符
			}
			//看一下id是什么
			if(!StringUtils.isEmpty(xsconnect.getCustomId())){
				System.out.println("------此时的客户id为-----"+xsconnect.getCustomId());
				criteria.andCustomIdEqualTo(xsconnect.getCustomId());
				
			}
		}	
		//分页查询
		PageHelper.startPage(pageNum, pageSize);
		List<XsConnect> list=xsConnectMapper.selectByExample(example);
		PageInfo<XsConnect> page=new PageInfo<XsConnect>(list);
		return page;
	}
	
	
	/********************************************************************/
	/**************************以下是客户联系记录表****************************/
	
	//添加联系记录对象   (新增的同时要修改 客户信息表的下次联系时间)
	@Override
	public void addConRecord(XsConRecord conRecord) {
		xsConRecordMapper.insert(conRecord);
		System.out.println("**************************新增联系记录成功");
	}
	//修改联系记录对象
	@Override
	public void updateConRecord(XsConRecord conRecord) {
		if(conRecord!=null&&conRecord.getConRecordId()!=null){
			xsConRecordMapper.updateByPrimaryKey(conRecord);
		}//修改先判断不为空，再根据主键id取修改
		
	}
	//通过id删除联系记录对象
	@Override
	public void deleteConRecord(Long conRecordId) {
		if(conRecordId!=null){
			xsConRecordMapper.deleteByPrimaryKey(conRecordId);
		}
		
	}
	//通过id获得联系记录对象
	@Override
	public XsConRecord getConRecord(Long conRecordId) {
		if(conRecordId!=null){
			return	xsConRecordMapper.selectByPrimaryKey(conRecordId);
		}//如果不为空的话，通过主键id查询并直接返回该对象
		return null;
	}
	
	//直接查询联系记录表（联系内容、时间范围 查询）
	@Override
	public PageInfo<XsConRecord> selectConRecord(Integer pageNum, Integer pageSize, XsConRecord conRecord) {
		//通过联系内容对联系记录表  查询
		XsConRecordExample xsConRecordExample=new XsConRecordExample();
		if(conRecord!=null){ //如果传入的对象不等于空，就要进行条件查询
			
			com.sc.entity.XsConRecordExample.Criteria criteria = xsConRecordExample.createCriteria();
			//通过联系内容进行联系记录表查询
			//以前是这样写的，现在用(这里选用的是spring框架的)工具类if(custom.getCustomName()!=null&&!custom.getCustomName().equals(""))
			if(!StringUtils.isEmpty(conRecord.getConContent())){//地址不为空并且内容不为空
				criteria.andConContentLike("%"+conRecord.getConContent()+"%");//带上通配符
			}
			//对最小输入日期进行判断，如果不为空的话，就让最后修改时间大于等于它
			if(!StringUtils.isEmpty(conRecord.getDatemin())){
				System.out.println("------小时间-----"+conRecord.getDatemin());
				/*criteria.andLastModifyDateGreaterThanOrEqualTo(conRecord.getDatemin());*/
				criteria.andConTimeGreaterThanOrEqualTo(conRecord.getDatemin());
				
			}
			//对最答输入日期进行判断，如果不为空的话，就让最后修改时间小与等于它
			if(!StringUtils.isEmpty(conRecord.getDatemax())){
				
				Date d=conRecord.getDatemax();//这里解决当天时间零点后时间差的问题
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				System.out.println("------大时间-----"+d);
				/*criteria.andLastModifyDateLessThanOrEqualTo(d);*/
				criteria.andConTimeLessThanOrEqualTo(d);//到这里是按加一的时间来查的
				
			}
		}
		//分页查询
		PageHelper.startPage(pageNum, pageSize);
		List<XsConRecord> list=xsConRecordMapper.selectByExample(xsConRecordExample);//之前这里面放的是空
		PageInfo<XsConRecord> page=new PageInfo<XsConRecord>(list);
		return page;
	}

	// 通过客户ID查询联系记录表
	@Override
	public PageInfo<XsConRecord> selectoneConRecordByid(Integer pageNum, Integer pageSize, Long conRecordId) {
		PageHelper.startPage(pageNum, pageSize);
		XsConRecordExample xsConRecordExample=new XsConRecordExample();
		com.sc.entity.XsConRecordExample.Criteria criteria = xsConRecordExample.createCriteria();
		criteria.andCustomIdEqualTo(conRecordId);
		
		List<XsConRecord> list=xsConRecordMapper.selectByExample(xsConRecordExample);
		PageInfo<XsConRecord> page=new PageInfo<XsConRecord>(list);
		return page;
	}
	

}

