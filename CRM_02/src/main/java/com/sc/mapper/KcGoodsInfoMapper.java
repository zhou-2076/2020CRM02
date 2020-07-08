package com.sc.mapper;

import com.sc.entity.KcGoodsInfo;
import com.sc.entity.KcGoodsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KcGoodsInfoMapper {
    int countByExample(KcGoodsInfoExample example);

    int deleteByExample(KcGoodsInfoExample example);

    int deleteByPrimaryKey(Long productId);

    int insert(KcGoodsInfo record);

    int insertSelective(KcGoodsInfo record);

    List<KcGoodsInfo> selectByExample(KcGoodsInfoExample example);

    KcGoodsInfo selectByPrimaryKey(Long productId);

    int updateByExampleSelective(@Param("record") KcGoodsInfo record, @Param("example") KcGoodsInfoExample example);

    int updateByExample(@Param("record") KcGoodsInfo record, @Param("example") KcGoodsInfoExample example);

    int updateByPrimaryKeySelective(KcGoodsInfo record);

    int updateByPrimaryKey(KcGoodsInfo record);
}