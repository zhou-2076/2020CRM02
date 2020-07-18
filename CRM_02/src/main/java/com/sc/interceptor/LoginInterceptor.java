package com.sc.interceptor;

import java.net.InetAddress;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.XtJournal;
import com.sc.entity.XtUserNum;
import com.sc.service.XtJournalService;

@Component
public class LoginInterceptor implements HandlerInterceptor {
	 @Autowired
	 XtJournalService xtJournalService;

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		InetAddress addr = InetAddress.getLocalHost();// 获取到主机的ip地址
		String servletPath = arg0.getServletPath();// 获取到url地址
		String servletPathdo = servletPath.substring(servletPath.lastIndexOf("."));//取到路径点的后缀
		XtUserNum xtuu=(XtUserNum)(arg0.getSession().getAttribute("nowuser"));
		if (servletPathdo.equals(".do")) {// 获取到后缀是.do的路径（祝勇到此一游）
			System.out.println("url是：" + servletPath);
			System.out.println("Local HostAddress: " + addr.getHostAddress());// 获取到当前客户端的ip地址
			System.out.println("获取的IP是" + arg0.getRemoteHost());
			System.out.println(xtuu);
			XtJournal xj=new XtJournal(null,xtuu.getUserId(),arg0.getRemoteHost(),arg0.getServletPath(),new Date(),xtuu.getCompanyId());
			xtJournalService.addJournal(xj);
		}
		
		return true;
	}
}
