package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XtUserNum;
import com.sc.entity.XtUserNumExample;
import com.sc.entity.XtUserNumExample.Criteria;
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
		XtUserNumExample example=new XtUserNumExample();
		if(usernum!=null){
			Criteria criteria=example.createCriteria();
			//if(usernum.getUserName()!=null&&usernum.getUserName().equals(""))
			if(!StringUtils.isEmpty(usernum.getUserName())){//管理员名模糊查询
				criteria.andUserNameLike("%"+usernum.getUserName()+"%");
			}
			if(!StringUtils.isEmpty(usernum.getDatemin())){//最后修改时间大于等于最小日期
				criteria.andLastModifyDateGreaterThanOrEqualTo(usernum.getDatemin());
			}
			if(!StringUtils.isEmpty(usernum.getDatemax())){//最后修改时间小于等于最大日期
				Date d=usernum.getDatemax();
				d.setHours(23);
				d.setMinutes(59);
				d.setSeconds(59);
				criteria.andLastModifyDateLessThanOrEqualTo(d);
			}
		}
		
		PageHelper.startPage(pageNum,pageSize);
		List<XtUserNum> list = xtUserNumMapper.selectByExample(example);
		PageInfo<XtUserNum> page=new PageInfo<XtUserNum>(list);
		return page;
	}

}
