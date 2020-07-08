package com.sc.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.CgOrder;
import com.sc.entity.CgOrderDetail;
import com.sc.entity.CgRepGoods;
import com.sc.entity.CgSupMsg;
import com.sc.entity.KcGoodsInfo;
import com.sc.entity.XtCompanyInfo;
import com.sc.entity.XtUserInfo;

public interface CgService {

	// 查询所有采购单并分页,包括模糊
	public PageInfo<CgOrder> selectall(Integer pageNum, Integer pageSize, String title, Date time1, Date time2);

	// 批量删除/删除采购单
	public void delectoneandall(Long cgId);

	// 根据id查询单挑采购信息
	public CgOrder selectone(Long ordId);

	// 查出所有公司
	public List<XtCompanyInfo> selectallcompany();

	// 根据采购id查询采购详情表
	public PageInfo<CgOrderDetail> selectoneCgOrderDetailByCgid(Integer pageNum, Integer pageSize, Long cgid);

	// 修改采购单
	public void updatcgorder(CgOrder p);

	// 添加采购单
	public void addcgorder(CgOrder p);

	// 查出缺货商品
	public PageInfo<KcGoodsInfo> sekcGoodsInfo(Integer pageNum, Integer pageSize, BigDecimal kcnum, String name,
			BigDecimal num1, BigDecimal num2);

	// 查出对应的需采购单
	public CgRepGoods selectcgrone(Long productId);

	// 查询供应商信息
	public PageInfo<CgSupMsg> selectSup(Integer pageNum, Integer pageSize, String name);

	// 批量删除+删除供应商
	public void delectSup(Long gysId);

	// 根据id查询供应商信息
	public CgSupMsg selectSupbyid(Long gysId);

	// 修改供应商信息
	public void updatetSup(CgSupMsg c);

	// 添加供应商
	public void addSup(CgSupMsg c);

	// 根据员工id查到员工信息
	public XtUserInfo selecteUserinfoByworkerId(Long workerId);

	// 查询需采购表
	public PageInfo<CgRepGoods> selectcgr(Integer pageNum, Integer pageSize, String title, Date time1, Date time2);

	public List<CgRepGoods> selectcrgall();

	// 用过产品编号查询采购详情
	public CgOrderDetail selectDetail(Long cpId);

	// 修改采购详情
	public void updatecgxq(CgOrderDetail cg);

	// 添加采购请求
	public void addcgreq(CgRepGoods cgr);

	// 添加采购详情
	public void addcod(CgOrderDetail cod);

	// 需补货批量删除+删除
	public void delectcgr(Long cgRepId);

	// 采购详情批量删除+删除
	public void delectcgxq(Long cgXqId);

	// 根据id查询需采购
	public CgRepGoods selectcrgbyid(Long cgRepId);

	// 根据产品id查询需采购
	public CgRepGoods selectcrgbycpid(Long cpId);

	// 修改需采购
	public void updatetCgR(CgRepGoods c);

	// 根据商品id查询商品
	public KcGoodsInfo selectgood(Long productId);

}
