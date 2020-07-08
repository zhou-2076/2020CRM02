package com.sc.mapper;

import com.sc.entity.XtCompanyInfo;
import com.sc.entity.XtCompanyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XtCompanyInfoMapper {
    int countByExample(XtCompanyInfoExample example);

    int deleteByExample(XtCompanyInfoExample example);

    int deleteByPrimaryKey(Long companyId);

    int insert(XtCompanyInfo record);

    int insertSelective(XtCompanyInfo record);

    List<XtCompanyInfo> selectByExample(XtCompanyInfoExample example);

    XtCompanyInfo selectByPrimaryKey(Long companyId);

    int updateByExampleSelective(@Param("record") XtCompanyInfo record, @Param("example") XtCompanyInfoExample example);

    int updateByExample(@Param("record") XtCompanyInfo record, @Param("example") XtCompanyInfoExample example);

    int updateByPrimaryKeySelective(XtCompanyInfo record);

    int updateByPrimaryKey(XtCompanyInfo record);
}