package com.sc.mapper;

import com.sc.entity.BgPersonageSchedule;
import com.sc.entity.BgPersonageScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgPersonageScheduleMapper {
    int countByExample(BgPersonageScheduleExample example);

    int deleteByExample(BgPersonageScheduleExample example);

    int deleteByPrimaryKey(Long scheduleArrangeId);

    int insert(BgPersonageSchedule record);

    int insertSelective(BgPersonageSchedule record);

    List<BgPersonageSchedule> selectByExample(BgPersonageScheduleExample example);

    BgPersonageSchedule selectByPrimaryKey(Long scheduleArrangeId);

    int updateByExampleSelective(@Param("record") BgPersonageSchedule record, @Param("example") BgPersonageScheduleExample example);

    int updateByExample(@Param("record") BgPersonageSchedule record, @Param("example") BgPersonageScheduleExample example);

    int updateByPrimaryKeySelective(BgPersonageSchedule record);

    int updateByPrimaryKey(BgPersonageSchedule record);
    
    //添加日程
	public void addBgPersonageSchedule(BgPersonageSchedule sche);
	
    //ͨ通过id查询
	public BgPersonageSchedule getBgPersonageScheduleById(Long id);
	
	//修改日程
	public void updateBgPersonageSchedule(BgPersonageSchedule sche);
	
	//删除日程
	public void delSchedule(BgPersonageSchedule sche);
	
	//查询所有日程
	public List<BgPersonageSchedule> getAllBgPersonageSchedule(BgPersonageSchedule sche);

	//查询最大idֵ
	public String getMaxIdoOfficePerSche();

	//查询各自的日程
	//public List<OOfficePerSche> getOPerAgendaList(OOfficePerSche oOfficePerSche);
    
    
}