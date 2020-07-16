package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtCompanyInfo;
import com.sc.entity.XtUserInfo;
import com.sc.entity.XtUserInfoExample;
import com.sc.mapper.XtCompanyInfoMapper;
import com.sc.mapper.XtUserInfoMapper;
import com.sc.service.XtUserInfoService;

@Service
public class XtUserInfoServiceImpl implements XtUserInfoService {
	@Autowired
	XtUserInfoMapper xtUserInfoMapper;

	@Autowired
	XtCompanyInfoMapper xtCompanyInfoMapper;
	
	
	@Override
	public void addXtUserInof(XtUserInfo userInfo) {
		xtUserInfoMapper.insert(userInfo);
		
	}

	@Override
	public void updateXtUserInof(XtUserInfo userInfo) {
		if(userInfo!=null&&userInfo.getWorkerId()!=null){
			xtUserInfoMapper.updateByPrimaryKey(userInfo);
		}
		
	}

	@Override
	public void deleteXtUserInof(Long workerId) {
		if(workerId!=null){
			xtUserInfoMapper.deleteByPrimaryKey(workerId);
		}
		
	}

	@Override
	public XtUserInfo getXtUserInof(Long workerId) {
		if(workerId!=null){
			
			return xtUserInfoMapper.selectByPrimaryKey(workerId);
		}
		return null;
	}

	@Override
	public PageInfo<XtUserInfo> selectXtUserInof(Integer pageNum, Integer pageSize, XtUserInfo userInfo) {
		PageHelper.startPage(pageNum, pageSize);
		List<XtUserInfo> list = xtUserInfoMapper.selectByExample(null);
		 PageInfo<XtUserInfo> Page = new PageInfo<XtUserInfo>(list);
		return Page;
	}

	@Override
	public List<XtCompanyInfo> selectallcompany() {
		return xtCompanyInfoMapper.selectByExample(null);
	}

	@Override
	public XtCompanyInfo selecteCompanyInfoBy(Long companyId) {
		return xtCompanyInfoMapper.selectByPrimaryKey(companyId);
	}

	
	@Override
	public PageInfo<XtUserInfo> selectSup(Integer pageNum, Integer pageSize, String name) {
		PageHelper.startPage(pageNum, pageSize);
		XtUserInfoExample xtUserInfoExample = new XtUserInfoExample();

		com.sc.entity.XtUserInfoExample.Criteria createCriteria = xtUserInfoExample.createCriteria();

		if (name != null) {
			createCriteria.andWorkerNameLike("%" + name + "%");
		}
		xtUserInfoExample.setOrderByClause("WORKER_ID");
		List<XtUserInfo> list = xtUserInfoMapper.selectByExample(xtUserInfoExample);
		PageInfo<XtUserInfo> page = new PageInfo<XtUserInfo>(list);
		return page;
	}

	
}
