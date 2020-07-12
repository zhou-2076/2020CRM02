package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtUserInfo;
import com.sc.mapper.XtUserInfoMapper;
import com.sc.service.XtUserInfoService;

@Service
public class XtUserInfoServiceImpl implements XtUserInfoService {
	@Autowired
	XtUserInfoMapper xtUserInfoMapper;

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

}
