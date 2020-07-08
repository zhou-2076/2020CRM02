package com.sc.mapper;

import com.sc.entity.BgAssessTask;
import com.sc.entity.BgAssessTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgAssessTaskMapper {
    int countByExample(BgAssessTaskExample example);

    int deleteByExample(BgAssessTaskExample example);

    int deleteByPrimaryKey(Long taskId);

    int insert(BgAssessTask record);

    int insertSelective(BgAssessTask record);

    List<BgAssessTask> selectByExample(BgAssessTaskExample example);

    BgAssessTask selectByPrimaryKey(Long taskId);

    int updateByExampleSelective(@Param("record") BgAssessTask record, @Param("example") BgAssessTaskExample example);

    int updateByExample(@Param("record") BgAssessTask record, @Param("example") BgAssessTaskExample example);

    int updateByPrimaryKeySelective(BgAssessTask record);

    int updateByPrimaryKey(BgAssessTask record);
}