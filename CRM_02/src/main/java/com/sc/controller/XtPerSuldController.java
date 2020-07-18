package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtPermissionSubfield;
import com.sc.service.XtPerSubfieldService;

@Controller
@RequestMapping("/xtpersuldctrl")
public class XtPerSuldController {

	//依赖Service
	@Autowired
	XtPerSubfieldService xtPerSubfieldService;
	
	@RequestMapping("/selectXtPerSubld.do")
	public ModelAndView selectXtPerSubld(ModelAndView mav,
			Integer pageNum, Integer pageSize,
			XtPermissionSubfield xtpersubld){   
		System.out.println("");
		
		PageInfo<XtPermissionSubfield> page = xtPerSubfieldService.selectXtPerSubld(pageNum, pageSize, xtpersubld);
		
		mav.addObject("p", page);
		mav.setViewName("");	
		return mav;
		
	}
}
