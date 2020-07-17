package com.sc.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtRoles;
import com.sc.entity.XtRolesExample;
import com.sc.entity.XtRolesExample.Criteria;
import com.sc.mapper.XtRolesMapper;
import com.sc.service.XtRolesService;
@Service
public class XtRolesServiceImpl implements XtRolesService {

	@Autowired
	XtRolesMapper xtRolesMapper;
	@Override
	public void addRoles(XtRoles roles) {
		xtRolesMapper.insert(roles);

	}

	@Override
	public void deleteRoles(Long roleId) {
		if(roleId!=null){
			xtRolesMapper.deleteByPrimaryKey(roleId);
		}

	}

	@Override
	public void updateRoles(XtRoles roles) {
		if(roles!=null&&roles.getRoleId()!=null){
			xtRolesMapper.updateByPrimaryKey(roles);
		}
		
	}

	@Override
	public XtRoles getRoles(Long roleId) {
		if(roleId!=null){
			return xtRolesMapper.selectByPrimaryKey(roleId);
		}
		return null;
	}

	@Override
	public PageInfo<XtRoles> selectRoles(Integer pageNum, Integer pageSize, XtRoles roles) {
		//XtRolesExample example=new XtRolesExample();
		//if(roles!=null){
		//	Criteria criteria= example.createCriteria();
		//	if(StringUtils.isEmpty(roles.getRoleName())){
		//		criteria.andRoleNameLike("%"+roles.getRoleName()+"%");
		//	}
		//}
		
		PageHelper.startPage(pageNum,pageSize);
		List<XtRoles> list = xtRolesMapper.selectByExample(null);
		PageInfo<XtRoles> page=new PageInfo<XtRoles>(list);
		return page;
	}

}
