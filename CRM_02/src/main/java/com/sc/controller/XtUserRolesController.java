package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtUserRoles;
import com.sc.service.XtUserRolesService;

@Controller
@RequestMapping("/xturolesctrl")
public class XtUserRolesController {

	@Autowired
	XtUserRolesService xtUserRolesService;
	
	@RequestMapping("/selectUR.do")
	public ModelAndView selectUR(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum, 
			@RequestParam(defaultValue="10")Integer pageSize,
			XtUserRoles userrole){
		
		PageInfo<XtUserRoles> page = xtUserRolesService.selectUR(pageNum, pageSize, userrole);
		mav.addObject("p", page);
		mav.setViewName("yzh_xt/admin-userRole");
		return mav;
	}
}
