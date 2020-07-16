package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtSection;
import com.sc.mapper.XtSectionMapper;
import com.sc.service.XtSectionService;
@Service
public class XtSectionServiceImpl implements XtSectionService {

	@Autowired
	XtSectionMapper xtSectionMapper;

	 //.添加部门信息  XT_SECTION 系统部门表
	@Override
	public void addXtSectton(XtSection Section) {
		xtSectionMapper.insert(Section);	
	}

	@Override
	public PageInfo<XtSection> selectXtSection(Integer pageNum, Integer pageSize, XtSection Section) {
		PageHelper.startPage(pageNum, pageSize);
		List<XtSection> List = xtSectionMapper.selectByExample(null);
		PageInfo<XtSection> page = new PageInfo<XtSection>(List);
		return page;
	}

}
