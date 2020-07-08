package com.sc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sc.entity.XtPermission;
import com.sc.entity.XtPermissionExample;

public interface XtPermissionMapper {
    int countByExample(XtPermissionExample example);

    int deleteByExample(XtPermissionExample example);

    int deleteByPrimaryKey(Long qxId);

    int insert(XtPermission record);

    int insertSelective(XtPermission record);

    List<XtPermission> selectByExample(XtPermissionExample example);
    
    //根据角色id查询权限
    List<XtPermission> selectPermission(Long roleId);

    XtPermission selectByPrimaryKey(Long qxId);

    int updateByExampleSelective(@Param("record") XtPermission record, @Param("example") XtPermissionExample example);

    int updateByExample(@Param("record") XtPermission record, @Param("example") XtPermissionExample example);

    int updateByPrimaryKeySelective(XtPermission record);

    int updateByPrimaryKey(XtPermission record);
}