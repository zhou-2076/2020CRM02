package com.sc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sc.entity.BgSms;
import com.sc.entity.BgSmsDetail;
import com.sc.entity.BgSmsExample;

public interface BgSmsMapper {
    int countByExample(BgSmsExample example);

    int deleteByExample(BgSmsExample example);

    int deleteByPrimaryKey(Long smsId);

    int insert(BgSms record);

    int insertSelective(BgSms record);

    List<BgSms> selectByExample(BgSmsExample example);

    BgSms selectByPrimaryKey(Long smsId);

    int updateByExampleSelective(@Param("record") BgSms record, @Param("example") BgSmsExample example);

    int updateByExample(@Param("record") BgSms record, @Param("example") BgSmsExample example);

    int updateByPrimaryKeySelective(BgSms record);

    int updateByPrimaryKey(BgSms record);
    
    //关联查询
    public List<BgSms> gselect();
    
    //返回BgSms中自增id，可能以一次无法查询，需要nextval
    public Long zzId();
    
}