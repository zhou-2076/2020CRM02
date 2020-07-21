package com.sc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.BgAssessIndex;
import com.sc.entity.BgAssessIndexExample;
import com.sc.entity.BgAssessIndexExample.Criteria;
import com.sc.entity.BgAssessTask;
import com.sc.entity.BgAssessTaskExample;
import com.sc.entity.BgPersonageSchedule;
import com.sc.entity.BgSms;
import com.sc.entity.BgSmsDetail;
import com.sc.entity.BgTaskDetail;
import com.sc.entity.XtUserInfo;
import com.sc.mapper.BgAssessIndexMapper;
import com.sc.mapper.BgAssessTaskMapper;
import com.sc.mapper.BgPersonageScheduleMapper;
import com.sc.mapper.BgSmsDetailMapper;
import com.sc.mapper.BgSmsMapper;
import com.sc.mapper.BgTaskDetailMapper;
import com.sc.mapper.XtUserInfoMapper;
import com.sc.service.BgService;

//业务类
@Service
public class BgServiceimpl implements BgService {
	
	@Autowired
	BgService bgService;//反复套娃
	@Autowired
	BgAssessIndexMapper bgAssessIndexMapper;
	@Autowired
	BgAssessTaskMapper bgAssessTaskMapper;
	@Autowired
	XtUserInfoMapper xtUserInfoMapper;
	@Autowired
	BgTaskDetailMapper bgTaskDetailMapper;
	@Autowired
	BgSmsMapper bgSmsMapper;
	@Autowired
	BgSmsDetailMapper bgSmsDetailMapper;
	@Autowired
	BgPersonageScheduleMapper bgPersonageScheduleMapper;
	
	///////////////////
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

	
	
/////////////////////////////
	
	//分页查询考核任务，也可模糊查询
	@Override
	public PageInfo<BgAssessTask> selectBgAssessTask(Integer pageNum, Integer pageSize, BgAssessTask bgAssessTask,String sousuo) {
		if(sousuo!=null){
			BgAssessTaskExample example=new BgAssessTaskExample();
			com.sc.entity.BgAssessTaskExample.Criteria criteria = example.createCriteria();
			criteria.andTaskTitleLike("%"+sousuo+"%");
			List<BgAssessTask> list = bgAssessTaskMapper.selectByExample(example);
			System.out.println("---模糊查询得到参数："+list);
			//将考核任务详情补上，直接模糊查询没有考核任务详情表
			for (BgAssessTask listxq : list) {
				System.out.println("---考核任务主键："+listxq.getTaskId());
				BgTaskDetail bgTaskDetail = bgService.getBgTaskDetail(listxq.getTaskId());
				System.out.println("---通过非主键查询到的考核任务详情"+bgTaskDetail);
				//将查询到的关联表，考核任务详情给考核任务
				listxq.setBgTaskDetail(bgTaskDetail);
			}
			Date date=new Date();
			//判断设置当前考核任务详情任务状态
			for (BgAssessTask szzt : list) {
				System.out.println("---最后结束时间："+szzt.getTaskFinishTime());
				System.out.println("---当前时间："+date);
				if(date.getTime()>szzt.getTaskFinishTime().getTime()){
					System.out.println("---当前时间大于结束时间，过期");
					//先获取当前对应的考核任务详情，在考核任务详情中设置状态
					BgTaskDetail bgTaskDetail = bgService.getBgTaskDetail(szzt.getTaskId());
					bgTaskDetail.setState("0");//0，过期
					szzt.setBgTaskDetail(bgTaskDetail);
				}else{
					System.out.println("---当前时间小于结束时间，有效");
					//先获取当前对应的考核任务详情，在考核任务详情中设置状态
					BgTaskDetail bgTaskDetail = bgService.getBgTaskDetail(szzt.getTaskId());
					bgTaskDetail.setState("1");//1，有效
					szzt.setBgTaskDetail(bgTaskDetail);
				}
			}
			
			PageInfo<BgAssessTask> page=new PageInfo<BgAssessTask>(list);
			return page;
		}else{
			List<BgAssessTask> list = bgAssessTaskMapper.select();
			Date date=new Date();
			//判断设置当前考核任务详情任务状态
			for (BgAssessTask szzt : list) {
				System.out.println("---最后结束时间："+szzt.getTaskFinishTime());
				System.out.println("---当前时间："+date);
				if(date.getTime()>szzt.getTaskFinishTime().getTime()){
					System.out.println("---当前时间大于结束时间，过期");
					//先获取当前对应的考核任务详情，在考核任务详情中设置状态
					BgTaskDetail bgTaskDetail = bgService.getBgTaskDetail(szzt.getTaskId());
					bgTaskDetail.setState("0");//0，过期
					szzt.setBgTaskDetail(bgTaskDetail);
				}else{
					System.out.println("---当前时间小于结束时间，有效");
					//先获取当前对应的考核任务详情，在考核任务详情中设置状态
					BgTaskDetail bgTaskDetail = bgService.getBgTaskDetail(szzt.getTaskId());
					bgTaskDetail.setState("1");//1，有效
					szzt.setBgTaskDetail(bgTaskDetail);
				}
			}
			
			PageInfo<BgAssessTask> page=new PageInfo<BgAssessTask>(list);
			return page;	
		}
		
	}

	//查询所有发布任务，
	@Override
	public List<BgAssessTask> selectBgAssessTask() {
		List<BgAssessTask> list = bgAssessTaskMapper.select();
		return list;
	}

	//查询考核信息，得到考核指标
	@Override
	public List<BgAssessIndex> selectBgAssessIndex() {
		List<BgAssessIndex> list = bgAssessIndexMapper.selectByExample(null);
		return list;
	}

	//查询员工,以便选择，分配任务
	@Override
	public List<XtUserInfo> selectXtUserInfo() {
		List<XtUserInfo> list = xtUserInfoMapper.selectByExample(null);
		return list;
	}

	//添加，发布任务，并添加任务详情
	@Override
	public void addbgAssessTask(BgAssessTask bgAssessTask, BgTaskDetail bgTaskDetail,Long[] id) {
		System.out.println("---页面获取得考核任务"+bgAssessTask);
		System.out.println("---考核任务详情"+bgTaskDetail);
		
		
		
			for (Long acceptUserId : id) {
			
				//设置最后修改时间
				Date date=new Date();
				bgAssessTask.setLastModifyDate(date);
				bgTaskDetail.setLastModifyDate(date);
				
				//添加考核任务
				bgAssessTaskMapper.insert(bgAssessTask);
				//获取最新id
				Long fanhuiid = bgAssessTaskMapper.fanhuiid();
				System.out.println("已经添加考核任务，再获取自增id，给考核详情");
				System.out.println("---自增id为："+fanhuiid);

				//设置考核任务详情的taskid，以便关联查询
				bgTaskDetail.setTaskId(fanhuiid);
				
				//设置任务详情中，接受人的id
				System.out.println("---接受者的id："+acceptUserId);
				bgTaskDetail.setAcceptUserId(acceptUserId);
				
				//任务详情
				bgTaskDetailMapper.insert(bgTaskDetail);
			}
			
	}

	
	//根据id查询考核任务详情
	@Override
	public BgTaskDetail getBgTaskDetail(Long taskId) {
		if(taskId!=null){
			//并非通过主键查询出得
			return bgTaskDetailMapper.selecttaskIdBgTaskDetail(taskId);
		}
		return null;
	}

	//删除考核任务
	@Override
	public void deleteBgAssessTask(Long taskId) {
		bgAssessTaskMapper.deleteByPrimaryKey(taskId);
	}
	//删除任务详情
	@Override
	public void deleteBgTaskDetail(Long taskDetailId) {
		bgTaskDetailMapper.deleteByPrimaryKey(taskDetailId);
	}
	
	//修改任务详情状态，为已读（1），或者修改为已完成
	@Override
	public void updateBgTaskDetail(BgTaskDetail bgTaskDetail) {
		bgTaskDetailMapper.updateByPrimaryKey(bgTaskDetail);
		
	}
	
	
	
	

//////////////////
	
	
	//sms关联查询
	@Override
	public PageInfo<BgSms> selectBgSms(Integer pageNum, Integer pageSize, BgSms bgSms, String sousuo) {
		List<BgSms> gselect = bgSmsMapper.gselect();
		System.out.println("---短消息集合："+gselect);
		PageInfo<BgSms> page=new PageInfo<BgSms>(gselect);
		return page;
	}

	@Override
	public void addBgSms(BgSms bgSms, BgSmsDetail bgSmsDetail, Long[] id) {
		System.out.println("---关联添加，短消息，短消息详情");
		System.out.println("---获取的短信息："+bgSms);
		System.out.println("---获取的短信息详情："+bgSmsDetail);
		Date date=new Date();
		
		for (Long receiverId : id) {
			bgSms.setLastModifyDate(date);
			bgSmsDetail.setLastModifyDate(date);
			
			//先添加短消息，再获取zzid
			bgSmsMapper.insert(bgSms);
			
			System.out.println("---获取的接受者编号为:"+receiverId);
			bgSmsDetail.setReceiverId(receiverId);
			
			Long zzId = bgSmsMapper.zzId();
			System.out.println("---sms表中获取的自增id为："+zzId);
			bgSmsDetail.setSmsId(zzId);
			
			bgSmsDetailMapper.insert(bgSmsDetail);
			
		}
	}
	
	//id查询短消息详情
	@Override
	public BgSmsDetail getBgSmsDetail(Long smsId) {
		if(smsId!=null){
			return bgSmsDetailMapper.selectsmsIdBgSmsDetail(smsId);
		}
		return null;
	}

	//修改短消息详情
	@Override
	public void updateBgSmsDetail(BgSmsDetail BgSmsDetail) {
		bgSmsDetailMapper.updateByPrimaryKey(BgSmsDetail);
		
	}

	//删除短消息、详情
	@Override
	public void deleteBgSms(Long smsId) {
		bgSmsMapper.deleteByPrimaryKey(smsId);
	}
	@Override
	public void deleteBgSmsDetail(Long detaileId) {
		bgSmsDetailMapper.deleteByPrimaryKey(detaileId);
		
	}


	
	
	
	
////////////////////////
	
	//添加日程
	@Override
	public void addBgPersonageSchedule(BgPersonageSchedule sche) {
		bgPersonageScheduleMapper.insert(sche);
	}
	
	//通过id查询
	@Override
	public BgPersonageSchedule getBgPersonageScheduleById(Long id) {
		if(id!=null){
			bgPersonageScheduleMapper.getBgPersonageScheduleById(id);
		}
		return null;
	}

	//修改日程
	@Override
	public void updateBgPersonageSchedule(BgPersonageSchedule sche) {
		if(sche!=null){
			bgPersonageScheduleMapper.updateByPrimaryKey(sche);
		}
	}

	//删除日程
	@Override
	public void delBgPersonageSchedule(BgPersonageSchedule sche) {
		if(sche!=null){
			bgPersonageScheduleMapper.deleteByPrimaryKey(sche.getScheduleArrangeId());
		}
	}

	//查询所有日程
	@Override
	public List<BgPersonageSchedule> getAllBgPersonageSchedule(BgPersonageSchedule sche) {
		List<BgPersonageSchedule> list = bgPersonageScheduleMapper.selectByExample(null);
		return list;
	}
	
	

}
