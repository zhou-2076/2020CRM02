package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.KcWarehouseInfo;

public interface KcWareHouseInfoService {

    public void addhouse(KcWarehouseInfo houseInfo);
	
	public void updatehouse(KcWarehouseInfo houseInfo);
	
	public void deletehouse(Long warehouseId);
	
	public KcWarehouseInfo gethouse(Long warehouseId);
	
	public PageInfo<KcWarehouseInfo> selecthouse(Integer pageNum,Integer pageSize,KcWarehouseInfo houseInfo);

}
