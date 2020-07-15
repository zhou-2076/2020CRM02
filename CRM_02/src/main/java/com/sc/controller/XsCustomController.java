package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Massage;
import com.sc.entity.XsCustom;
import com.sc.service.XsCustomService;

@Controller
@RequestMapping("/xscustomctrl")
public class XsCustomController {
	
	@Autowired
	XsCustomService xsCustomService;
	
	//查询
	@RequestMapping("/selectcustom.do")
	public ModelAndView selectCustom(ModelAndView mav,
			@RequestParam(defaultValue = "1") Integer pageNum,//假如没有传参数，给一个默认值
			@RequestParam(defaultValue = "5") Integer pageSize,
			XsCustom custom){
		
		System.out.println("进入查询客户信息表的分页方法了");
		PageInfo<XsCustom> page= xsCustomService.selectCustom(pageNum, pageSize, custom);
		
		for (XsCustom cc : page.getList()) {
			System.out.println("@@@@@@@@@@@@@@@@@"+cc);
		}
		
		mav.addObject("p", page);
		mav.setViewName("ty_xs/custom_list"); //在application.yml里面配置了，   前缀/WEB-INF  /   ty/custom_list    .jsp后缀
		return mav;
	}
	//添加客户的跳转页面
	@RequestMapping("/goaddcustom.do")
	public ModelAndView goselectCustom(ModelAndView mav,XsCustom custom){
		System.out.println("进入添加客户页面"+custom);
		
		//修改操作
		if(custom.getCustomId()!=null){ //如果获取得到Id的话，
			custom=xsCustomService.getCustom(custom.getCustomId()); //就通过id获得整个对象
		}
		mav.setViewName("ty_xs/custom_add");
		mav.addObject("custom", custom);
		return mav;
	}
	
	//添加方法
	@RequestMapping("/addcustom.do")    
	@ResponseBody
	public Massage goaddCustom(ModelAndView mav,XsCustom custom){
		System.out.println("进入添加客户方法了"+custom);
		if(custom.getCustomId()!=null){ //如果获取得到Id的话，就修改
			xsCustomService.updateCustom(custom);
		}else{
			xsCustomService.addCustom(custom);
		}
		
		return new Massage("1","success","成功");
		
	}
	
	//删除方法
	@RequestMapping("/deletecustom.do")    //需要返回json，所以添加了一个message
	@ResponseBody
	public Massage deleteCustom(ModelAndView mav,XsCustom custom){
		System.out.println("进入删除客户方法了"+custom);
		xsCustomService.deleteCustom(custom.getCustomId());
		return new Massage("2","success","成功");
		
	}
}
