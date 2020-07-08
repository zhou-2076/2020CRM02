package com.sc.mapper;

import com.sc.entity.XtDutiesInfo;
import com.sc.entity.XtDutiesInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtDutiesInfoMapper {
    int countByExample(XtDutiesInfoExample example);

    int deleteByExample(XtDutiesInfoExample example);

    int deleteByPrimaryKey(Long dutiesId);

    int insert(XtDutiesInfo record);

    int insertSelective(XtDutiesInfo record);

    List<XtDutiesInfo> selectByExample(XtDutiesInfoExample example);

    XtDutiesInfo selectByPrimaryKey(Long dutiesId);

    int updateByExampleSelective(@Param("record") XtDutiesInfo record, @Param("example") XtDutiesInfoExample example);

    int updateByExample(@Param("record") XtDutiesInfo record, @Param("example") XtDutiesInfoExample example);

    int updateByPrimaryKeySelective(XtDutiesInfo record);

    int updateByPrimaryKey(XtDutiesInfo record);
}