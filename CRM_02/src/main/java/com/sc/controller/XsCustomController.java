package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
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
		mav.setViewName("ty/custom_list"); //在application.yml里面配置了，   前缀/WEB-INF  /   ty/custom_list    .jsp后缀
		return mav;
	}
}
