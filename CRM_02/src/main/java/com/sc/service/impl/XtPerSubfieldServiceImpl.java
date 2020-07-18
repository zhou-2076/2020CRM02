package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtPermissionSubfield;
import com.sc.mapper.XtPermissionSubfieldMapper;
import com.sc.service.XtPerSubfieldService;
@Service
public class XtPerSubfieldServiceImpl implements XtPerSubfieldService {

	@Autowired
	XtPermissionSubfieldMapper xtPermissionSubfieldMapper;
	@Override
	public void addXtPerSubld(XtPermissionSubfield xtpersubld) {
		xtPermissionSubfieldMapper.insert(xtpersubld);

	}

	@Override
	public void updateXtPerSubld(XtPermissionSubfield xtpersubld) {
		xtPermissionSubfieldMapper.updateByPrimaryKey(xtpersubld);

	}

	@Override
	public void deleteXtPerSubld(Long qxFlId) {
		if(qxFlId!=null){
			xtPermissionSubfieldMapper.deleteByPrimaryKey(qxFlId);
		}

	}

	@Override
	public XtPermissionSubfield getXtPerSubld(XtPermissionSubfield xtpersubld) {
		if(xtpersubld!=null&&xtpersubld.getQxFlId()!=null){
			xtPermissionSubfieldMapper.selectByPrimaryKey(xtpersubld.getQxFlId());
		}
		return null;
	}

	@Override
	public PageInfo<XtPermissionSubfield> selectXtPerSubld(Integer pageNum, Integer pageSize,
			XtPermissionSubfield xtpersubld) {
		PageHelper.startPage(pageNum, pageSize);
		List<XtPermissionSubfield> list = xtPermissionSubfieldMapper.selectByExample(null);
		PageInfo<XtPermissionSubfield> page=new PageInfo<XtPermissionSubfield>(list);
		return page;
	}

}
