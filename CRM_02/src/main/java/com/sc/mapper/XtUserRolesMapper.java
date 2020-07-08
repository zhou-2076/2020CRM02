package com.sc.mapper;

import com.sc.entity.XtUserRoles;
import com.sc.entity.XtUserRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtUserRolesMapper {
    int countByExample(XtUserRolesExample example);

    int deleteByExample(XtUserRolesExample example);

    int deleteByPrimaryKey(Long userRolesId);

    int insert(XtUserRoles record);

    int insertSelective(XtUserRoles record);

    List<XtUserRoles> selectByExample(XtUserRolesExample example);

    XtUserRoles selectByPrimaryKey(Long userRolesId);

    int updateByExampleSelective(@Param("record") XtUserRoles record, @Param("example") XtUserRolesExample example);

    int updateByExample(@Param("record") XtUserRoles record, @Param("example") XtUserRolesExample example);

    int updateByPrimaryKeySelective(XtUserRoles record);

    int updateByPrimaryKey(XtUserRoles record);
}