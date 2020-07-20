package com.sc.controller;

import java.util.Arrays;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.KcGoodsInfo;
import com.sc.entity.KcWarehouseInfo;
import com.sc.entity.Massage;
import com.sc.entity.XsCustom;
import com.sc.service.KcGoodsInfoService;
import com.sc.service.KcWareHouseInfoService;

@Controller
@RequestMapping("/goodsctrl")
public class KcGoodsIofoController {
	
	@Autowired
	KcGoodsInfoService kcGoodsInfoService;
	

	@Autowired
	KcWareHouseInfoService kcWareHouseInfoService;
	// 模糊查询商品表
		@RequestMapping("/selectgoodsInfo.do")
		public ModelAndView selectgoodsInfo(ModelAndView mav,
				@RequestParam(defaultValue = "1") Integer pageNum,//假如没有传参数，给一个默认值
				@RequestParam(defaultValue = "10") Integer pageSize,
				KcGoodsInfo goodsInfo){
			
			System.out.println("进入查询客户信息表的分页方法了"+goodsInfo);
			System.out.println("--------------最小输入时间"+goodsInfo.getDatemin());//因为扩展属性是后加的，随意这里单独打印出来作为调试
			System.out.println("--------------最大输入时间"+goodsInfo.getDatemax());
			
			PageInfo<KcGoodsInfo> page= kcGoodsInfoService.selectGoodsInfo(pageNum, pageSize, goodsInfo);
			
			for (KcGoodsInfo cc : page.getList()) {
				System.out.println("@@@@@@@@@@@@@@@@@"+cc);
			}
			
			
			mav.addObject("p", page);
			//要往页面上访问数据就往模型里装
			mav.addObject("g", goodsInfo);//前属性名，后属性值
			mav.setViewName("wwj_rs/KcGoodsInfo_list"); //在application.yml里面配置了，   前缀/WEB-INF  /   ty/custom_list    .jsp后缀
			return mav;
		}
		
		
		
		@RequestMapping("/gogoods.do")
		public ModelAndView goGoods(ModelAndView mav,KcWarehouseInfo huseInfo,HttpSession session,
				@RequestParam(defaultValue = "1") Integer pageNum,//假如没有传参数，给一个默认值
				@RequestParam(defaultValue = "10") Integer pageSize,
				KcGoodsInfo goodsInfo){
			
			
			//把BigDecimal 转换成 Long数据类型
			//获取到商品表中仓库的编号，并且把BigDecimal 转换成 Long数据类型（这里商品表中仓库的编号和仓库表中商品的编号不同
			                                               //所以要转换）
	        Long ckid = goodsInfo.getWarehouseId().longValue();
		    //获取到仓库ID
		    KcWarehouseInfo gethouse = kcWareHouseInfoService.gethouse(ckid);
		    
			PageInfo<KcGoodsInfo> page= kcGoodsInfoService.selectGoodsInfo(pageNum, pageSize, goodsInfo);
			mav.addObject("ck", gethouse);
			mav.addObject("p", page);
			mav.setViewName("wwj_rs/KcGoodsInfo_list");	
			session.setAttribute("nowhuseInfoid", huseInfo.getWarehouseId());//session.getAttribute("nowhuseInfoid")
			
			return mav;
		}	
		
		

		//添加商品的跳转页面
		@RequestMapping("/goaddgoods.do")
		public ModelAndView goselectCustom(ModelAndView mav,KcGoodsInfo goodsInfo){
			System.out.println("进入添加商品页面"+goodsInfo);
			
			//修改操作
			if(goodsInfo.getProductId()!=null){ //如果获取得到Id的话，
				goodsInfo=kcGoodsInfoService.getGoodsInfo(goodsInfo.getProductId()); //就通过id获得整个对象
			}
			mav.setViewName("wwj_rs/KcGoodsadd");
			mav.addObject("g", goodsInfo);
			return mav;
		}
		
		//添加方法
		@RequestMapping("/addcustom.do")    
		@ResponseBody
		public Massage goaddCustom(ModelAndView mav,KcGoodsInfo goodsInfo){
			System.out.println("进入添加客户方法了"+goodsInfo);
			if(goodsInfo.getProductId()!=null){ //如果获取得到Id的话，就修改
				kcGoodsInfoService.updateGoodsInfo(goodsInfo);
			}
			
			
			return new Massage("1","success","成功");
			
		}
		
		//商品的批量删除
				@RequestMapping("/deletegoodsAll.do")
				public String deletegoodsAll(ModelAndView mav,Long[]  ids){
					System.out.println("进入批量删除:"+Arrays.toString(ids));
					if(ids!=null&&ids.length>0){
						for (Long id : ids) {
							kcGoodsInfoService.deletehouse(id);
						}
					}
					
					return "redirect:selectgoodsInfo.do";
				}
				
			
				
				//查询商品的信息明细
				@RequestMapping("/selectgoodsxq.do")
				@ResponseBody
				public KcGoodsInfo selectgoodsxq(Long id ){
					System.out.println("进入商品详情页面");
					KcGoodsInfo GoodsInfo= kcGoodsInfoService.getGoodsInfo(id);
					return GoodsInfo;
				}

}
