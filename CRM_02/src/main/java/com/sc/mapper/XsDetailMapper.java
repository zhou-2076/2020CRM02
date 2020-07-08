package com.sc.mapper;

import com.sc.entity.XsDetail;
import com.sc.entity.XsDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsDetailMapper {
    int countByExample(XsDetailExample example);

    int deleteByExample(XsDetailExample example);

    int deleteByPrimaryKey(Long saleDetailId);

    int insert(XsDetail record);

    int insertSelective(XsDetail record);

    List<XsDetail> selectByExample(XsDetailExample example);

    XsDetail selectByPrimaryKey(Long saleDetailId);

    int updateByExampleSelective(@Param("record") XsDetail record, @Param("example") XsDetailExample example);

    int updateByExample(@Param("record") XsDetail record, @Param("example") XsDetailExample example);

    int updateByPrimaryKeySelective(XsDetail record);

    int updateByPrimaryKey(XsDetail record);
}