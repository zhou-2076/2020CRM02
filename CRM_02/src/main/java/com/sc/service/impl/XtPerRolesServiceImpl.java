package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtPermissionRole;
import com.sc.mapper.XtPermissionRoleMapper;
import com.sc.service.XtPerRolesService;
@Service
public class XtPerRolesServiceImpl implements XtPerRolesService {

	@Autowired
	XtPermissionRoleMapper xtPermissionRoleMapper;
	@Override
	public void addxtperle(XtPermissionRole xtperle) {
		xtPermissionRoleMapper.insert(xtperle);

	}

	@Override
	public void updatextperle(XtPermissionRole xtperle) {
		xtPermissionRoleMapper.updateByPrimaryKey(xtperle);

	}

	@Override
	public void deletextperle(Long userId) {
		if(userId!=null){
			xtPermissionRoleMapper.deleteByPrimaryKey(userId);
		}

	}

	@Override
	public XtPermissionRole getxtperle(Long userId) {
		if(userId!=null){
			xtPermissionRoleMapper.selectByPrimaryKey(userId);
		}
		return null;
	}

	@Override
	public PageInfo<XtPermissionRole> selectxtperle(Integer pageNum, Integer pageSize, XtPermissionRole xtperle) {
		PageHelper.startPage(pageNum, pageSize);
		List<XtPermissionRole> list = xtPermissionRoleMapper.selectByExample(null);
		PageInfo<XtPermissionRole> page=new PageInfo<XtPermissionRole>(list);
		return page;
	}

}
