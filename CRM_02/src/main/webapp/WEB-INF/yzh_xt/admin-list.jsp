<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="CrmStatic/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="CrmStatic/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="CrmStatic/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="CrmStatic/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="CrmStatic/static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>管理员列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 管理员管理 <span class="c-gray en">&gt;</span> 管理员列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<form action="xtuserctrl/selectuser.do" method="post" id="myform">
	<div class="text-c"> 日期范围：
		<input type="text" value="<fmt:formatDate value="${usernum.datemin}"
							pattern="yyyy-MM-dd" />" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" name="datemin" class="input-text Wdate" style="width:120px;">
		-
	 	<input type="text" value="<fmt:formatDate value="${usernum.datemax}"
							pattern="yyyy-MM-dd" />" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax" name="datemax" class="input-text Wdate" style="width:120px;">
		<input type="text" value="${usernum.userName } "  class="input-text" style="width:250px" placeholder="输入管理员名称" id="userName" name="userName">
		<input type="hidden" name="pageNum" id="pageNum" value="${p.pageNum }">
		<button type="submit" class="btn btn-success" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
		<button onclick="cz()" type="reset" class="btn btn-success"><i class="Hui-iconfont" >&#xe66c;</i> 重置</button>    
	</div>
	</form>
	
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>
	<a href="javascript:;" onclick="admin_add('添加管理员','xtuserctrl/goadduser.do','800','450')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加管理员</a></span> <span class="r">共有数据：<strong></strong>${p.total } 条</span> </div>
	<form action="xtuserctrl/deleteALL.do" method="post" id="myform1">
	<table class="table table-border table-bordered table-bg">
		<thead>
			<tr>
				<th scope="col" colspan="9">员工列表</th>
			</tr>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="40">ID</th>
				<th width="150">用户名</th>
				<th width="150">员工编号</th>
				<th>公司编号</th>
				<th width="130">最后修改时间</th>
				<th width="100">账户状态</th>
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
		   <c:forEach items="${p.list }" var="XTUU">
			<tr class="text-c">
				<td><input type="checkbox" value="${XTUU.userId }" name="ids"></td>
				<td>${XTUU.userId }</td>
				<td>${XTUU.userName }</td>
				<td>${XTUU.staffId}</td>
				<td>${XTUU.companyId}</td>
				<td><fmt:formatDate value="${XTUU.lastModifyDate}"
							pattern="yyyy-MM-dd HH:mm:ss" /></td>
				<td class="td-status"><span class="label label-success radius">已启用</span></td>
				<td class="td-manage"><a style="text-decoration:none" onClick="admin_stop(this,'10001')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>
				<a title="编辑" href="javascript:;" onclick="admin_edit('管理员编辑','admin-add.html','1','800','500')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>
				<a title="删除" href="javascript:;" onclick="admin_del(this,'${XTUU.userId }')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</form>
</div>
<div>
					<span>当前${p.pageNum}/${p.pages}页</span>
					<div style="float: right;">
						<button href="javascript:void(0)" onclick="gopage(${p.navigateFirstPage })"
							style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">首页</button>
						
						<button href="javascript:void(0)" onclick="gopage(${p.prePage})"
							style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">上一页</button>
						<script type="text/javascript">
				  
				  </script>
						<button disabled="disabled"
							style=" width:26px;height:26px;background-color: rgb(90, 152, 222);border: 0px;border-radius: 5px;">${p.pageNum}</button>
						<button href="javascript:void(0)" onclick="gopage(${p.nextPage})"
							style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">下一页</button>
						<script type="text/javascript">
				    
				   </script>
						<button href="javascript:void(0)" onclick="gopage(${p.navigateLastPage })"
							style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">尾页</button>
						<script type="text/javascript">
				    
				  </script>
					</div>
				</div>
	</div>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="CrmStatic/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="CrmStatic/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="CrmStatic/static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="CrmStatic/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="<%=basePath%>CrmStatic/lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="CrmStatic/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="CrmStatic/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
/*
	参数解释：
	title	标题
	url		请求的url
	id		需要操作的数据id
	w		弹出层宽度（缺省调默认值）
	h		弹出层高度（缺省调默认值）
*/
/*管理员-增加*/
function admin_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*管理员-删除*/
function admin_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: 'xtuserctrl/deleteuser.do',
			data:"userId="+id,
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已删除!',{icon:1,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}

/*管理员-编辑*/
function admin_edit(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*管理员-停用*/
function admin_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
		
		$(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_start(this,id)" href="javascript:;" title="启用" style="text-decoration:none"><i class="Hui-iconfont">&#xe615;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">已禁用</span>');
		$(obj).remove();
		layer.msg('已停用!',{icon: 5,time:1000});
	});
}

/*管理员-启用*/
function admin_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
		
		
		$(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_stop(this,id)" href="javascript:;" title="停用" style="text-decoration:none"><i class="Hui-iconfont">&#xe631;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		$(obj).remove();
		layer.msg('已启用!', {icon: 6,time:1000});
	});
}

function gopage(pageNum){
  $("#pageNum").val(pageNum);
  $("#myform").submit();
}

//批量删除
function datadel(){
  layer.confirm('确认要删除吗？',function(index){
  $("#myform1").submit();
  });
}
</script>
</body>
</html>