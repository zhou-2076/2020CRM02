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
import com.sc.entity.BgTaskDetail;
import com.sc.entity.XtUserInfo;
import com.sc.mapper.BgAssessIndexMapper;
import com.sc.mapper.BgAssessTaskMapper;
import com.sc.mapper.BgTaskDetailMapper;
import com.sc.mapper.XtUserInfoMapper;
import com.sc.service.BgService;

//业务类
@Service
public class BgServiceimpl implements BgService {
	
	@Autowired
	BgAssessIndexMapper bgAssessIndexMapper;
	@Autowired
	BgAssessTaskMapper bgAssessTaskMapper;
	@Autowired
	XtUserInfoMapper xtUserInfoMapper;
	@Autowired
	BgTaskDetailMapper bgTaskDetailMapper;

	
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

	
	
	//////////////////
	@Override
	public PageInfo<BgAssessTask> selectBgAssessTask(Integer pageNum, Integer pageSize, BgAssessTask bgAssessTask,
			String sousuo) {
		List<BgAssessTask> list = bgAssessTaskMapper.select();
		PageInfo<BgAssessTask> page=new PageInfo<BgAssessTask>(list);
		return page;
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
	
	
	
	

}
