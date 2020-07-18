package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XtJournal;
import com.sc.service.XtJournalService;

@Service
@RequestMapping("/xtjournalctrl")
public class XtJournalController {
	
	@Autowired
	XtJournalService xtJournalService;
	
	@RequestMapping("/selectJournal.do")
	public ModelAndView selectJournal(ModelAndView mav,
			@RequestParam(defaultValue = "1") Integer pageNum,
			@RequestParam(defaultValue = "20") Integer pageSize,
			XtJournal journal){

		PageInfo<XtJournal> page = xtJournalService.selectJournal(pageNum, pageSize, journal);
		System.out.println("-----------"+page.getList());
		mav.addObject("p", page);
		mav.setViewName("yzh_xt/system-log");
		return mav;
	}
	
}
