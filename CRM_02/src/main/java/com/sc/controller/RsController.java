package com.sc.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import com.github.pagehelper.PageInfo;
import com.sc.entity.KcWarehouseInfo;
import com.sc.entity.Massage;
import com.sc.entity.XtUserInfo;
import com.sc.entity.XtUserNum;
import com.sc.service.KcWareHouseInfoService;
import com.sc.service.XtUserInfoService;

import oracle.jdbc.driver.Message;
@Controller
@RequestMapping("/Rsctrl")
public class RsController {
	@Autowired
	XtUserInfoService xtUserInfoService;

	@Autowired
	KcWareHouseInfoService kcWareHouseInfoService;
		// 查询员工信息表分页方法
		@RequestMapping("/selectuserinfo.do")
		public ModelAndView selectuserinfo(ModelAndView mav, 
				@RequestParam(defaultValue = "1") Integer pageNum,
				@RequestParam(defaultValue = "10") Integer pageSize, XtUserInfo userInfo) {
			System.out.println("进入查询员工信息表分页方法了");

			PageInfo<XtUserInfo> page = xtUserInfoService.selectXtUserInof(pageNum, pageSize, userInfo);
			System.out.println(page.getList());
			mav.addObject("p", page);
			mav.setViewName("wwj_rs/XtUserInfo_list");
			return mav;
		}
		
		
		// 查询仓库的分页方法
		@RequestMapping("/selecthouse.do")
		public ModelAndView selecthouse(ModelAndView mav,
				@RequestParam(defaultValue="1") Integer pageNum, 
				@RequestParam(defaultValue="10") Integer pageSize,
				KcWarehouseInfo houseInfo){
			System.out.println("进入查询仓库分页方法了");
			
			PageInfo<KcWarehouseInfo> page = kcWareHouseInfoService.selecthouse(pageNum, pageSize, houseInfo);
			
			mav.addObject("p", page);
			mav.setViewName("wwj_rs/KcHouse-list");// /WEB-INF/wwj_rs/Kchouse-list.jsp
			
			return mav;
		}
		
		
		// 跳转到仓库的方法
		@RequestMapping("/goaddhouse.do")
		public ModelAndView goadduser(ModelAndView mav,KcWarehouseInfo houseInfo){
			System.out.println("进入添加页面:"+houseInfo);
			
			//修改操作
			if(houseInfo.getWarehouseId()!=null){
				houseInfo=kcWareHouseInfoService.gethouse(houseInfo.getWarehouseId());
			}
			
	        mav.setViewName("wwj_rs/KcHouse-add");// /WEB-INF/kc/KcHouse-add.jsp
	        mav.addObject("houseInfo", houseInfo);

	        return mav;
		}
		
		
		
		@RequestMapping("/addhouse.do")
		@ResponseBody
		public ModelAndView addhouse(ModelAndView mav 
			         ,KcWarehouseInfo houseInfo ) 
					throws IllegalStateException, IOException{

		/*if(upload!=null){
			String name=upload.getOriginalFilename();//文件名称
			if(name!=null&&!name.equals("")){ //文件上传   			
				String path=req.getServletContext().getRealPath("upload");//路径
				File f=new File(path+"/"+name);//路径+文件名的文件对象
				upload.transferTo(f);//另存为
			
				g.setGimg(name);
			}
		}*/	
		this.kcWareHouseInfoService.addhouse(houseInfo);
		//重定向到当前控制器的查询方法，所以写的是查询方法的url地址
				mav.setViewName("redirect:selecthouse.do");
		return mav;
		}
		
		
		/*// 增加仓库的方法
		@RequestMapping("/addhouse.do")
		@ResponseBody
		public Massage addhouse(ModelAndView mav,KcWarehouseInfo houseInfo){
			System.out.println("进入添加仓库"+houseInfo);
			if(houseInfo.getWarehouseId()!=null){//修改操作
				kcWareHouseInfoService.updatehouse(houseInfo);
				}else{//添加操作
					kcWareHouseInfoService.addhouse(houseInfo);
				}
			return new Massage("1","success","成功");
		}*/
		
		
		
		//删除仓库的方法
		@RequestMapping("/deletehouse.do")
		@ResponseBody
		public Massage deletehouse(ModelAndView mav,KcWarehouseInfo houseInfo){
			System.out.println("进入删除仓库"+houseInfo);
			kcWareHouseInfoService.deletehouse(houseInfo.getWarehouseId());
			return new Massage("1","success","成功");
		}
}
