package com.sc.mapper;

import com.sc.entity.XtUserNum;
import com.sc.entity.XtUserNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtUserNumMapper {
    int countByExample(XtUserNumExample example);

    int deleteByExample(XtUserNumExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(XtUserNum record);

    int insertSelective(XtUserNum record);

    List<XtUserNum> selectByExample(XtUserNumExample example);

    XtUserNum selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") XtUserNum record, @Param("example") XtUserNumExample example);

    int updateByExample(@Param("record") XtUserNum record, @Param("example") XtUserNumExample example);

    int updateByPrimaryKeySelective(XtUserNum record);

    int updateByPrimaryKey(XtUserNum record);
}