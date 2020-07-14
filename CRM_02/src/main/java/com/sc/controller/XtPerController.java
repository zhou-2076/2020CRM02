package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Massage;
import com.sc.entity.XtPermission;
import com.sc.service.XtPermissionService;

@Controller
@RequestMapping("/xtperctrl")
public class XtPerController {
    @Autowired
    XtPermissionService xtPermissionService;
    
    @RequestMapping("/selectper.do")
    public ModelAndView selectPer(ModelAndView mav,
		@RequestParam(defaultValue="1")Integer pageNum,
		@RequestParam(defaultValue="10")Integer pageSize,
		XtPermission perion){
		System.out.println("进入查询权限分页了");
		
		PageInfo<XtPermission> page = xtPermissionService.selectPer(pageNum, pageSize, perion);
    	mav.addObject("p", page);
    	mav.setViewName("yzh_xt/admin-permission");
		return mav;
    	
    }
    @RequestMapping("/goaddper.do")
    public ModelAndView goaddPer(ModelAndView mav){
    	System.out.println("进入添加页面");
		mav.setViewName("yzh_xt/admin-permission-add");
    	return mav;
    	
    }
    
    @RequestMapping("/addper.do")
    @ResponseBody
    public Massage addPer(ModelAndView mav,XtPermission perion){
    	System.out.println("进入添加权限页面");
    	xtPermissionService.addPer(perion);
    	return new Massage("1","success","成功"); 	
    }
    
    @RequestMapping("/deleteper.do")
    @ResponseBody
    public Massage deletePer(ModelAndView mav,XtPermission perion){
    	System.out.println("进入删除权限页面"+perion);
    	xtPermissionService.deletePer(perion.getQxId());
    	return new Massage("1","success","成功"); 	
    }
}
