package com.sc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sc.entity.XtRoles;
import com.sc.entity.XtRolesExample;

public interface XtRolesMapper {
    int countByExample(XtRolesExample example);

    int deleteByExample(XtRolesExample example);

    int deleteByPrimaryKey(Long roleId);

    int insert(XtRoles record);

    int insertSelective(XtRoles record);

    List<XtRoles> selectByExample(XtRolesExample example);

    XtRoles selectByPrimaryKey(Long roleId);
    
    //根据用户id查看角色
    List<XtRoles> selecteUserRoles(Long userId);

    int updateByExampleSelective(@Param("record") XtRoles record, @Param("example") XtRolesExample example);

    int updateByExample(@Param("record") XtRoles record, @Param("example") XtRolesExample example);

    int updateByPrimaryKeySelective(XtRoles record);

    int updateByPrimaryKey(XtRoles record);
}