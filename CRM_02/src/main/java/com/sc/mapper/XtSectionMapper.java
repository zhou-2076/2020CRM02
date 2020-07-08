package com.sc.mapper;

import com.sc.entity.XtSection;
import com.sc.entity.XtSectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtSectionMapper {
    int countByExample(XtSectionExample example);

    int deleteByExample(XtSectionExample example);

    int deleteByPrimaryKey(Long sectionId);

    int insert(XtSection record);

    int insertSelective(XtSection record);

    List<XtSection> selectByExample(XtSectionExample example);

    XtSection selectByPrimaryKey(Long sectionId);

    int updateByExampleSelective(@Param("record") XtSection record, @Param("example") XtSectionExample example);

    int updateByExample(@Param("record") XtSection record, @Param("example") XtSectionExample example);

    int updateByPrimaryKeySelective(XtSection record);

    int updateByPrimaryKey(XtSection record);
}