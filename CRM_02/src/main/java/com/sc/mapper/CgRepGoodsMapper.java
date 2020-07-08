package com.sc.mapper;

import com.sc.entity.CgRepGoods;
import com.sc.entity.CgRepGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CgRepGoodsMapper {
    int countByExample(CgRepGoodsExample example);

    int deleteByExample(CgRepGoodsExample example);

    int deleteByPrimaryKey(Long cgRepId);

    int insert(CgRepGoods record);

    int insertSelective(CgRepGoods record);

    List<CgRepGoods> selectByExample(CgRepGoodsExample example);

    CgRepGoods selectByPrimaryKey(Long cgRepId);

    int updateByExampleSelective(@Param("record") CgRepGoods record, @Param("example") CgRepGoodsExample example);

    int updateByExample(@Param("record") CgRepGoods record, @Param("example") CgRepGoodsExample example);

    int updateByPrimaryKeySelective(CgRepGoods record);

    int updateByPrimaryKey(CgRepGoods record);
}