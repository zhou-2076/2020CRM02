package com.sc.service;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtCompanyInfo;
import com.sc.entity.XtUserInfo;

public interface XtUserInfoService {
	// 添加员工信息
	public void addXtUserInof(XtUserInfo userInfo);

	// 修改员工信息
	public void updateXtUserInof(XtUserInfo userInfo);

	// 删除员工信息
	public void deleteXtUserInof(Long  workerId);

	// 根据员工id查到员工信息
	public XtUserInfo getXtUserInof(Long  workerId);

	// 根据员工查到员工信息
	public PageInfo<XtUserInfo> selectXtUserInof(Integer pageNum, Integer pageSize, XtUserInfo userInfo);

	// 查出所有公司
	public List<XtCompanyInfo> selectallcompany();
	
	// 根据公司id查到公司信息
	public XtCompanyInfo selecteCompanyInfoBy(Long companyId);
	
	// 模糊查询员工信息
	public PageInfo<XtUserInfo> selectSup(Integer pageNum, Integer pageSize, String name);

}
