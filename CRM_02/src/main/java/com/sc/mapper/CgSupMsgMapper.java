package com.sc.mapper;

import com.sc.entity.CgSupMsg;
import com.sc.entity.CgSupMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgSupMsgMapper {
    int countByExample(CgSupMsgExample example);

    int deleteByExample(CgSupMsgExample example);

    int deleteByPrimaryKey(Long gysId);

    int insert(CgSupMsg record);

    int insertSelective(CgSupMsg record);

    List<CgSupMsg> selectByExample(CgSupMsgExample example);

    CgSupMsg selectByPrimaryKey(Long gysId);

    int updateByExampleSelective(@Param("record") CgSupMsg record, @Param("example") CgSupMsgExample example);

    int updateByExample(@Param("record") CgSupMsg record, @Param("example") CgSupMsgExample example);

    int updateByPrimaryKeySelective(CgSupMsg record);

    int updateByPrimaryKey(CgSupMsg record);
}