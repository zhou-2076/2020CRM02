package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtUserNum;
import com.sc.mapper.XtUserNumMapper;
import com.sc.service.XtUserNumService;

@Service
public class XtUserNumServiceImpl implements XtUserNumService {

	@Autowired
	XtUserNumMapper xtUserNumMapper;
	
	@Override
	public void addUser(XtUserNum usernum) {
		xtUserNumMapper.insert(usernum);
	}

	@Override
	public void updateUser(XtUserNum usernum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(Long userId) {
		if(userId!=null){
			xtUserNumMapper.deleteByPrimaryKey(userId);
		}

	}

	@Override
	public XtUserNum getUser(Long userId) {
		if(userId!=null){
		  return xtUserNumMapper.selectByPrimaryKey(userId);
		}
		 return null;
	}

	@Override
	public PageInfo<XtUserNum> selectUser(Integer pageNum, Integer pageSize, XtUserNum usernum) {
		PageHelper.startPage(pageNum,pageSize);
		List<XtUserNum> list = xtUserNumMapper.selectByExample(null);
		PageInfo<XtUserNum> page=new PageInfo<XtUserNum>(list);
		return page;
	}

}
