package com.sc.mapper;

import com.sc.entity.XtPermissionSubfield;
import com.sc.entity.XtPermissionSubfieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtPermissionSubfieldMapper {
    int countByExample(XtPermissionSubfieldExample example);

    int deleteByExample(XtPermissionSubfieldExample example);

    int deleteByPrimaryKey(Long qxFlId);

    int insert(XtPermissionSubfield record);

    int insertSelective(XtPermissionSubfield record);

    List<XtPermissionSubfield> selectByExample(XtPermissionSubfieldExample example);

    XtPermissionSubfield selectByPrimaryKey(Long qxFlId);

    int updateByExampleSelective(@Param("record") XtPermissionSubfield record, @Param("example") XtPermissionSubfieldExample example);

    int updateByExample(@Param("record") XtPermissionSubfield record, @Param("example") XtPermissionSubfieldExample example);

    int updateByPrimaryKeySelective(XtPermissionSubfield record);

    int updateByPrimaryKey(XtPermissionSubfield record);
}