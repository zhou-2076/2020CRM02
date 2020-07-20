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
<title>销售详情单</title>
<style type="text/css">
.none { /* 弹层默认隐藏 */
	display: none;
}
</style>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 客户管理 <span class="c-gray en">&gt;</span> 客户联系人管理 <a class="btn btn-refresh radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
	<form action="xssalectrl/selectxsDetail1.do"  method="post" id="myform"> 
		<div class="text-c"> 
			<input type="text" value="${xsdetail.goodId} " class="input-text" style="width:250px" placeholder="输入商品编号进行模糊查询" id="goodId" name="goodId"> <!--  id是整jsp页面唯一的东西，id可以换，单如果用document获取文本框的值，那id就要对应-->
	<!--  这一步之后再思考一下如何把值传进去-->	<!-- <input type="hidden" name="customId" id="customId" value="41"> -->
			<input type="hidden" name="pageNum" id="pageNum" value="${page.pageNum }"> <!-- 这个隐藏域是用来穿页数重新提交表单的 -->												<!-- name要穿到控制器里面，如果使用类接收，name要是跟类里的属性名不一样，就获取不到值 -->
			<button type="reset" onclick="chongzhi()" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe6f7;</i> 重置</button>
				<script type="text/javascript">
					function chongzhi(){
						document.getElementById("connectName").value="";
					}
				</script>
			<button type="submit" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i> 搜商品编号</button>
			<div style="float: right;">
				<button type="button" class="btn btn-success radius"  onclick="fh()"> &nbsp返回</button>
			</div>	
			<script type="text/javascript">
					function fh() {
						location.href = "xssalectrl/selectxsOut.do";
					}
				</script>		
		</div>
	</form>			

	<div class="cl pd-5 bg-1 bk-gray mt-20"> 
		<span class="l">
		<a href="javascript:;" onclick="datadel()" class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a> 
		<a href="javascript:;" onclick="member_add('添加销售详情','xssalectrl/goaddxsDetail.do',${id1},'520')" class="btn btn-primary radius"><i class="Hui-iconfont">&#xe600;</i> 添加销售详情</a>
		</span> 
		<span class="r">共有数据：<strong>${page.total}</strong> 条</span> 
	</div>
	

<div class="mt-20">
	<form action="xssalectrl/deletexsDetailall.do" method="post" id="myform1"> <!-- 这里点击确定不出来是因为你写的name="myform1" -->
	<table class="table table-border table-bordered table-hover table-bg table-sort">
		<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" id=""></th>
				<th width="70">销售单详情ID</th>
				<th width="70">销售单ID</th>
				<th width="50">商品编号</th>
				<th width="50">商品数量</th>
				<th width="50">商品价格</th>
				<th width="80">备注说明</th>
				<th width="50">公司编号</th>
				<th width="50">最后修改时间</th>
				<th width="60">操作</th>
			</tr>
			
		</thead>
		<tbody>
		   <c:forEach items="${page.list }" var="p">
				<tr class="text-c">
					<td><input type="checkbox" value="${p.saleDetailId }"  name="ids"> </td> <!-- 这里所有的复选框都叫ids -->
					<td>${p.saleDetailId}</td>								<!-- 复选框name=ids，方法参数也要是ids -->
					<td>${p.saleId }</td>
					<td >${p.goodId  }</td>
					<td >${p.goodNum  }</td>
					<td >${p.goodPrice  }</td>
					<td >${p.saleDetailRemark  }</td>
					<td >${p.companyId  }</td>
					<td >
					<fmt:formatDate value="${p.lastModifyDate  }" pattern="yyyy-MM-dd"/>
					</td>
					
					<td class="td-manage">				
					<!-- 根据id来区分是编辑还是删除 -->
                    <a title="修改销售详情" href="javascript:;" onclick="member_edit('编辑销售详情','xssalectrl/goaddxsDetail.do','${p.saleDetailId }','520')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a>  
					<a title="删除" href="javascript:;" onclick="member_del(this,'${p.saleDetailId}')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</form><!--  这个表单用来批量删除-->	

</div>

	
	<div>
				<span>当前${page.pageNum}/${page.pages}页</span>
				<div style="float: right;">
					<button onclick="gopage(${page.navigateFirstPage })"
						style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">首页</button>
					
					<button onclick="gopage(${page.prePage })"
						style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">上一页</button>
					
					<button disabled="disabled"
						style=" width:26px;height:26px;background-color: rgb(90, 152, 222);border: 0px;border-radius: 5px;">${page.pageNum}</button>
					<button onclick="gopage(${page.nextPage })"
						style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">下一页</button>
					
					<button onclick="gopage(${page.navigateLastPage })"
						style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">尾页</button>
					
				</div>
				<script type="text/javascript">
					function gopage(pageNum){
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


/*客户信息-添加*/
function member_add(title,url,id,w,h){
	alert(id);
	 url=url+"?saleId="+id;
	layer_show(title,url,w,h);
}


/*客户信息-编辑*/
function member_edit(title,url,id,w,h){
alert(id);
	url=url+"?saleDetailId="+id;
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
			url: 'xssalectrl/deletexsDetail.do',
			data: "saleDetailId="+id,
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