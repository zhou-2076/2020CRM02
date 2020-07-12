package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.KcWarehouseInfo;
import com.sc.mapper.KcWarehouseInfoMapper;
import com.sc.service.KcWareHouseInfoService;
@Service
public class KcWareHouseInfoServiceImpl implements KcWareHouseInfoService {
	@Autowired
	KcWarehouseInfoMapper  kcWarehouseInfoMapper;
	
	@Override
	public void addhouse(KcWarehouseInfo houseInfo) {
		// TODO Auto-generated method stub
		kcWarehouseInfoMapper.insert(houseInfo);
	}

	@Override
	public void updatehouse(KcWarehouseInfo houseInfo) {
		if(houseInfo!=null&&houseInfo.getWarehouseId()!=null){
			kcWarehouseInfoMapper.updateByPrimaryKey(houseInfo);
		}
	}

	@Override
	public void deletehouse(Long warehouseId) {
		if(warehouseId!=null){
			kcWarehouseInfoMapper.deleteByPrimaryKey(warehouseId);
		}

	}

	@Override
	public KcWarehouseInfo gethouse(Long warehouseId) {
		if(warehouseId!=null){
			return kcWarehouseInfoMapper.selectByPrimaryKey(warehouseId);
		}
		return null;
	}

	@Override
	public PageInfo<KcWarehouseInfo> selecthouse(Integer pageNum, Integer pageSize, KcWarehouseInfo houseInfo) {
		PageHelper.startPage(pageNum, pageSize);
		List<KcWarehouseInfo> list = kcWarehouseInfoMapper.selectByExample(null);
		PageInfo<KcWarehouseInfo> page=new PageInfo<KcWarehouseInfo>(list);
		
		return page;
	}

}
