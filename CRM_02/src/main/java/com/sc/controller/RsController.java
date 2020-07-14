package com.sc.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import com.sc.entity.CgSupMsg;
import com.sc.entity.KcWarehouseInfo;
import com.sc.entity.Massage;
import com.sc.entity.XtCompanyInfo;
import com.sc.entity.XtUserInfo;
import com.sc.entity.XtUserNum;
import com.sc.service.CgService;
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
	
	@Autowired
	CgService cgService;
	
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
		public ModelAndView updateuserid(ModelAndView mav,MultipartFile upload,
				HttpServletRequest req, XtUserInfo userInfo ) throws IllegalStateException, IOException{
			System.out.println("进入员工修改页面");
			if(upload!=null){
				String name= upload.getOriginalFilename();//文件名称
				if(name!=null&&!name.equals("")){
					// 文件上传
					String path = req.getServletContext().getRealPath("upload");
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
