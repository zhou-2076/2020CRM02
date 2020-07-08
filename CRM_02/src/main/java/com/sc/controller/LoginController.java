package com.sc.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.XtUserNum;
import com.sc.realm.CustomFormAuthenticationFilter;

@Controller
@RequestMapping("/loginctlr")
public class LoginController {



	@RequestMapping("/login.do")
	public ModelAndView login(ModelAndView mav, HttpServletRequest req, HttpSession session, HttpServletResponse resp)
			throws IOException {
		System.out.println("用户登录失败！");
		String msg = "";
		// 获取登录失败属性值
		String fail = (String) req.getAttribute(CustomFormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		System.out.println("错误信息" + fail);
		if (fail != null) {
			if (fail.equals(UnknownAccountException.class.getName())) {
				msg = "unknown";// 账号不存在
			} else if (fail.equals(IncorrectCredentialsException.class.getName())) {
				msg = "error";// 用户名或密码错误
			} else if (fail.equals("randomCodeError")) {
				msg = "codeerror";// 验证码错误
			} else {
				msg = "other";// 其他未知错误
			}
			mav.setViewName("redirect:/login.jsp?msg=" + msg);
		}
		// 因为用户未注销登陆失败时
		Subject subject = SecurityUtils.getSubject();// 获取主体
		XtUserNum nowuser = (XtUserNum) subject.getPrincipal();
		System.out.println("已认证的用户" + nowuser);
		if (nowuser != null) {
			mav.setViewName("redirect:/login.jsp?loginnow=yes");
		}
		return mav;
	}

	@RequestMapping("/main.do")
	public ModelAndView main(ModelAndView mav, HttpSession session, HttpServletResponse resp, HttpServletRequest req) {
		System.out.println("用户登录成功！");
		Date date = new Date();
		session.setAttribute("time", date);
		Subject subject = SecurityUtils.getSubject();// 获取主体
		XtUserNum nowuser = (XtUserNum) subject.getPrincipal();// 获取当前用户对象
		String rememberme = (String) session.getAttribute("rememberme");
		String upass = (String) session.getAttribute("upass");
		if (nowuser != null && rememberme != null && !rememberme.equals("")) {
			Cookie NameCookie = new Cookie("name", nowuser.getUserName());// 将姓名存入Cookie
			NameCookie.setPath("/");// 在springBoot下面要加上这句因此cookie.setPath("/");之后，可以在webapp文件夹下的所有应用共享cookie
			NameCookie.setMaxAge(3 * 24 * 60 * 60);// 设置保存3天
			Cookie PasswordCookie = new Cookie("password", upass);// 将姓名存入Cookie
			PasswordCookie.setPath("/");// 在springBoot下面要加上这句因此cookie.setPath("/");之后，可以在webapp文件夹下的所有应用共享cookie
			PasswordCookie.setMaxAge(3 * 24 * 60 * 60);// 设置保存3天
			// 存入resp发送到页面
			resp.addCookie(NameCookie);
			resp.addCookie(PasswordCookie);
		}
		session.setAttribute("nowuser", nowuser);// 存入session
		session.setMaxInactiveInterval(24 * 60);// 设置session存活时间
		mav.setViewName("main");// 重定向到main.jsp
		return mav;
	}
}
