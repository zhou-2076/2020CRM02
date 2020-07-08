package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.XtCompanyInfo;
import com.sc.entity.XtDutiesInfo;
import com.sc.entity.XtPermission;
import com.sc.entity.XtRoles;
import com.sc.entity.XtSection;
import com.sc.entity.XtUserInfo;
import com.sc.entity.XtUserNum;
import com.sc.entity.XtUserNumExample;
import com.sc.mapper.XtCompanyInfoMapper;
import com.sc.mapper.XtDutiesInfoMapper;
import com.sc.mapper.XtPermissionMapper;
import com.sc.mapper.XtRolesMapper;
import com.sc.mapper.XtSectionMapper;
import com.sc.mapper.XtUserInfoMapper;
import com.sc.mapper.XtUserNumMapper;
import com.sc.service.PublicService;

@Service
public class PublicServiceImpl implements PublicService {

	@Autowired
	XtUserNumMapper sysUserMapper;
	@Autowired
	XtPermissionMapper sysPermissionMapper;
	@Autowired
	XtRolesMapper sysUrolesMapper;
	@Autowired
	XtUserInfoMapper xtUserInfoMapper;
	@Autowired
	XtCompanyInfoMapper xtCompanyInfoMapper;
	@Autowired
	XtDutiesInfoMapper xtDutiesInfoMapper;
	@Autowired
	XtSectionMapper xtSectionMapper;
	

	
	
	// 通过用户名查询用户对象
		@Override
		public XtUserNum selectSysUserByCode(String userCode) {
			XtUserNumExample example = new XtUserNumExample();
			com.sc.entity.XtUserNumExample.Criteria c = example.createCriteria();
			c.andUserNameEqualTo(userCode);// 设置用户名的查询条件
			List<XtUserNum> list = sysUserMapper.selectByExample(example);
			XtUserNum user = null;
			if (list != null && list.size() > 0) {
				user = list.get(0);
			}
			return user;
		}

	@Override
	public List<XtPermission> selectPermission(Long roleId) {
		List<XtPermission> list = sysPermissionMapper.selectPermission(roleId);
		return list;
	}

	// 通过用户id查询角色
	@Override
	public List<XtRoles> selecteUserRoles(Long userId) {
		List<XtRoles> list = sysUrolesMapper.selecteUserRoles(userId);
		return list;
	}

	@Override
	public XtUserInfo selecteUserinfoByworkerId(Long workerId) {
		// TODO Auto-generated method stub
		return xtUserInfoMapper.selectByPrimaryKey(workerId);
	}

	@Override
	public XtCompanyInfo selecteCompanyInfoBy(Long companyId) {
		// TODO Auto-generated method stub
		return xtCompanyInfoMapper.selectByPrimaryKey(companyId);
	}

	@Override
	public XtDutiesInfo selecteXtDutiesInfoBydutiesId(Long dutiesId) {
		// TODO Auto-generated method stub
		return xtDutiesInfoMapper.selectByPrimaryKey(dutiesId);
	}

	@Override
	public XtSection selecteXtSectionBysectionId(Long sectionId) {
		// TODO Auto-generated method stub
		return xtSectionMapper.selectByPrimaryKey(sectionId);
	}

}
