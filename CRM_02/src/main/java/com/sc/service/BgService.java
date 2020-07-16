package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgAssessIndex;
import com.sc.entity.BgAssessTask;
import com.sc.entity.BgTaskDetail;
import com.sc.entity.XtUserInfo;

public interface BgService {

//**********//
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
	
	
//**********//
	
	//任务分页查询
	public PageInfo<BgAssessTask> selectBgAssessTask(Integer pageNum,Integer pageSize, BgAssessTask bgAssessTask,String sousuo);
	
	//查询所有发布任务
	public List<BgAssessTask> selectBgAssessTask();
	//查询考核指标
	public List<BgAssessIndex> selectBgAssessIndex();
	//查询user
	public List<XtUserInfo> selectXtUserInfo();
	
	//添加任务
	public void addbgAssessTask(BgAssessTask bgAssessTask,BgTaskDetail bgTaskDetail);

}
