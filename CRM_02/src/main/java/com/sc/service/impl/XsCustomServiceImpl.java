package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XsCustom;
import com.sc.mapper.XsCustomMapper;
import com.sc.service.XsCustomService;
@Service
public class XsCustomServiceImpl implements XsCustomService {

	@Autowired
	XsCustomMapper	xsCustomMapper;
	
	
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

	@Override
	public PageInfo<XsCustom> selectCustom(Integer pageNum, Integer pageSize, XsCustom custom) {
		//分页查询
		PageHelper.startPage(pageNum, pageSize);
		List<XsCustom> list=xsCustomMapper.selectByExample(null);
		PageInfo<XsCustom> page=new PageInfo<XsCustom>(list);
		return page;
	}

}
