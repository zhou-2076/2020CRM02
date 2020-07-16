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

<!-- from表单样式 -->
<link rel="stylesheet" href="static/from/css/platform-1.css">

<title>用户管理</title>

<style type="text/css">
.none { /* 弹层默认隐藏 */
	display: none;
}

/* .inputcl{
width: 140px;
height: 37.27px;
border-radius: 5px;
font-size: 15px;
padding-left:5px;
border: 1px  rgb(194, 187, 191) solid;
outline: none;
} */
</style>
</head>
<body>

	<nav class="breadcrumb">
		<i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>
		 考核指标管理 <a
			class="btn btn-success radius r"
			style="line-height:1.6em;margin-top:3px"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="Hui-iconfont">&#xe68f;</i></a>
	</nav>
	
	<div class="page-container">
	
		<div class="text-c">
			考核指标集名称： <input type="text" id="sousuo" style="width:200px;">
			<button type="button" class="btn btn-success radius"
				onclick="return sousuo()">
				<i class="Hui-iconfont">&#xe665;</i> 搜索
			</button>
		</div>
		
		<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l">
			<a href="javascript:;" onclick="return plsc()" class="btn btn-danger radius">
			<i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>
			<a href="javascript:;" onclick="add()" class="btn btn-primary radius">
			<i class="Hui-iconfont">&#xe600;</i> 添加考核任务</a></span>
		</div>
				
		<table class="table table-border table-bordered table-hover table-bg table-sort">
			<thead>
				<tr class="text-c">
					<th width="25"><input type="checkbox" id="all-check"></th>
					<th width="40">ID</th>
					<th width="100">考核指标名称</th>
					<th width="40">公司编号</th>
					<th width="100">备注</th>
					<th width="100">最后修改时间</th>
					<th width="20">操作</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach items="${p.list }" var="p">
					<tr class="text-c">
						<td><input type="checkbox" name="one-check"
							value="${p.indexId }"></td>
						<td>${p.indexId }</td>
						<td><a onclick="ckxg(${p.indexId })">${p.assessIndex }</a></td>
						<td>${p.companyId }</td>
						<td><a onclick="ckxg(${p.indexId })" title="备注详情">${p.remark}</a></td>
						<td><fmt:formatDate value="${p.lastModifyDtae}"
							pattern="yyyy-MM-dd HH:mm:ss" /></td>
						<td><a title="修改" onclick="ckxg(${p.indexId })"><i class="Hui-iconfont">&#xe6df;</i></a>&nbsp;
							<a title="删除" onclick="return sc(${p.indexId })"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
					</tr>
				</c:forEach>
			</tbody>
			
		</table><br>
			
		<div>
		
			<span>当前${p.pageNum}/${p.pages}页</span>
			
			<div style="float: right;">
			
			<button onclick="sy()"
			style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">首页</button>
			  <script type="text/javascript">
			  function sy(){
			  location.href="Bgctrl/selectBgAssessIndex.do?pageNum="+${p.navigateFirstPage }}
			  </script>
			  
			<button onclick="syy()" 
			style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">上一页</button>
			  <script type="text/javascript">
			  function syy(){
			  location.href="Bgctrl/selectBgAssessIndex.do?pageNum="+${p.prePage}}
			  </script>
			  
			<button disabled="disabled"
			style=" width:26px;height:26px;background-color: rgb(90, 152, 222);border: 0px;border-radius: 5px;">${p.pageNum}</button>
			<button onclick="xyy()"
			style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">下一页</button>
				<script type="text/javascript">
			    function xyy(){
			    location.href="Bgctrl/selectBgAssessIndex.do?pageNum="+${p.nextPage}}
			    </script>
			   
			<button onclick="wy()"
			style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">尾页</button>
				 <script type="text/javascript">
			     function wy(){
			     location.href="Bgctrl/selectBgAssessIndex.do?pageNum="+${p.navigateLastPage }}
			  	 </script>
			</div>
		</div>
	</div>

	<div id="window-from" class="none">
		<form style="margin-left: 20px;" id="from" method="post">
			<table>
				<br>
				<tr>
					<td></td>
					<td><input type="hidden" id="indexId" name="indexId"></td>
				</tr>
				<tr>
					<td>考核指标名称</td>
					<td><input type="text" id="assessIndex" name="assessIndex"></td>
				</tr>
				<tr>
					<td>备注</td> 
					<td><textarea style="float: left;" rows="5" cols="70"
										id="remark" name="remark"></textarea></td>
				</tr>
					
			</table>
		</form>
	</div>

	<script type="text/javascript">
		/* 搜索 */
		function sousuo() {
		alert(document.getElementById("sousuo").value);
			var sousuo = document.getElementById("sousuo").value;
			location.href = "Bgctrl/selectBgAssessIndex.do?sousuo="+sousuo;
		}
		/* 批量删除 */
		var nodeAll = document.getElementById("all-check");
		nodeAll.onclick = function() {
			//name可以重复id只能有一个
			var nodes = document.getElementsByName("one-check");
			var flag = nodeAll.checked;
			for (var i = 0; i < nodes.length; i++) {
				nodes[i].checked = flag;
			}
		}
		function plsc() {
			var id = "";
			var temp = "";
			var onecheck = document.getElementsByName("one-check");
			for (var i = 0; i < onecheck.length; i++) {
				if (onecheck[i].checked == true) {
					id += "id=" + onecheck[i].value + "&";
					temp = 1;
				}
			}
			if (temp != 1) {
				alert("您未勾选");
				return false;
			}
			if (temp == 1) {
				if (confirm("确认删除吗") == true) {
					location.href = "<%=basePath%>Bgctrl/deleteBgAssessIndex.do?" + id;
					return true;
				} else {
					return false;
				}
			}
		}
		
		/* 单个删除 */
		function sc(id) {
			if (confirm("确认删除吗") == true) {
				location.href = "<%=basePath%>Bgctrl/deleteBgAssessIndex.do?id=" + id;
				return true;
			}
		}
		
		
		/* 添加 */
		function add() {
			var index = layer.open({
				type : 1,
				area : [ '550px', '400px' ],
				btn : [ '提交', '取消' ],
				fix : false, //不固定
				maxmin : true,
				shade : 0.4,
				title : '添加',
				content : $('#window-from'),
				yes : function() {
					/* 输出序列后的值，name一定要和bean的一样 */
					/* alert($('#from').serialize()); */
					$.ajax({
						type : "post", //请求方式
						url : "Bgctrl/addBgAssessIndex.do", //url地址
						data : $('#from').serialize(), //序列化表单的参数
						dataType : "json" //响应类型
					});
					//提交完成后关闭弹层
					layer.close(index);
				},
				//end是关闭窗口时自动执行
				end : function() {
					/* alert("关闭后刷新页面"); */
					window.location.reload(); //关闭弹窗后刷新页面
				}
			});
		//弹层全屏
		//layer.full(index);
		}
		
		
		/*查看修改*/
		function ckxg(id) {
			$.ajax({
				type : "post",//请求方式
				url : "<%=basePath%>Bgctrl/getBgAssessIndex.do?id=" + id, //请求地址
				dataType : "json", //响应类型
				success : function(ck) //从前台回调回来的数组，处理后的数据
				{	
					$("#indexId").val(ck.indexId);
					$("#assessIndex").val(ck.assessIndex);
					$("#remark").val(ck.remark);
				},
				error: function(){
					alert("未知错误！")
				}
					});
					
			var index = layer.open({
				type : 1,
				area : [ '550px', '400px' ],
				btn : [ '修改', '取消' ],
				fix : false, //不固定
				maxmin : true,
				shade : 0.4,
				title : '考核指标详情',
				content : $('#window-from'),
				yes : function() {
					/* 输出序列后的值，name一定要和bean的一样 */
					/* alert($('#from').serialize()); */
					$.ajax({
						type : "post", //请求方式
						url : "Bgctrl/updateBgAssessIndex.do", //url地址
						data : $('#from').serialize(), //序列化表单的参数
						dataType : "json" //响应类型
					});
					//提交完成后关闭弹层
					layer.close(index);
				},
				//end是关闭窗口时自动执行
				end : function() {
					/* alert("关闭后刷新页面"); */
					window.location.reload(); //关闭弹窗后刷新页面
				}
				});
					
					
		}
		
	</script>
	
	
</body>
</html>