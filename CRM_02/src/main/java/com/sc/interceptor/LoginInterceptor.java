package com.sc.interceptor;

import java.net.InetAddress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class LoginInterceptor implements HandlerInterceptor {
	// @Autowired
	// SysdutyService sysdutyService;

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
		if (servletPathdo.equals(".do")) {// 获取到后缀是.do的路径（祝勇到此一游）
			System.out.println("url是：" + servletPath);
			System.out.println("Local HostAddress: " + addr.getHostAddress());// 获取到当前客户端的ip地址
			System.out.println("获取的IP是" + arg0.getRemoteHost());
		}
		return true;
	}
}
