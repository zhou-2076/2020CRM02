package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtRoles;

public interface XtRolesService {
      public void addRoles(XtRoles roles);
      
      public void deleteRoles(Long roleId);
      
      public void updateRoles(XtRoles roles);
      
      public XtRoles getRoles(Long roleId);
      
      public PageInfo<XtRoles> selectRoles(Integer pageNum,Integer pageSize, XtRoles roles);
}
