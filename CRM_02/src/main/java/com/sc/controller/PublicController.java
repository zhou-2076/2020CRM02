package com.sc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.XtCompanyInfo;
import com.sc.entity.XtDutiesInfo;
import com.sc.entity.XtPermission;
import com.sc.entity.XtRoles;
import com.sc.entity.XtSection;
import com.sc.entity.XtUserInfo;
import com.sc.entity.XtUserNum;
import com.sc.service.PublicService;

@Controller
@RequestMapping("/publicctrl")
public class PublicController {

	@Autowired
	PublicService publicService;

	// 跳转到welcome.jsp页面
	@RequestMapping("/welcome.do")
	public ModelAndView welcome(ModelAndView mav, long userId, HttpSession session) {
		List<XtRoles> list = publicService.selecteUserRoles(userId);
		for (XtRoles sysUroles : list) {
			List<XtPermission> Permissionlist = publicService.selectPermission(sysUroles.getRoleId());
			sysUroles.setXtPermission(Permissionlist);
		}
		XtUserNum nowuser = (XtUserNum) session.getAttribute("nowuser");
		// 获取到用户的员工信息
		XtUserInfo xtUserInfo = null;
		if (nowuser.getStaffId() != null && !nowuser.getStaffId().equals("")) {
			xtUserInfo = publicService.selecteUserinfoByworkerId(nowuser.getStaffId());
		}
		// 查询公司信息
		XtCompanyInfo xtCompanyInfo = null;
		if (xtUserInfo.getCompanyId() != null && !xtUserInfo.getCompanyId().equals("")) {
			xtCompanyInfo = publicService.selecteCompanyInfoBy(xtUserInfo.getCompanyId());
		}
		// 查询职务
		XtDutiesInfo xtDutiesInfo = null;
		if (xtUserInfo != null && xtUserInfo.getDutiesId() != null && !xtUserInfo.getDutiesId().equals("")) {
			xtDutiesInfo = publicService.selecteXtDutiesInfoBydutiesId(xtUserInfo.getDutiesId());
		}
		// 查询部门
		XtSection xtSection = null;
		if (xtDutiesInfo != null && xtDutiesInfo.getSectionId() != null && !xtDutiesInfo.getSectionId().equals("")) {
			xtSection = publicService.selecteXtSectionBysectionId(xtDutiesInfo.getSectionId());
		}
		if (xtUserInfo != null) {

			nowuser.setCzrid(xtUserInfo.getWorkerId());
			nowuser.setCzrmc(xtUserInfo.getWorkerName());
		}

		if (xtCompanyInfo != null) {
			nowuser.setGsid(xtCompanyInfo.getCompanyId());
			nowuser.setGsmc(xtCompanyInfo.getCompanyName());
		}

		if (xtDutiesInfo != null) {
			nowuser.setZwid(xtDutiesInfo.getDutiesId());
			nowuser.setZwmc(xtDutiesInfo.getDutiesName());
		}
		if (xtSection != null) {
			nowuser.setBmid(xtSection.getSectionId());
			nowuser.setBmmc(xtSection.getSectionName());
		}
		session.setAttribute("public", nowuser);
		mav.addObject("juese", list);
		mav.setViewName("zy_public/welcome");
		return mav;
	}

}
