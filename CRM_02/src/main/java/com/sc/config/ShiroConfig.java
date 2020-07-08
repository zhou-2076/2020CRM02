package com.sc.config;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.filter.authz.PermissionsAuthorizationFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sc.realm.CustomFormAuthenticationFilter;
import com.sc.realm.CustomRealmMD5;


@Configuration
public class ShiroConfig {

	
	// 配置凭证匹配器realm
	@Bean
	public CustomRealmMD5 customRealmMD5() {
		CustomRealmMD5 realm = new CustomRealmMD5();// MD5配置
		HashedCredentialsMatcher matcher = new HashedCredentialsMatcher();// 开启散列匹配证书
		matcher.setHashIterations(3);// 散列的次数，比如散列两次，相当于md5(md5(""));
		matcher.setHashAlgorithmName("md5");// 散列算法:这里使用MD5算法
		realm.setCredentialsMatcher(matcher);// 将散列匹配证书注入md5配置
		return realm;
	}
	
	// 配置安全管理器
	@Bean
	public SecurityManager securityManager() {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();// 开启安全管理器
		securityManager.setRealm(customRealmMD5());// 将配置好的配置凭证匹配器注入安全管理器
		//securityManager.setRememberMeManager(rememberMeManager());//将配置好的rememberMeManager注入安全管理器
		return securityManager;
	}


	@Bean("shiroFilter") // 不加默认为方法的名字
	public ShiroFilterFactoryBean shiroFilter() {
		// 这是我自定义的表单认证过滤器
		// 自定义的CustomFormAuthenticationFilter继承了FormAuthenticationFilter即拥有FormAuthenticationFilter的方法也使用里面自己定义的方法
		CustomFormAuthenticationFilter formAuthenticationFilter = new CustomFormAuthenticationFilter();
		formAuthenticationFilter.setLoginUrl("/loginctlr/login.do");// 登陆时经过CustomFormAuthenticationFilter验证
		formAuthenticationFilter.setUsernameParam("uname");// FormAuthenticationFilter调用realm传入一个token（username和password）
		formAuthenticationFilter.setPasswordParam("upass");
		//formAuthenticationFilter.setRememberMeParam("rememberme");//记住密码
		// ShiroFilterFactoryBean对象里面有（SecurityManager，LoginUrl，SuccessUrl，UnauthorizedUrl）
		// shiro过滤器工厂
		ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
		// 注入安全管理器
		shiroFilter.setSecurityManager(securityManager());
		// 身份认证失败，则跳转到登录页面的配置 ，没有登录的用户请求需要登录的页面时自动跳转到登录页面，
		// 不是必须的属性，不输入地址的话会自动寻找项目web项目的根目录下的”/login.jsp”页面。
		shiroFilter.setLoginUrl("/login.jsp");
		// 登录成功默认跳转页面，不配置则跳转至”/”。
		// 如果登陆前点击的一个需要登录的页面，则在登录自动跳转到那个需要登录的页面。不跳转到此。
		shiroFilter.setSuccessUrl("/loginctlr/main.do");
		// 没有权限默认跳转的页面
		shiroFilter.setUnauthorizedUrl("/refuse.jsp");
		// 定义Map集合
		Map<String, Filter> map = new HashMap<String, Filter>();
		map.put("authc", formAuthenticationFilter);// 定义认证的方法名，使用formAuthenticationFilter做认证
		LogoutFilter logoutFilter = new LogoutFilter();
		logoutFilter.setRedirectUrl("/login.jsp");// 重定向到/login.jsp
		map.put("logout", logoutFilter);// 名为logout的处理方式为logoutFilter
		PermissionsAuthorizationFilter permsFilter = new PermissionsAuthorizationFilter();
		map.put("perms", permsFilter);// 名为perms的处理方式为permsFilter（如果当前用户具有映射值指定的权限，则允许访问的过滤器;如果用户未指定所有权限，则拒绝访问。）
		shiroFilter.setFilters(map);
		// 拦截器
		//LinkedHashMap：有序
		//LinkedHashMap有序，shiro会根据添加顺序进行拦截
		LinkedHashMap<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
		// 静态资源可匿名访问
		// 配置不会被拦截的链接 顺序判断
		// anon 指定排除认证的uri
		//authc  指定路径需认证之后才能访问
		// 表示所有路径都需要进行认证的检测才能访问
		// /**=authc
		// 指定的页面需要进行登录检测,此时表示需要先进行身份认证，而后记性角色认证
		// welcome.jsp=authc,perms[member:add]
		//anon一定要在authc前面
		filterChainDefinitionMap.put("/images/**", "anon");// 图片
		filterChainDefinitionMap.put("/static/**", "anon");//静态资源目录(验证码也在里面)
		filterChainDefinitionMap.put("/upload/**", "anon");// 文件上传路径
		filterChainDefinitionMap.put("/CrmStatic/**", "anon");//CRM项目模板静态资源
		filterChainDefinitionMap.put("/login.jsp", "anon");// 登陆页面
		filterChainDefinitionMap.put("/main.jsp", "anon");// 主页面
		filterChainDefinitionMap.put("/js/**", "anon");// js文件
		filterChainDefinitionMap.put("/logout.do", "logout");// 退出登录（可直接调用）
		// "/**", "authc"表示所有路径都需要进行认证的检测用户是否登录
		filterChainDefinitionMap.put("/**", "authc");
		shiroFilter.setFilterChainDefinitionMap(filterChainDefinitionMap);// 将所有链接处理注入
		return shiroFilter;
	}
}
