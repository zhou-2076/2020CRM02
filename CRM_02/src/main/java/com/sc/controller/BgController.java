package com.sc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.BgAssessIndex;
import com.sc.service.BgService;

@Controller
@RequestMapping("Bgctrl")
public class BgController {
	
	@Autowired
	BgService bgService;
	
	//分页查询
	@RequestMapping("selectBgAssessIndex.do")
	public ModelAndView selectBgAssessIndex(ModelAndView mav,@RequestParam(defaultValue="1") Integer pageNum,@RequestParam(defaultValue="5") Integer pageSize,BgAssessIndex bgAssessIndex,String sousuo){
		System.out.println("1.进入查询控制器");
		System.out.println("获取搜索框的值:"+sousuo);
		PageInfo<BgAssessIndex> page= bgService.selectBgAssessIndex(pageNum, pageSize, bgAssessIndex,sousuo);
		System.out.println(page);
		mav.addObject("p", page);
		mav.setViewName("BG/BgAssessIndex");
		return mav;
	}
	
	//添加
	@RequestMapping("addBgAssessIndex.do")
	@ResponseBody
	public void addBgAssessIndex(ModelAndView mav,BgAssessIndex bgAssessIndex) {
		System.out.println("2.进入添加控制器");
		System.out.println("添加获取到的数据:"+bgAssessIndex);
		
		Date date = new Date();
		bgAssessIndex.setLastModifyDtae(date);
		System.out.println(bgAssessIndex.getLastModifyDtae());
		
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("当前时间"+dateFormat.format(date));
		bgAssessIndex.setLastModifyDtae(date);
		System.out.println(bgAssessIndex.getLastModifyDtae());
		
		bgService.addBgAssessIndex(bgAssessIndex);
		mav.setViewName("redirect:selectBgAssessIndex.do");
	}
	
	
	
	//通过id查询
	@RequestMapping("getBgAssessIndex.do")
	@ResponseBody
	public BgAssessIndex goupdateBgAssessIndex(long id) {
		System.out.println("---通过id获取考核详情");
		BgAssessIndex bgAssessIndex=bgService.getBgAssessIndex(id);
		System.out.println(bgAssessIndex);
		return bgAssessIndex;
	}
	
	//修改考核任务
	@RequestMapping("updateBgAssessIndex.do")
	public ModelAndView updateBgAssessIndex(ModelAndView mav,BgAssessIndex bgAssessIndex) {
		System.out.println("---修改考核信息---");
		System.out.println("---修改获取到的数据:"+bgAssessIndex+"---"+bgAssessIndex.getIndexId());
		
		Date date = new Date();
		bgAssessIndex.setLastModifyDtae(date);
		
		bgService.updateBgAssessIndex(bgAssessIndex);
		mav.setViewName("redirect:selectBgAssessIndex.do");
		return mav;
	}
	
	//删除考核任务,批量删除
	@RequestMapping("deleteBgAssessIndex.do")
	public ModelAndView deleteBgAssessIndex(ModelAndView mav,BgAssessIndex bgAssessIndex,long[] id) {
		System.out.println("---删除考核信息---");
		if (id != null && id.length > 0) {
			for (Long long1 : id) {
				bgAssessIndex.setIndexId(long1);
				bgService.deleteBgAssessIndex(bgAssessIndex.getIndexId());
			}
		};
		
		mav.setViewName("redirect:selectBgAssessIndex.do");
		return mav;
	}
	
	
	
	
	
	
	
	
}
