package com.sc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
@Component
public class LoginInterceptor implements HandlerInterceptor {
//	@Autowired 
//	SysdutyService sysdutyService;
	 

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("3、请求完成执行");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("2、请求之后执行");
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
//		System.out.println("1、请求之前执行");
//		
//		String servletPath = arg0.getServletPath();//获取到url地址
//		System.out.println("url是："+servletPath);
//		arg0.setAttribute("servletPath", arg0.getServletPath());//将获取到的url地址存入servletPath
//		 InetAddress addr = InetAddress.getLocalHost();//获取到主机的ip地址
//		 String valueOf = String.valueOf(addr);//将int类型的ip地址转化为string类型
//	      System.out.println("Local HostAddress: "+addr.getHostAddress());//获取到当前客户端的ip地址
//		arg0.setAttribute("ip", arg0.getRemoteHost());//获取IP
//		System.out.println( "获取的IP是" +arg0.getRemoteHost());
//		
//		HttpSession session = arg0.getSession();
//		SysUser u= (SysUser)session.getAttribute("nowuser");
//		if(u==null){//说明用户已登陆
//		}
//		SysSystem sysSystem = new SysSystem(null, u.getsId(), valueOf,null, new Date(), null, new Date());
//		System.out.println(sysSystem.toString());
//		sysdutyService.loginster(sysSystem);
//		System.out.println("kkkkk");
		return true;
	}

}
