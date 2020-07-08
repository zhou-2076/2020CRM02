package com.sc.mapper;

import com.sc.entity.XtUserInfo;
import com.sc.entity.XtUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtUserInfoMapper {
    int countByExample(XtUserInfoExample example);

    int deleteByExample(XtUserInfoExample example);

    int deleteByPrimaryKey(Long workerId);

    int insert(XtUserInfo record);

    int insertSelective(XtUserInfo record);

    List<XtUserInfo> selectByExample(XtUserInfoExample example);

    XtUserInfo selectByPrimaryKey(Long workerId);

    int updateByExampleSelective(@Param("record") XtUserInfo record, @Param("example") XtUserInfoExample example);

    int updateByExample(@Param("record") XtUserInfo record, @Param("example") XtUserInfoExample example);

    int updateByPrimaryKeySelective(XtUserInfo record);

    int updateByPrimaryKey(XtUserInfo record);
}