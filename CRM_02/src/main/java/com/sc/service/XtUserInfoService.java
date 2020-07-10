package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtUserInfo;

public interface XtUserInfoService {
	// 添加员工信息
	public void addXtUserInof(XtUserInfo userInfo);

	// 修改员工信息
	public void updateXtUserInof(XtUserInfo userInfo);

	// 删除员工信息
	public void deleteXtUserInof(Long workerId);

	// 根据员工id查到员工信息
	public XtUserInfo getXtUserInof(Long workerId);

	// 根据员工id查到员工信息
	public PageInfo<XtUserInfo> selectXtUserInof(Integer pageNum, Integer pageSize, XtUserInfo userInfo);

}
