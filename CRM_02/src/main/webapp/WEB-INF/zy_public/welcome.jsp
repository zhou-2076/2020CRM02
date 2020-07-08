<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css"
	href="CrmStatic/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css"
	href="CrmStatic/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css"
	href="CrmStatic/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css"
	href="CrmStatic/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css"
	href="CrmStatic/static/h-ui.admin/css/style.css" />
<script type="text/javascript"
	src="CrmStatic/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript"
	src="CrmStatic/static/h-ui/js/H-ui.min.js"></script>

<!-- 分级目录js和css -->
<link rel="stylesheet" type="text/css" href="static/tree/all.css">
<script type="text/javascript" src="static/tree/jquery-3.0.0.min.js"></script>
<script type="text/javascript" src="static/tree/jtree.js"></script>
<script type="text/javascript" src="static/tree/uitool.js"></script>
<script type="text/javascript" src="static/tree/index.js"></script>
<title>我的桌面</title>
</head>
<body>
	<div class="page-container">
		<p class="f-20 text-success">
			欢迎使用2020crm管理系统<span class="f-14">
		</p>
		<br>
		<p style="color:red;">
			本次登录时间：
			<fmt:formatDate value="${time}" pattern="yyyy-MM-dd HH:mm:ss" />
		</p>
		<br>
		<table style="border:0px;"
			class="table table-border table-bordered table-bg">
			<thead>
				<tr>
					<th colspan="7" scope="col">用户信息</th>
				</tr>
				<tr class="text-c">
					<th style="width: 35%;">账户名</th>
					<th style="width: 15%;">该用户所拥有的权限</th>
					<th style="width: 45%;">最后修改时间</th>
				</tr>
			</thead>
			<tbody>
				<tr class="text-c">
					<td>${empty sessionScope.nowuser.userName ? "游客":nowuser.userName }</td>
					<td>
						<!-- jtree模板 -->
						<div class="accordion">
							<div class="accordionContent">
								<ul class="tree treeFolder collapse">
									<li><a>查看该用户的角色</a>
										<ul>
											<c:forEach items="${juese}" var="j">
												<li><a>${j.roleName}(查看权限)</a>
													<ul>
														<c:forEach items="${j.xtPermission}" var="p">
															<li><a>${p.qxName}</a>
															<li>
														</c:forEach>

													</ul></li>
											</c:forEach>
										</ul></li>
								</ul>
							</div>
						</div> <!-- jtree模板 -->
					</td>
					<td><fmt:formatDate value="${nowuser.lastModifyDate}"
							pattern="yyyy-MM-dd HH:mm:ss" /></td>
				</tr>
			</tbody>
		</table>

		<table class="table table-border table-bordered table-bg mt-20">
			<thead>
				<tr>
					<th colspan="8" scope="col">用户详情</th>
				</tr>
			</thead>
			<tbody>
				<tr>

					<td>公司名称</td>
					<td>操作人名称</td>
					<td>部门名称</td>
					<td>职务名称</td>
				</tr>
				<tr>

					<td>${public.gsmc}</td>
					<td>${public.czrmc}</td>
					<td>${public.bmmc}</td>
				    <td>${public.zwmc}</td>
				</tr>
			</tbody>
		</table>
		<table class="table table-border table-bordered table-bg mt-20">
			<thead>
				<tr>
					<th colspan="8" scope="col">用户详情</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>公司id</td>
					<td>操作人id</td>
					<td>部门id</td>
					<td>职务id</td>

				</tr>
				<tr>
					<td>${public.gsid}</td>
					<td>${public.czrid}</td>
					<td>${public.bmid}</td>
					<td>${public.zwid}</td>

				</tr>
			</tbody>
		</table>
	</div>
	<footer class="footer mt-20">
		<div class="container">
			<p>
				感谢jQuery、layer、laypage、Validform、UEditor、My97DatePicker、iconfont、Datatables、WebUploaded、icheck、highcharts、bootstrap-Switch<br>
				Copyright &copy;<br> 提供前端技术支持
			</p>
		</div>
	</footer>
</body>
<script type="text/javascript">
	function ckjs(userid) {
		var url = "publicctrl/ckjs.do?userId=" + userid;
		//alert(url);
		//ajax异步请求
		$.ajax({
			type : "post",
			url : url,
			dataType : "json",
			success : function(data) //从前台回调回来的数组，处理后的数据
			{
				var h = "";
				$.each(data, function(i, d) //两个参数，第一个参数表示遍历的数组的下标，第二个参数表示下标对应的值
				{
					h += "<li><a>" + d.uroName + "</a><ul></ul></li>"
				});
				$("#juese").html(h); //将取出的值覆盖原来的值（html对标签进行操作）
			}
		});
	}
</script>
</html>