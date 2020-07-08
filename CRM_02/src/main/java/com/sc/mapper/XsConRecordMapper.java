package com.sc.mapper;

import com.sc.entity.XsConRecord;
import com.sc.entity.XsConRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XsConRecordMapper {
    int countByExample(XsConRecordExample example);

    int deleteByExample(XsConRecordExample example);

    int deleteByPrimaryKey(Long conRecordId);

    int insert(XsConRecord record);

    int insertSelective(XsConRecord record);

    List<XsConRecord> selectByExample(XsConRecordExample example);

    XsConRecord selectByPrimaryKey(Long conRecordId);

    int updateByExampleSelective(@Param("record") XsConRecord record, @Param("example") XsConRecordExample example);

    int updateByExample(@Param("record") XsConRecord record, @Param("example") XsConRecordExample example);

    int updateByPrimaryKeySelective(XsConRecord record);

    int updateByPrimaryKey(XsConRecord record);
}