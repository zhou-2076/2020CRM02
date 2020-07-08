package com.sc.mapper;

import com.sc.entity.CgOrder;
import com.sc.entity.CgOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgOrderMapper {
    int countByExample(CgOrderExample example);

    int deleteByExample(CgOrderExample example);

    int deleteByPrimaryKey(Long cgId);

    int insert(CgOrder record);

    int insertSelective(CgOrder record);

    List<CgOrder> selectByExample(CgOrderExample example);

    CgOrder selectByPrimaryKey(Long cgId);

    int updateByExampleSelective(@Param("record") CgOrder record, @Param("example") CgOrderExample example);

    int updateByExample(@Param("record") CgOrder record, @Param("example") CgOrderExample example);

    int updateByPrimaryKeySelective(CgOrder record);

    int updateByPrimaryKey(CgOrder record);
}