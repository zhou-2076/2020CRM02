package com.sc.realm;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

public class CustomFormAuthenticationFilter extends FormAuthenticationFilter {

	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		// 进行验证码的校验
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		// 取出验证码
		String validateCode = (String) session.getAttribute("validateCode");
		System.out.println("验证码" + validateCode);
		// 取出页面的验证码
		// 输入的验证和session中的验证进行对比
		String randomcode = req.getParameter("randomcode");
		// 获取记住密码
		String rememberme = request.getParameter("rememberme");
		// 将记住密码存入session
		session.setAttribute("rememberme", rememberme);
		// 获取到密码
		String upass = request.getParameter("upass");
		// 将记住密码存入session
		session.setAttribute("upass", upass);
		//验证码
		if (validateCode != null && randomcode != null && !randomcode.equals(validateCode)) {
			// 如果校验失败，将验证码错误失败信息，通过shiroLoginFailure设置到request中
			req.setAttribute("shiroLoginFailure", "randomCodeError");// 自定义登录异常。randomCodeError为登陆控制器自定义验证码																		// 位置：loginCtlr//login.do
			// 拒绝访问，不再校验账号和密码
			return true;
		}
		return super.onAccessDenied(request, response);
	}
}
