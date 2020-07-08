package com.sc.mapper;

import com.sc.entity.BgAssessIndex;
import com.sc.entity.BgAssessIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgAssessIndexMapper {
    int countByExample(BgAssessIndexExample example);

    int deleteByExample(BgAssessIndexExample example);

    int deleteByPrimaryKey(Long indexId);

    int insert(BgAssessIndex record);

    int insertSelective(BgAssessIndex record);

    List<BgAssessIndex> selectByExample(BgAssessIndexExample example);

    BgAssessIndex selectByPrimaryKey(Long indexId);

    int updateByExampleSelective(@Param("record") BgAssessIndex record, @Param("example") BgAssessIndexExample example);

    int updateByExample(@Param("record") BgAssessIndex record, @Param("example") BgAssessIndexExample example);

    int updateByPrimaryKeySelective(BgAssessIndex record);

    int updateByPrimaryKey(BgAssessIndex record);
}