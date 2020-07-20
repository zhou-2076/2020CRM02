package com.sc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.CgSupMsg;
import com.sc.entity.Massage;
import com.sc.entity.XsConRecord;
import com.sc.entity.XsConnect;
import com.sc.entity.XsCustom;
import com.sc.entity.XsDetail;
import com.sc.entity.XsOut;
import com.sc.mapper.XsOutMapper;
import com.sc.service.XsCustomService;
import com.sc.service.XsSaleService;

@Controller
@RequestMapping("/xssalectrl")
public class XsSaleController {
	
	@Autowired
	XsSaleService  xsSaleService;
	@Autowired
	XsCustomService xsCustomService;
	
	/* ***************************************************************/
	/* **********************从这里开始是销售出库表**************************/
	//查询 销售出库表
	@RequestMapping("/selectxsOut.do")
	public ModelAndView selectXsOut(ModelAndView mav,
			@RequestParam(defaultValue = "1") Integer pageNum,//假如没有传参数，给一个默认值
			@RequestParam(defaultValue = "5") Integer pageSize,
			XsOut Xsout){
		
		System.out.println("进入查询 销售出库表的分页方法了"+Xsout);
		System.out.println("--------------最小输入时间"+Xsout.getDatemin());//因为扩展属性是后加的，随意这里单独打印出来作为调试
		System.out.println("--------------最大输入时间"+Xsout.getDatemax());
		
		PageInfo<XsOut> page= xsSaleService.selectXsOut(pageNum, pageSize, Xsout);
		
		for (XsOut cc : page.getList()) {
			System.out.println("@@@@@@@@@@@@@@@@@"+cc);
		}
		
		
		mav.addObject("p", page);
		//要往页面上访问数据就往模型里装
		mav.addObject("out", Xsout);//前属性名，后属性值
		mav.setViewName("ty_xs/Xsout_list"); //在application.yml里面配置了，   前缀/WEB-INF  /   ty/custom_list    .jsp后缀
		return mav;
	}

	//添加销售出库单的跳转页面
	@RequestMapping("/goaddxsOut.do")
	public ModelAndView goselectXsOut(ModelAndView mav,XsOut Xsout,XsCustom custom){
		
		System.out.println("进入添加销售出库单页面"+Xsout);
		List<XsCustom> c1=xsCustomService.selectCustomAll();
		/*for (XsCustom cc : c1) {
			System.out.println("@@@@@@@@@@@@@@@@@"+cc);
		}*/
		
		//修改操作
		if(Xsout.getSaleId()!=null){ //如果获取得到Id的话，
			Xsout=xsSaleService.getXsOut(Xsout.getSaleId());//就通过id获得整个对象
		}
		mav.addObject("c", c1);
		mav.setViewName("ty_xs/Xsout_add");
		mav.addObject("Xsout", Xsout);
		return mav;
	}

	//添加 销售出库单方法
	@RequestMapping("/addxsOut.do")    
	@ResponseBody
	public Massage goaddXsOut(ModelAndView mav,XsOut Xsout){
		System.out.println("进入添加 销售出库单方法了"+Xsout);
		if(Xsout.getSaleId()!=null){ //如果获取得到Id的话，就修改
			xsSaleService.updateXsOut(Xsout);
			System.out.println("@@@@@@@@@@@@@@@@ 修改成功");
		}else{
			xsSaleService.addXsOut(Xsout);
		}
		
		return new Massage("1","success","成功");
		
	}
	
	//删除销售出库单方法
	@RequestMapping("/deletexsOut.do")    //需要返回json，所以添加了一个message
	@ResponseBody   //ResponseBody 配message
	public Massage deleteXsOut(ModelAndView mav,XsOut Xsout){
		System.out.println("进入删除销售出库单方法了"+Xsout);
		xsSaleService.deleteXsOut(Xsout.getSaleId());
		return new Massage("2","success","成功");
		
	}

	//批量删除销售出库单方法
	@RequestMapping("/deletexsOutall.do")    
	public String deleteXsOutAll(ModelAndView mav,Long[] ids){  /*复选框name=ids，方法参数也要是ids*/ 
		System.out.println("进入批量删除销售出库单方法了"+Arrays.toString(ids));//把数组转换成字符串
		if (ids != null && ids.length > 0) {
			for (Long long1 : ids) {
				xsSaleService.deleteXsOut(long1);
			}
		}
		//这里用重定向
		return "redirect:selectxsOut.do";
	}
	
	
	// 根据id查询销售出库单方法  (这是查一个)
	@RequestMapping("/getxsOutbyid.do")
	@ResponseBody   /*没有它就不能从笑脸显示内容*/
	public XsOut getXsOut(Long id) { //这个地方请一定要注意，你这里url : "<%=basePath%>xscustomctrl/getCustombyid.do?id=" + id, 
		System.out.println("进入根据id查询客户信息方法了"+id); //给的是什么，这里就要是什么！！！！！！！两次了 哥
		XsOut Xsout = xsSaleService.getXsOut(id);
		
		return Xsout;
	}
	
	
	/* ***************************************************************/
	/* **********************从这里开始是销售详情单**************************/

	//通过销售单id获得销售详情   这里指单个
	@RequestMapping("/getxsDetailbyid.do")
	@ResponseBody   
	public XsDetail getXsDetailById(Long id) { //这个地方请一定要注意，你这里url : "<%=basePath%>xscustomctrl/getCustombyid.do?id=" + id, 
		
		System.out.println("进入根据id查询客户联系人方法了"+id); //给的是什么，这里就要是什么！！！！！！！两次了 哥
		XsDetail xsdetail = xsSaleService.getXsDetail(id);
		return xsdetail;
	}
		
	// 通过销售单ID查询销售详情表
	@RequestMapping("/selectxsDetail.do")
	public ModelAndView selectXsDetail(ModelAndView mav,
			@RequestParam(defaultValue = "1") Integer pageNum,//假如没有传参数，给一个默认值
			@RequestParam(defaultValue = "5") Integer pageSize,
			Long id){
		
		System.out.println("进入通过销售单ID查询销售详情表方法了"+id);
	/*	XsDetail xsdetail=xsSaleService.getXsDetail(id);*/
		PageInfo<XsDetail> page= xsSaleService.selectXsDetailByid(pageNum, pageSize, id);
		
		for (XsDetail cc : page.getList()) {
			System.out.println("@@@@@@@@@@@@@@@@@"+cc);
		}
		
		mav.addObject("id1", id);
		/*mav.addObject("d", xsdetail);*/ /*这个没查到，是通过主键查对象，只能是主键*/
		mav.addObject("page", page);		
		mav.setViewName("ty_xs/xsdetail_list"); //在application.yml里面配置了，   前缀/WEB-INF  /   ty/custom_list    .jsp后缀
		return mav;
	}
	/*这里测试的时候发现一个bug，因为没有带Id,所以再次提交的时候，整个页面会出现所有的detail*/
	//直接查询销售详情表（商品编号的   模糊查询）   
	@RequestMapping("/selectxsDetail1.do") 
	public ModelAndView selectXsDetail1(ModelAndView mav,
			@RequestParam(defaultValue = "1") Integer pageNum,//假如没有传参数，给一个默认值
			@RequestParam(defaultValue = "5") Integer pageSize,
			XsDetail xsdetail){
			
		System.out.println("进入直接查询销售详情表方法了，不通过销售单编号"+xsdetail);
		PageInfo<XsDetail> page= xsSaleService.selectXsDetail(pageNum, pageSize, xsdetail);
			
		for (XsDetail cc : page.getList()) {
			System.out.println("@@@@@@@@@@@@@@@@@"+cc);
		}
		
		mav.addObject("page", page);
		//要往页面上访问数据就往模型里装
		mav.addObject("xsdetail", xsdetail);//前属性名，后属性值
		mav.setViewName("ty_xs/xsdetail_list"); //在application.yml里面配置了，   前缀/WEB-INF  /   ty/custom_list    .jsp后缀
		return mav;
		}
	
		//通过id删除销售详情表对象
		@RequestMapping("/deletexsDetail.do")    //需要返回json，所以添加了一个message
		@ResponseBody   //ResponseBody 配message
		public Massage deleteXsDetail(ModelAndView mav,XsDetail xsdetail){
			System.out.println("进入删除销售详情表对象方法了"+xsdetail);
	
			xsSaleService.deleteXsDetail(xsdetail.getSaleDetailId());
			return new Massage("2","success","成功");
			
		}
		
		//批量删除销售详情表  方法
		@RequestMapping("/deletexsDetailall.do")    
		public String deleteXsDetailAll(ModelAndView mav,Long[] ids){  /*复选框name=ids，方法参数也要是ids*/ 
			System.out.println("进入批量删除销售详情方法了"+Arrays.toString(ids));//把数组转换成字符串
			if (ids != null && ids.length > 0) {
				for (Long long1 : ids) {
					xsSaleService.deleteXsDetail(long1);
				}
			}
			//这里用重定向
			return "redirect:selectxsDetail.do";
		}
				
		//添加销售详情表的跳转页面
		@RequestMapping("/goaddxsDetail.do")
		public ModelAndView goselectXsDetail(ModelAndView mav,XsDetail xsdetail){
			System.out.println("进入添加销售详情页面"+xsdetail);
			
			//修改操作
			if(xsdetail.getSaleDetailId()!=null){ //如果获取得到Id的话，
				 xsdetail=xsSaleService.getXsDetail(xsdetail.getSaleDetailId());//就通过id获得整个对象
			}
			mav.setViewName("ty_xs/xsdetail_add");
			mav.addObject("xsdetail", xsdetail);
			return mav;
		}
		
		//添加销售详情表对象
		@RequestMapping("/addxsDetail.do")    
		@ResponseBody
		public Massage goaddXsDetail(ModelAndView mav,XsDetail xsdetail){
			
			System.out.println("进入添加销售详情方法了"+xsdetail);
			if(xsdetail.getSaleDetailId()!=null){ //如果获取得到Id的话，就修改
				xsSaleService.updateXsDetail(xsdetail);
			}else{
				xsSaleService.addXsDetail(xsdetail);
			}
			return new Massage("1","success","成功");
		}
		
}