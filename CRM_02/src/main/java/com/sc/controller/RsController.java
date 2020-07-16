package com.sc.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;

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
import com.sc.entity.CgRepGoods;
import com.sc.entity.KcWarehouseInfo;
import com.sc.entity.Massage;
import com.sc.entity.XtSection;
import com.sc.entity.XtUserInfo;
import com.sc.service.CgService;
import com.sc.service.KcWareHouseInfoService;
import com.sc.service.XtSectionService;
import com.sc.service.XtUserInfoService;
@Controller
@RequestMapping("/Rsctrl")
public class RsController {
	@Autowired
	XtUserInfoService xtUserInfoService;

	@Autowired
	KcWareHouseInfoService kcWareHouseInfoService;
	
	@Autowired
	CgService cgService;
	
	//.添加部门信息  XT_SECTION 系统部门表
	@Autowired
	XtSectionService xtSectionService;
	
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
				@RequestParam(defaultValue = "10") Integer pageSize,
				XtUserInfo userInfo) {
			System.out.println("进入查询员工信息表分页方法了");
			userInfo.setLastModifyDate(new Date());
			PageInfo<XtUserInfo> page = xtUserInfoService.selectXtUserInof(pageNum, pageSize, userInfo);
			System.out.println(page.getList());
			mav.addObject("p", page);
			mav.setViewName("wwj_rs/XtUserInfo_list1");
			return mav;
		}
		
		//查询单个员工的信息明细
		@RequestMapping("/selectuserid.do")
		@ResponseBody
		public XtUserInfo selectuserid(Long id ){
			System.out.println("进入员工详情页面");
			XtUserInfo UserInfo= xtUserInfoService.getXtUserInof(id);
			return UserInfo;
		}
		
	
		
		//修改员工的信息明细
		@RequestMapping("/updateuserid.do")
		@ResponseBody
		public ModelAndView updateuserid(ModelAndView mav,MultipartFile upload,HttpSession session,
				HttpServletRequest req, XtUserInfo userInfo ) throws IllegalStateException, IOException{
			System.out.println("进入员工修改页面");
			userInfo.setLastModifyDate(new Date());
			if(upload!=null){
				String name= upload.getOriginalFilename();//文件名称
				if(name!=null&&!name.equals("")){
					// 文件上传
					String path = session.getServletContext().getRealPath("upload");
					String ext = name.substring(name.lastIndexOf("."));// .jpg
					name = System.currentTimeMillis() + ext;// 2343643654.jpg
					File f=new File(path + "/" + name);// 路径+文件名的文件对象
					upload.transferTo(f);// 另存为
				}
				userInfo.setWorkerPhoto(name);
			}
			this.xtUserInfoService.updateXtUserInof(userInfo);
			// 重定向到当前控制器的查询方法，所以写的是查询方法的url地址ַ
			mav.setViewName("redirect:selectuserinfo.do");
		
			return mav;
		}
		
		// 添加员工信息
		@RequestMapping("/add.do")
		public ModelAndView add(ModelAndView mav, XtUserInfo userInfo, MultipartFile upload, HttpSession session)
				throws IllegalStateException, IOException {
			userInfo.setLastModifyDate(new Date());
            System.out.println("wwwwwwwwwwwwwwwwwwwwwwwwww");
			if (upload != null) {
				
				String name = upload.getOriginalFilename();// 1.jpg
				System.out.println("@@@@@@@@"+name);
				if (name != null && !name.equals("")) {// 用户选择文件了
					String path = session.getServletContext().getRealPath("upload");
					String ext = name.substring(name.lastIndexOf("."));// .jpg
					name = System.currentTimeMillis() + ext;// 2343643654.jpg
					upload.transferTo(new File(path + "/" + name));// 复制文件到服务器
					userInfo.setWorkerPhoto(name);
				}
			}
			xtUserInfoService.addXtUserInof(userInfo);// 添加用户
			mav.setViewName("redirect:selectuserinfo.do");// 重定向到该类的list方法
			return mav;
		}
		
		
	
		
		// 供应批量删除+删除
		@RequestMapping("/deletsup.do")
		public ModelAndView deletsup(ModelAndView mav, Long[] id) {
			if (id != null && id.length > 0) {
				for (Long long1 : id) {
					xtUserInfoService.deleteXtUserInof(long1);
				}
			}
			mav.setViewName("redirect:selectuserinfo.do");
			return mav;
		}
		
		// 模糊查询员工
		@RequestMapping("/selectSup.do")
		public ModelAndView selectSup(ModelAndView mav, @RequestParam(defaultValue = "1") Integer pageNum,
				@RequestParam(defaultValue = "10") Integer pageSize, String name) {
			PageInfo<XtUserInfo> suplist = xtUserInfoService.selectSup(pageNum, pageSize, name);
			for (XtUserInfo cs : suplist.getList()) {
				System.out.println("@@@@@@@"+cs);
			}
			String temp = "yes";
			List<XtUserInfo> list = suplist.getList();
			if (list.size() == 0) {
				temp = "no";
			}
			if (name != null) {
				mav.addObject("ssz", name);
			}
			mav.addObject("temp", temp);
			mav.addObject("p", suplist);			
			mav.setViewName("wwj_rs/XtUserInfo_list1");
			return mav;
		}
		
	
		
		// 查询仓库的分页方法
		@RequestMapping("/selectdepot.do")
		public ModelAndView selectDepot(ModelAndView mav,
				@RequestParam(defaultValue="1") Integer pageNum, 
				@RequestParam(defaultValue="10") Integer pageSize,
				KcWarehouseInfo houseInfo){
			System.out.println("进入查询仓库分页方法了:"+houseInfo);
            PageInfo<KcWarehouseInfo> page = kcWareHouseInfoService.selecthouse(pageNum, pageSize, houseInfo);
			
			mav.addObject("p", page);
			mav.addObject("depot", houseInfo);
			mav.setViewName("wwj_rs/KcHouse-list");// /WEB-INF/kc/cpdepot-list.jsp
			
			return mav;
		}
		
		@RequestMapping("/goadddepot.do")
		public ModelAndView goAddDepot(ModelAndView mav,KcWarehouseInfo useInfo){
			System.out.println("进入添加页面:"+useInfo);
			
			//修改操作
			if(useInfo.getWarehouseId()!=null){
				useInfo=kcWareHouseInfoService.gethouse(useInfo.getWarehouseId());
			}
			
	        mav.setViewName("kc/cpdepot-add");// /WEB-INF/kc/cpdepot-add.jsp
	        mav.addObject("depot", useInfo);
	        return mav;
		}
		
		@RequestMapping("/adddepot.do")
		@ResponseBody
		public Massage addDepot(ModelAndView mav,KcWarehouseInfo depot){
			System.out.println("进入添加仓库:"+depot);
			if(depot.getWarehouseId()!=null){//修改操作
				kcWareHouseInfoService.updatehouse(depot);
			}else{//添加操作
				kcWareHouseInfoService.addhouse(depot);
			}
			return  new Massage("1", "success", "成功");
		}
		
		@RequestMapping("/deletedepot.do")
		@ResponseBody
		public Massage deleteDepot(ModelAndView mav,KcWarehouseInfo depot){
			System.out.println("进入删除仓库:"+depot);
			kcWareHouseInfoService.deletehouse(depot.getWarehouseId());
			return new Massage("1", "success", "成功");
		}
		
		@RequestMapping("/deletedepotall.do")
		public String deleteDepotAll(ModelAndView mav,Long[]  ids){
			System.out.println("进入批量删除仓库:"+Arrays.toString(ids));
			if(ids!=null&&ids.length>0){
				for (Long id : ids) {
					kcWareHouseInfoService.deletehouse(id);
				}
			}
			
			return "redirect:selectdepot.do";
		}
		
		
		
		  //.查看部门信息  XT_SECTION 系统部门表
				@RequestMapping("/selectXtSection.do")
				public ModelAndView selectXtSection(ModelAndView mav, 
						@RequestParam(defaultValue = "1") Integer pageNum,
						@RequestParam(defaultValue = "10") Integer pageSize,
						XtSection Section) {
					System.out.println("进入部门表信息表分页方法了");
					
					PageInfo<XtSection> page = xtSectionService.selectXtSection(pageNum, pageSize, Section);
					System.out.println(page.getList());
					mav.addObject("p", page);
					mav.setViewName("wwj_rs/XtSection_list");
					return mav;
				}
				
				 //添加部门信息  XT_SECTION 系统部门表
				@RequestMapping("/addSection.do")
				public ModelAndView addSection(ModelAndView mav,XtSection s){
					 s.setLastModifyDate(new Date());
					 xtSectionService.addXtSectton(s);	
					 mav.setViewName("redirect:selectXtSection.do");
					return mav;	
				}
				
				
}

