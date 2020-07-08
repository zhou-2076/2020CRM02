package com.sc.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.sc.entity.XtUserNum;
import com.sc.service.PublicService;

public class CustomRealmMD5 extends AuthorizingRealm {

	@Autowired
	PublicService publicService;


	// 用户授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {

		return null;
	}

	// 用户认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		String uname = (String) arg0.getPrincipal();// 获取需要认证的用户名
		System.out.println("进行用户认证的是：" + uname);
		// 调用service通过用户名查询用户对象
		XtUserNum user = publicService.selectSysUserByCode(uname);
		// 如果查不到该用户，那么直接返回null，账号不存在
		if (user == null) {
			return null;// 认证失败
		}
		String upass = user.getUserCode();// 从数据库取出密码
		String salt = "qwer";//数据库里面没有盐所以在这里自己写一个
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, upass, ByteSource.Util.bytes(salt),
				getName());
		return info;
	}

}
