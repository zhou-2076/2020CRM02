package com.sc.mapper;

import com.sc.entity.KcWarehouseInfo;
import com.sc.entity.KcWarehouseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KcWarehouseInfoMapper {
    int countByExample(KcWarehouseInfoExample example);

    int deleteByExample(KcWarehouseInfoExample example);

    int deleteByPrimaryKey(Long warehouseId);

    int insert(KcWarehouseInfo record);

    int insertSelective(KcWarehouseInfo record);

    List<KcWarehouseInfo> selectByExample(KcWarehouseInfoExample example);

    KcWarehouseInfo selectByPrimaryKey(Long warehouseId);

    int updateByExampleSelective(@Param("record") KcWarehouseInfo record, @Param("example") KcWarehouseInfoExample example);

    int updateByExample(@Param("record") KcWarehouseInfo record, @Param("example") KcWarehouseInfoExample example);

    int updateByPrimaryKeySelective(KcWarehouseInfo record);

    int updateByPrimaryKey(KcWarehouseInfo record);
}