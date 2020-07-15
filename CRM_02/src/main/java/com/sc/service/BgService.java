package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgAssessIndex;

public interface BgService {

	//添加考核任务
	public void addBgAssessIndex(BgAssessIndex bgAssessIndex);

	//修改考核任务
	public void updateBgAssessIndex(BgAssessIndex bgAssessIndex);
	
	//删除考核任务
	public void deleteBgAssessIndex(Long indexId);
		
	//根据id查询考核任务
	public BgAssessIndex getBgAssessIndex(Long indexId);
	
	//分页查询
	public PageInfo<BgAssessIndex> selectBgAssessIndex(Integer pageNum,Integer pageSize, BgAssessIndex bgAssessIndex,String sousuo);

}
