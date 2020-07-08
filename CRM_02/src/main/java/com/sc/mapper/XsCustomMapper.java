package com.sc.mapper;

import com.sc.entity.XsCustom;
import com.sc.entity.XsCustomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsCustomMapper {
    int countByExample(XsCustomExample example);

    int deleteByExample(XsCustomExample example);

    int deleteByPrimaryKey(Long customId);

    int insert(XsCustom record);

    int insertSelective(XsCustom record);

    List<XsCustom> selectByExample(XsCustomExample example);

    XsCustom selectByPrimaryKey(Long customId);

    int updateByExampleSelective(@Param("record") XsCustom record, @Param("example") XsCustomExample example);

    int updateByExample(@Param("record") XsCustom record, @Param("example") XsCustomExample example);

    int updateByPrimaryKeySelective(XsCustom record);

    int updateByPrimaryKey(XsCustom record);
}