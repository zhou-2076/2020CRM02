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
}