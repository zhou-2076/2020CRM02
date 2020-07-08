package com.sc.mapper;

import com.sc.entity.XsRun;
import com.sc.entity.XsRunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsRunMapper {
    int countByExample(XsRunExample example);

    int deleteByExample(XsRunExample example);

    int deleteByPrimaryKey(Long runId);

    int insert(XsRun record);

    int insertSelective(XsRun record);

    List<XsRun> selectByExample(XsRunExample example);

    XsRun selectByPrimaryKey(Long runId);

    int updateByExampleSelective(@Param("record") XsRun record, @Param("example") XsRunExample example);

    int updateByExample(@Param("record") XsRun record, @Param("example") XsRunExample example);

    int updateByPrimaryKeySelective(XsRun record);

    int updateByPrimaryKey(XsRun record);
}