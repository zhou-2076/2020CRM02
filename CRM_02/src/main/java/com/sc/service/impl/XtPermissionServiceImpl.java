package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtPermission;
import com.sc.entity.XtPermissionExample;
import com.sc.entity.XtPermissionExample.Criteria;
import com.sc.mapper.XtPermissionMapper;
import com.sc.service.XtPermissionService;
@Service
public class XtPermissionServiceImpl implements XtPermissionService {

	@Autowired
	XtPermissionMapper xtPermissionMapper;
	@Override
	public void addPer(XtPermission perion) {
		xtPermissionMapper.insert(perion);

	}

	@Override
	public void updatePer(XtPermission perion) {
		if(perion!=null&&perion.getQxId()!=null){
			xtPermissionMapper.updateByPrimaryKey(perion);
		}
	}

	@Override
	public void deletePer(Long qxId) {
		if(qxId!=null){
			xtPermissionMapper.deleteByPrimaryKey(qxId);
		}

	}

	@Override
	public XtPermission getPer(Long qxId) {
		if(qxId!=null){
			return xtPermissionMapper.selectByPrimaryKey(qxId);
		}
		return null;
	}

	@Override
	public PageInfo<XtPermission> selectPer(Integer pageNum, Integer pageSize, XtPermission perion) {
		XtPermissionExample example=new XtPermissionExample();
		if(perion!=null){
			Criteria criteria= example.createCriteria();
			if(!StringUtils.isEmpty(perion.getQxName())){
				criteria.andQxNameLike("%"+perion.getQxName()+"%");
			}
		}
		PageHelper.startPage(pageNum,pageSize);
		List<XtPermission> list = xtPermissionMapper.selectByExample(example);
		PageInfo<XtPermission> page=new PageInfo<XtPermission>(list);
		return page;
	}

}
