package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.KcGoodsInfo;
import com.sc.entity.XtUserInfo;

public interface KcGoodsInfoService {
	
	public PageInfo<KcGoodsInfo> selectGoodsInfo(Integer pageNum, Integer pageSize,KcGoodsInfo goodsInfo);

	   // 修改信息
		public void updateGoodsInfo(KcGoodsInfo goodsInfo);
		
		//删除
		public void delectGoodsInfo(Long productId);
		
		public void deletehouse(Long productId);

		//根据ID查询商品信息
	    public KcGoodsInfo getGoodsInfo(Long productId);
	    
	    public PageInfo<KcGoodsInfo> selectGoodsInfoByid(Integer pageNum, Integer pageSize,Long productId);
}

