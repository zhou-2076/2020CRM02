package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.BgAssessIndex;
import com.sc.entity.BgAssessIndexExample;
import com.sc.entity.BgAssessIndexExample.Criteria;
import com.sc.mapper.BgAssessIndexMapper;
import com.sc.service.BgService;

//业务类
@Service
public class BgServiceimpl implements BgService {
	
	@Autowired
	BgAssessIndexMapper bgAssessIndexMapper;

	@Override
	public void addBgAssessIndex(BgAssessIndex bgAssessIndex) {
		bgAssessIndexMapper.insert(bgAssessIndex);

	}

	@Override
	public void updateBgAssessIndex(BgAssessIndex bgAssessIndex) {
		if(bgAssessIndex!=null&&bgAssessIndex.getAssessIndex()!=null){
			bgAssessIndexMapper.updateByPrimaryKey(bgAssessIndex);
		}

	}

	@Override
	public void deleteBgAssessIndex(Long indexId) {
		if(indexId!=null){
			bgAssessIndexMapper.deleteByPrimaryKey(indexId);
		}

	}

	@Override
	public BgAssessIndex getBgAssessIndex(Long indexId) {
		if(indexId!=null){
			return bgAssessIndexMapper.selectByPrimaryKey(indexId);
		}
			return null;
	}

	@Override
	public PageInfo<BgAssessIndex> selectBgAssessIndex(Integer pageNum, Integer pageSize, BgAssessIndex bgAssessIndex,String sousuo) {
		PageHelper.startPage(pageNum, pageSize);
		if(sousuo!=null){
			System.out.println(sousuo);
			BgAssessIndexExample example=new BgAssessIndexExample();
			Criteria criteria = example.createCriteria();// 调用sql
			criteria.andAssessIndexLike("%"+sousuo+"%");
			List<BgAssessIndex> list= bgAssessIndexMapper.selectByExample(example);
			PageInfo<BgAssessIndex> page=new PageInfo<BgAssessIndex>(list);
			return page;
		}else{
			List<BgAssessIndex> list= bgAssessIndexMapper.selectByExample(null);
			PageInfo<BgAssessIndex> page=new PageInfo<BgAssessIndex>(list);
			return page;
		}
	}
	

}
