package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgAssessIndex;
import com.sc.entity.BgAssessTask;
import com.sc.entity.BgPersonageSchedule;
import com.sc.entity.BgSms;
import com.sc.entity.BgSmsDetail;
import com.sc.entity.BgTaskDetail;
import com.sc.entity.XtUserInfo;

public interface BgService {

//**********//
	//添加考核指标
	public void addBgAssessIndex(BgAssessIndex bgAssessIndex);

	//修改考核指标
	public void updateBgAssessIndex(BgAssessIndex bgAssessIndex);
	
	//删除考核指标
	public void deleteBgAssessIndex(Long indexId);
		
	//根据id查询考核指标
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
	
	//添加考核任务
	public void addbgAssessTask(BgAssessTask bgAssessTask,BgTaskDetail bgTaskDetail,Long[] id);
	
	//根据id查询考核任务详情
	public BgTaskDetail getBgTaskDetail(Long taskId);
	
	//删除考核任务，加详情
	public void deleteBgAssessTask(Long taskId);
	public void deleteBgTaskDetail(Long taskDetailId);

	//修改考核任务详情状态，改为已阅，或者改为已完成
	public void updateBgTaskDetail(BgTaskDetail bgTaskDetail);
	
	

	
//****************//
	//任务分页查询
	public PageInfo<BgSms> selectBgSms(Integer pageNum,Integer pageSize, BgSms bgSms,String sousuo);
	
	//添加短消息
	public void addBgSms(BgSms bgSms,BgSmsDetail bgSmsDetail,Long[] id);
	
	//根据id查询短消息
	public BgSmsDetail getBgSmsDetail(Long smsId);
	
	//修改考核任务详情状态，改为已阅，或者改为已完成
	public void updateBgSmsDetail(BgSmsDetail BgSmsDetail);
	
	//删除短消息，加详情
	public void deleteBgSms(Long smsId);
	public void deleteBgSmsDetail(Long detaileId);
	
	
//*********************//	
	
	//添加日程
	public void addBgPersonageSchedule(BgPersonageSchedule sche);
	
    //通过id获取实体类对象
	public BgPersonageSchedule getBgPersonageScheduleById(Long id);
	
	//修改日程
	public void updateBgPersonageSchedule(BgPersonageSchedule sche);
	
	//删除日程
	public void delBgPersonageSchedule(BgPersonageSchedule sche);
	
	//查询日程
	public List<BgPersonageSchedule> getAllBgPersonageSchedule(BgPersonageSchedule sche);
	
}
