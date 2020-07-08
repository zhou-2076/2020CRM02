package com.sc.mapper;

import com.sc.entity.XsConnect;
import com.sc.entity.XsConnectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsConnectMapper {
    int countByExample(XsConnectExample example);

    int deleteByExample(XsConnectExample example);

    int deleteByPrimaryKey(Long connectId);

    int insert(XsConnect record);

    int insertSelective(XsConnect record);

    List<XsConnect> selectByExample(XsConnectExample example);

    XsConnect selectByPrimaryKey(Long connectId);

    int updateByExampleSelective(@Param("record") XsConnect record, @Param("example") XsConnectExample example);

    int updateByExample(@Param("record") XsConnect record, @Param("example") XsConnectExample example);

    int updateByPrimaryKeySelective(XsConnect record);

    int updateByPrimaryKey(XsConnect record);
}