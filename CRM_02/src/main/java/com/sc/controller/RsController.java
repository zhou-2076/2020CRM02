package com.sc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;

import com.sc.entity.XtUserInfo;
import com.sc.service.XtUserInfoService;
@Controller
@RequestMapping("/Rsctrl")
public class RsController {
	@Autowired
	XtUserInfoService xtUserInfoService;
	
	// 解决页面用get传过来date时间格式是string类型的错误
		@InitBinder
		public void initBinder(ServletRequestDataBinder bin) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			CustomDateEditor cust = new CustomDateEditor(sdf, true);
			bin.registerCustomEditor(Date.class, cust);
		}
		
		

		// 查询员工信息表分页方法
		@RequestMapping("/selectuserinfo.do")
		public ModelAndView selectuserinfo(ModelAndView mav, 
				@RequestParam(defaultValue = "1") Integer pageNum,
				@RequestParam(defaultValue = "5") Integer pageSize, XtUserInfo userInfo) {
			System.out.println("进入查询员工信息表分页方法了");
			
			
			PageInfo<XtUserInfo> page = xtUserInfoService.selectXtUserInof(pageNum, pageSize, userInfo);

			mav.addObject("page", page);
			mav.setViewName("wwj_rs/XtUserInfo_list");
			return mav;
		}
}
