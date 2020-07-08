package com.sc.mapper;

import com.sc.entity.XsOut;
import com.sc.entity.XsOutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsOutMapper {
    int countByExample(XsOutExample example);

    int deleteByExample(XsOutExample example);

    int deleteByPrimaryKey(Long saleId);

    int insert(XsOut record);

    int insertSelective(XsOut record);

    List<XsOut> selectByExample(XsOutExample example);

    XsOut selectByPrimaryKey(Long saleId);

    int updateByExampleSelective(@Param("record") XsOut record, @Param("example") XsOutExample example);

    int updateByExample(@Param("record") XsOut record, @Param("example") XsOutExample example);

    int updateByPrimaryKeySelective(XsOut record);

    int updateByPrimaryKey(XsOut record);
}