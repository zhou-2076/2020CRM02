package com.sc.service;

import java.util.List;

import com.sc.entity.XtCompanyInfo;
import com.sc.entity.XtDutiesInfo;
import com.sc.entity.XtPermission;
import com.sc.entity.XtRoles;
import com.sc.entity.XtSection;
import com.sc.entity.XtUserInfo;
import com.sc.entity.XtUserNum;

//这里面的东西不要碰,自己重新创service写自己的功能
public interface PublicService {
	
	//通过用户名查询用户对象
	public XtUserNum selectSysUserByCode(String userCode);
	
	// 通过用户名查询角色
	public List<XtPermission> selectPermission(Long roleId);

	// 通过用户id查询角色
	public List<XtRoles> selecteUserRoles(Long userId);

	// 根据账户信息中的员工id查到员工信息
	public XtUserInfo selecteUserinfoByworkerId(Long workerId);

	// 根据员工信息中的公司id查到公司信息
	public XtCompanyInfo selecteCompanyInfoBy(Long companyId);

	// 根据员工信息信息中的职务id查到职务信息
	public XtDutiesInfo selecteXtDutiesInfoBydutiesId(Long dutiesId);

	// 根据职务信息中的部门id查到部门信息
	public XtSection selecteXtSectionBysectionId(Long sectionId);
}
