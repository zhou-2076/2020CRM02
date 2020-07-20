package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtUserRoles;
import com.sc.mapper.XtUserRolesMapper;
import com.sc.service.XtUserRolesService;
@Service
public class XtUserRolesServiceImpl implements XtUserRolesService {

	@Autowired
	XtUserRolesMapper xtUserRolesMapper;
	@Override
	public void addUR(XtUserRoles userrole) {
		xtUserRolesMapper.insert(userrole);

	}

	@Override
	public void updateUR(XtUserRoles userrole) {
		if(userrole!=null){
			xtUserRolesMapper.updateByPrimaryKey(userrole);
		}

	}

	@Override
	public void deleteUR(Long userRolesId) {
		if(userRolesId!=null){
			xtUserRolesMapper.deleteByPrimaryKey(userRolesId);
		}

	}

	@Override
	public XtUserRoles getUR(Long userRolesId) {
		if(userRolesId!=null){
			xtUserRolesMapper.selectByPrimaryKey(userRolesId);
		}
		return null;
	}

	public PageInfo<XtUserRoles> selectUR(Integer pageNum, Integer pageSize, XtUserRoles userrole) {
		PageHelper.startPage(pageNum, pageSize);
		List<XtUserRoles> list = xtUserRolesMapper.selectByExample(null);
		PageInfo<XtUserRoles> page=new PageInfo<>(list);
		return page;
	}

}
