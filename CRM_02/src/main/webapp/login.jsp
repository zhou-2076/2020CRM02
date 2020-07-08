<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link href="CrmStatic/static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="CrmStatic/static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
<link href="CrmStatic/static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
<link href="CrmStatic/lib/Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="CrmStatic/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="CrmStatic/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="CrmStatic/lib/layer/2.4/layer.js"></script>
<title>后台登录 - H-ui.admin v3.1</title>
<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
 <%
    Cookie[] cookies = request.getCookies();//取出Cookie
    String name="";//定义name接收用户名
    String password="";//定义password接收密码
    if(cookies.length>0&&cookies!=null){
    for(int i=0;i<cookies.length;i++)
    {
       if(cookies[i]!=null){
           if(cookies[i].getName().equals("name")){//取出其中一个cookie如果他的name等于存进去的name
              name=cookies[i].getValue();//就把这个cookie的值给name
           }
           if(cookies[i].getName().equals("password")){//取出其中一个cookie如果他的name等于存进去的password
              password=cookies[i].getValue();//就把这个cookie的值给password
           }
           
           }
    }
}
 %> 
 
 
	<c:if test="${param.loginnow=='yes'}">
			<script type="text/javascript">
		 		   location.href="<%=basePath%>logout.do";
				   alert("系统已存在认证的用户,已自动清除已认证的用户信息，请再次登录");			
			</script>
 
		</c:if>
		<c:if test="${param.msg=='unknown'}">

			<script type="text/javascript">
			   layer.msg("账号不存在",{icon:5});
				
			</script>

		</c:if>
		<c:if test="${param.msg=='error'}">

			<script type="text/javascript">
				 layer.msg("用户名或密码错误",{icon:5})
			</script>
		</c:if>
		<c:if test="${param.msg=='codeerror'}">

			<script type="text/javascript">
				 layer.msg("验证码错误",{icon:5})
			</script>
		</c:if>
		<c:if test="${param.msg=='other'}">

			<script type="text/javascript">
				 layer.msg("其他错误",{icon:5})
			</script>
		</c:if>
<div class="loginWraper">
  <div id="loginform" class="loginBox">
    <form class="form form-horizontal" action="<%=basePath%>loginctlr/login.do" method="post">
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
        <div class="formControls col-xs-8">
          <input  name="uname" value="<%=name %>" type="text" placeholder="账户" class="input-text size-L">
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
        <div class="formControls col-xs-8">
          <input id="" name="upass" value="<%=password %>" type="password" placeholder="密码" class="input-text size-L">
        </div>
      </div>
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <input class="input-text size-L" type="text" placeholder="验证码" id="randomcode" name="randomcode" style="width:150px;">
           <img id="randomcode_img" src="static/validatecode.jsp" style="heigh:40px; width: 80px;"><a href="javascript:refresh()">看不清，换一张</a> </div>
      </div>
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <label for="online">
            <input type="checkbox" name="rememberme" value="SavePassword">
                     记住密码</label>
        </div>
      </div>
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <input name="" type="submit" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
          <input name="" type="reset" class="btn btn-default radius size-L" value="&nbsp;重&nbsp;&nbsp;&nbsp;&nbsp;置&nbsp;">
        </div>
      </div>
    </form>
  </div>
</div>
<div class="footer"><h1>思创-2020-CRM体验项目</h1></div>
</body>
<script type="text/javascript">
    //验证码刷新第一种
	function refresh() {
		document.getElementById("randomcode_img").src = "static/validatecode.jsp?" + Math.random();
	}
</script>
</html>