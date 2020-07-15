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
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
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
	
<link href="static/zy_css/style.css" rel='stylesheet' type='text/css' />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>客户管理</title>
<style type="text/css">
.none { /* 弹层默认隐藏 */
	display: none;
}
</style>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 客户管理 <span class="c-gray en">&gt;</span> 客户信息管理 <a class="btn btn-refresh radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<form action="xscustomctrl/selectcustom.do" method="post" id="myform"> <!--  把表单控件包起来-->
		<div class="text-c"> 日期范围： <!--从什么日期到什么日期，所以搞一个扩展属性只有年月日  --> <!-- 它这里的格式会防止出错，比如最小日期只能在最大日期前面选择 -->
			<input type="text" value="<fmt:formatDate value="${cus.datemin}" pattern="yyyy-MM-dd"/>" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'datemax\')||\'%y-%M-%d\'}' })" id="datemin" name="datemin" class="input-text Wdate" style="width:120px;">
			-
			<input type="text" value="<fmt:formatDate value="${cus.datemax }" pattern="yyyy-MM-dd"/>" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'datemin\')}',maxDate:'%y-%M-%d' })" id="datemax" name="datemax" class="input-text Wdate" style="width:120px;">
			<input type="text" value="${cus.customName} " class="input-text" style="width:250px" placeholder="输入客户名称进行模糊查询" id="customName" name="customName">
			<input type="hidden" name="pageNum" id="pageNum" value="${p.pageNum }"> <!-- 这个隐藏域是用来穿页数重新提交表单的 -->
			<button type="reset" onclick="chongzhi()" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe6f7;</i> 重置</button>
				<script type="text/javascript">
					function chongzhi(){
						document.getElementById("datemin").value="";
						document.getElementById("datemax").value="";
						document.getElementById("customName").value="";
					}
				</script>
			<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜客户</button>
		</div>
	</form>
	
	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
		<span class="l">
		<a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> 
		<a href="javascript:;" onclick="member_add('添加客户','xscustomctrl/goaddcustom.do','','520')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加客户</a>
		</span> 
		<span class="r">共有数据：<strong>${p.total}</strong> 条</span> 
	</div>
	

<div class="mt-20">
	<form action="xscustomctrl/deletecustomall.do" method="post" id="myform1"> <!-- 这里点击确定不出来是因为你写的name="myform1" -->
	<table class="table table-border table-bordered table-hover table-bg table-sort">
		<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" id=""></th>
				<th width="30">客户ID</th>
				<th width="50">客户名称</th>
				<th width="50">网站</th>
				<th width="80">最后修改时间</th>
				<th width="60">操作</th>
			</tr>
			
		</thead>
		<tbody>
		   <c:forEach items="${p.list }" var="p">
				<tr class="text-c">
					<td><input type="checkbox" value="${p.customId }"  name="ids"> </td> <!-- 这里所有的复选框都叫ids -->
					<td>${p.customId}</td>								<!-- 复选框name=ids，方法参数也要是ids -->
					<td>${p.customName }</td>
					<td >${p.website  }</td>
					<td>
					  <fmt:formatDate value="${p.lastModifyDate  }" pattern="yyyy-MM-dd HH:mm:ss"/>
					</td>
					
					<td class="td-manage">
					<a style="text-decoration:none" onClick="cksjxq(${p.customId })" href="javascript:;" title="查看客户基本信息"><i class="Hui-iconfont">&#xe616;</i>
					<a style="text-decoration:none"  href="xscustomctrl/selectconnect.do?id=${p.customId }" title="查看客户联系人">
									<i class="Hui-iconfont">&#xe636;</i>
							</a> 				
					<!-- 根据id来区分是编辑还是删除 -->
                    <a title="修改客户基本信息" href="javascript:;" onclick="member_edit('编辑客户信息','xscustomctrl/goaddcustom.do','${p.customId }','520')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>  
					<a title="删除" href="javascript:;" onclick="member_del(this,'${p.customId}')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</form><!--  这个表单用来批量删除-->	
	
	<div id="window-div" class="none" style="width: 750px;">
				<div class="hover-buttons">
					<div class="wrap">
						<div class="bg-effect">
							<ul class="bt-list">
								<li><a id="a" class="hvr-back-pulse button">^_^!</a> <a
									id="b" class="hvr-sweep-to-right button">^_^!</a> <a id="c"
									class="hvr-sweep-to-left button">^_^!</a></li>
								<li><a id="d" class="hvr-sweep-to-bottom button">^_^!</a> <a
									id="e" class="hvr-sweep-to-top button">^_^!</a> <a id="f"
									class="hvr-bounce-to-right button">^_^!</a></li>
								<li><a id="g" class="hvr-bounce-to-bottom button">^_^!</a>
									<a id="h" class="hvr-bounce-to-top button">^_^!</a></li>
								<li><a id="i" class="hvr-rectangle-in button">^_^!</a> <a
									id="j" class="hvr-rectangle-out button">^_^!</a></li>
								<br>
								<li><a id="k" class="hvr-radial-out button">^_^!</a></li>
								<li><a id="ll" class="hvr-rectangle-in button">^_^!</a> <a
									id="mm" class="hvr-rectangle-out button">^_^!</a></li>
								<li><a id="nn" class="hvr-rectangle-in button">^_^!</a></li>
								<li><a id="o" class="hvr-rectangle-in button">^_^!</a></li>
								<li><a id="p" class="hvr-rectangle-in button">^_^!</a></li>
								<li><a id="q" class="hvr-rectangle-in button">^_^!</a></li>
								<li><a id="r" class="hvr-rectangle-in button">^_^!</a></li>
								<li><a id="s" class="hvr-rectangle-in button">^_^!</a></li>
								<li><a id="t" class="hvr-rectangle-in button">^_^!</a></li>
								<li><a id="u" class="hvr-rectangle-in button">^_^!</a></li>
								<li><a id="v" class="hvr-rectangle-in button">^_^!</a></li>
								<li><a id="w" class="hvr-rectangle-in button">^_^!</a></li>
								<li><a id="x" class="hvr-rectangle-in button">^_^!</a></li>
								<li><a id="y" class="hvr-rectangle-in button">^_^!</a></li>
								<li><a id="z" class="hvr-rectangle-in button">^_^!</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
	
	
	
</div>

	
	<div>
				<span>当前${p.pageNum}/${p.pages}页</span>
				<div style="float: right;">
					<button onclick="gopage(${p.navigateFirstPage })"
						style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">首页</button>
					
					<button onclick="gopage(${p.prePage })"
						style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">上一页</button>
					
					<button disabled="disabled"
						style=" width:26px;height:26px;background-color: rgb(90, 152, 222);border: 0px;border-radius: 5px;">${p.pageNum}</button>
					<button onclick="gopage(${p.nextPage })"
						style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">下一页</button>
					
					<button onclick="gopage(${p.navigateLastPage })"
						style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">尾页</button>
					
				</div>
				<script type="text/javascript">
					function gopage(pageNum){
					 /* alert("拿到的pageNum"+pageNum)  */
					   $("#pageNum").val(pageNum);
					   $("#myform").submit();
					}
				</script> 
	</div>
</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript"
	src="CrmStatic/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="CrmStatic/lib/layer/2.4/layer.js"></script>
<script type="text/javascript"
	src="CrmStatic/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript"
	src="CrmStatic/static/h-ui.admin/js/H-ui.admin.js"></script>
<!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript"
	src="<%=basePath%>CrmStatic/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript"
	src="CrmStatic/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="CrmStatic/lib/laypage/1.2/laypage.js"></script>
	
<script type="text/javascript">
/*
	参数解释：
	title	标题
	url		请求的url
	id		需要操作的数据id
	w		弹出层宽度（缺省调默认值）
	h		弹出层高度（缺省调默认值）
*/
$(function(){
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,4]}// 制定列不参与排序
		]
	});
	
});



/*查看客户基本信息*/
			 function cksjxq(id) {
			/*  alert("拿到的id"+id) */
				$.ajax({
					type : "post",
					url : "<%=basePath%>xscustomctrl/getCustombyid.do?id=" + id,   /*  这里的引号错了*/
					dataType : "json",
					success : function(data) //从前台回调回来的数组，处理后的数据
					{
				/* 	alert(data.customName); */
						$("#a").html("客户名称：" + data.customName);
						$("#b").html("客户属性：" + data.customProperty);
						$("#c").html("网站：" + data.website);
						$("#d").html("股票代码：" + data.sharaCode);
						$("#e").html("上级单位：" + data.superDepart);
						$("#f").html("所有者：" + data.owner);
						$("#g").html("员工数：" + data.empNum);
						$("#h").html("行业编号：" + data.industryId);
						$("#i").html("客户类型：" + data.customType);
						$("#j").html("客户状态：" + data.customStatus);
						$("#k").html("客户来源：" + data.customSource);
						$("#nn").html("负责人编号：" + data.principalId);
						$("#mm").html("固定电话：" + data.telephone);
						$("#o").html("移动电话：" + data.mobilephone);
						$("#p").html("客户传真：" + data.customFax);
						$("#q").html("开户银行：" + data.bank);
						$("#r").html("银行账户：" + data.bankAccount);
						$("#s").html("电子邮箱：" + data.email);
						$("#t").html("SIC编码：" + data.sic);
						$("#u").html("支付方式：" + data.payMethod);
						$("#v").html("是否有效：" + data.enabled);
						$("#w").html("详细地址：" + data.address);
						$("#x").html("备注信息：" + data.customRemark);
						$("#y").html("公司编号：" + data.companyId);
						
						var date = new Date(data.lastModifyDate);
						var Y = date.getFullYear() + '-';
						var M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';
						var D = date.getDate() + ' ';
						var H = date.getHours() + ':';
						var F = date.getMinutes() + ':';
						var S = date.getSeconds();
						$("#ll").html("最后修改时间：" + Y + M + D + H + F + S);
						
						var date1 = new Date(data.nextTime);
						var Y1 = date.getFullYear() + '-';
						var M2 = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';
						var D3 = date.getDate() + ' ';
						var H4 = date.getHours() + ':';
						var F5 = date.getMinutes() + ':';
						var S6 = date.getSeconds();
						$("#z").html("下次联系时间：" + Y1 + M2 + D3 + H4 + F5 + S6);
					}
				});
				layer.open({
					type : 1,
					area : [ '700px', '500px' ],
					fix : false, //不固定
					maxmin : true,
					shade : 0.4,
					title : '客户基本信息详情',
					content : $('#window-div')
				});
			} 
/*客户信息-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}


/*客户信息-编辑*/
function member_edit(title,url,id,w,h){
	url=url+"?customId="+id;
	layer_show(title,url,w,h);
}
/*客户信息批量-删除*/
function datadel(){
   
   //$("input[name='ids']")
   
   if($("input[name='ids']:checked").length>=1){
   
	   layer.confirm('确认要删除这些数据吗？',function(index){
	      $("#myform1").submit();
	   });
   }else{
       layer.msg('请至少选择一条数据!',{icon:5,time:1000});
   }
}
/*客户信息-删除*/
function member_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: 'xscustomctrl/deletecustom.do',
			data: "customId="+id,
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
</script> 
</body>
</html>