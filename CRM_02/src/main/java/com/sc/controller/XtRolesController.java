package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtRoles;
import com.sc.service.XtRolesService;

@Controller
@RequestMapping("/xtrolesctrl")
public class XtRolesController {

	@Autowired //注入
	XtRolesService xtRolesService;
	
	@RequestMapping("/selectroles.do")
	public ModelAndView selectRoles(ModelAndView mav,
			//给默认值
			@RequestParam(defaultValue="1")Integer pageNum, 
			@RequestParam(defaultValue="10")Integer pageSize,
			XtRoles roles){
		    System.out.println("进入查询角色分页方法"+roles);
		    
		    //调用查询
		    PageInfo<XtRoles> page = xtRolesService.selectRoles(pageNum, pageSize, roles);
		    //把page存进mav
		    mav.addObject("p", page);
		    //视图名称
		    mav.setViewName("yzh_xt/admin-role");
		return mav;
		
	}
	
	@RequestMapping("/goaddroles.do")
	public ModelAndView goaddRoles(ModelAndView mav){
		System.out.println("进入添加页面");
		mav.setViewName("yzh_xt/admin-addrole");
		return mav;
	}
}
