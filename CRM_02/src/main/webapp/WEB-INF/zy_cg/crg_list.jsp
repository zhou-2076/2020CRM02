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

<!-- 采购明细样式 -->
<link href="static/zy_css/style.css" rel='stylesheet' type='text/css' />
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
		用户中心 <span class="c-gray en">&gt;</span> 用户管理 <a
			class="btn btn-success radius r"
			style="line-height:1.6em;margin-top:3px"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="Hui-iconfont">&#xe68f;</i></a>
	</nav>
	<div class="page-container">
		<div class="text-c">
		<!-- <form action=""> -->
			状态：<select id="sousuo"  style="height: 31px;" class="selectbyzy">
				<option value="">请选择</option>
				<option value="已处理" ${ssz=='已处理' ? "selected":"" }>已处理</option>
				<option value="未处理" ${ssz=='未处理' ? "selected":"" }>未处理</option>
			</select>
			<button type="button" class="btn btn-success radius"
				onclick="return sousuo()">
				<i class="Hui-iconfont">&#xe665;</i> 搜索
			</button>
			<button onclick="cla()" type="reset" style="background-color: pink;border: 0px;" class="btn btn-success radius">
				<i class="Hui-iconfont">&#xe68f;</i>重置
			</button>
			<!-- </form> -->
		</div>
		<script type="text/javascript">
		function cla(){
		document.getElementById("sousuo").value="";
		}
		</script>
		<c:if test="${temp=='no'}">
			<h1>暂无数据</h1>
		</c:if>
		<c:if test="${temp=='yes'}">
			<div class="cl pd-5 bg-1 bk-gray mt-20">
				<span class="l"> <a href="javascript:;"
					onclick="return plsc()" class="btn btn-danger radius"> <i
						class="Hui-iconfont">&#xe6e2;</i> 批量删除
				</a>
				</span> <span class="r">共有数据：<strong>${page.total}</strong> 条
				</span>
			</div>
			<div class="mt-20">
				<table
					class="table table-border table-bordered table-hover table-bg table-sort">
					<thead>
						<tr class="text-c">
							<th width="25"><input type="checkbox" id="all-check"></th>
							<th width="60">产品</th>
							<th width="40">采购数量</th>
							<th width="40">价格</th>
							<th width="40">操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${page.list }" var="p">
							<tr class="text-c">
								<td id="inpid${p.cgRepId}"><input type="checkbox"
									name="one-check" value="${p.cgRepId }"></td>
								<c:if test="${p.zt=='已处理'}">
								<script type="text/javascript">
                                $("#inpid"+${p.cgRepId}).html('<input disabled="disabled" type="checkbox">');
                                </script>
								</c:if>
								<td>${p.kcGoodsInfo.productName }</td>
								<td>${p.cgOrderDetail.cpNum}辆</td>
								<td>${p.cgOrderDetail.cpJg}w</td>
								<td class="td-manage">
								<c:if test="${p.zt=='已处理'&&p.cgOrderDetail.sfRk=='未入库'}">
										<a href="javascript:;" disabled="disabled"
											style="background-color:#c8d6d6;display: block;"
											class="btn radius">已处理 </a>
									</c:if>
									<c:if test="${p.zt=='已处理'&&p.cgOrderDetail.sfRk=='已入库'}">
										<a href="javascript:;" disabled="disabled"
											style="background-color:pink;display: block;"
											class="btn radius">已入库 </a>
									</c:if>
									 <c:if test="${p.zt=='未处理'}">
										<a style="text-decoration:none"
											onClick="cksjxq(${p.cgRepId })" href="javascript:;"
											title="查看明细"> <i class="Hui-iconfont">&#xe616;</i>
										</a>
										<a title="编辑" href="javascript:;"
											onclick="bj(${p.cgRepId },${p.cgOrderDetail.cpNum},${p.cgOrderDetail.cpJg})"
											class="ml-5" style="text-decoration:none"> <i
											class="Hui-iconfont">&#xe6df;</i>
										</a>
										<a title="删除" href="javascript:;"
											onclick="return sc(${p.cgRepId })" class="ml-5"
											style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i>
										</a>

									</c:if></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div id="window-from" class="none">
					<form style="margin-left: 20px;" id="from" method="post">
						<table>
							</tr>
							<tr>
								<td>产品单价</td>
								<td><input class="inputcl" type="hidden" id="xcgid"
									name="cgRepId"> <input class="inputcl" type="hidden"
									id="zt" name="zt"> <input class="inputcl" type="hidden"
									id="czy" value="${public.czrid}" name="operaterId"> <input
									class="inputcl" type="hidden" id="gs" name="companyId">
									<input class="inputcl" type="hidden" id="cp" name="cpId">
									<input readonly="readonly" type="text" id="cpdj"></td>

							</tr>
							<tr>
								<td>产品数量</td>
								<td><input oninput="cs()" type="text" id="cpsl"
									name="cpNum"></td>

							</tr>
							<tr>
								<td>产品总价</td>
								<td><input readonly="readonly" type="text" id="cpzj"
									name="cpJg"></td>
								<script>
							function cs(){
		                      $("#cpzj").val($("#cpdj").val()*$("#cpsl").val())
		                           }
							</script>
							</tr>
							<tr>
								<td><div>备注信息</div></td>
								<td colspan="3"><textarea style="float: left;" rows="5"
										cols="70" id="bzxx" name="bzXx"></textarea></td>
							</tr>
						</table>
					</form>
				</div>
				<div id="window-div" class="none" style="width: 750px;">
					<div class="hover-buttons">
						<div class="wrap">
							<div class="bg-effect">
								<ul class="bt-list">
									<li><a id="a" class="hvr-back-pulse button">^_^!</a> <a
										id="b" class="hvr-sweep-to-right button">^_^!</a></li>
									<li><a id="c" class="hvr-sweep-to-bottom button">^_^!</a>
									</li>
									<li><a id="g" class="hvr-bounce-to-bottom button">^_^!</a>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
				<br>
				<div>
					<span>当前${page.pageNum}/${page.pages}页</span>
					<div style="float: right;">
						<button onclick="sy()"
							style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">首页</button>
						<script type="text/javascript">
				  function sy(){
				  
				  location.href="purctrl/selectcgr.do?pageNum="+${page.navigateFirstPage }+
				      "&title="+document.getElementById("sousuo").value;
				  }
				  </script>
						<button onclick="syy()"
							style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">上一页</button>
						<script type="text/javascript">
				  function syy(){
				 
				  location.href="purctrl/selectcgr.do?pageNum="+${page.prePage}+
				      "&title="+document.getElementById("sousuo").value;
				  }
				  </script>
						<button disabled="disabled"
							style=" width:26px;height:26px;background-color: rgb(90, 152, 222);border: 0px;border-radius: 5px;">${page.pageNum}</button>
						<button onclick="xyy()"
							style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">下一页</button>
						<script type="text/javascript">
				     function xyy(){
				  		 
				      location.href="purctrl/selectcgr.do?pageNum="+${page.nextPage}+
				      "&title="+document.getElementById("sousuo").value;
				    }
				   </script>
						<button onclick="wy()"
							style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">尾页</button>
						<script type="text/javascript">
				     function wy(){
				     location.href="purctrl/selectcgr.do?pageNum="+${page.navigateLastPage }+
				      "&title="+document.getElementById("sousuo").value;
				    }
				  </script>
					</div>
				</div>
		</c:if>
	</div>

	<script type="text/javascript">
		/* 搜索 */
		function sousuo() {
			var sousuo = document.getElementById("sousuo").value;
			location.href = "purctrl/selectcgr.do?title=" + sousuo;
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
					location.href = "<%=basePath%>purctrl/deletcgr.do?" + id;
					return true;
				} else {
					return false;
				}
			}
		}
		/* 单个删除 */
		function sc(uid) {
			if (confirm("确认删除吗") == true) {
				location.href = "<%=basePath%>purctrl/deletcgr.do?id=" + uid;
				return true;
			}
		}
		/*采购明细*/
		function cksjxq(id) {
			$.ajax({
				type : "post",
				url : "<%=basePath%>purctrl/selectcrgbyid.do?id=" + id,
				dataType : "json",
				success : function(data) //从前台回调回来的数组，处理后的数据
				{
					$("#a").html("操作员：" + data.czrname);
					$("#b").html("公司：" + data.compname);
					$("#c").html("备注信息：" + data.bzXx);
					var date = new Date(data.lastTime);
					var Y = date.getFullYear() + '-';
					var M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';
					var D = date.getDate() + ' ';
					var H = date.getHours() + ':';
					var F = date.getMinutes() + ':';
					var S = date.getSeconds();
					$("#g").html("最后修改时间" + Y + M + D + H + F + S);
				}
			});
			layer.open({
				type : 1,
				area : [ '700px', '350px' ],
				fix : false, //不固定
				maxmin : true,
				shade : 0.4,
				title : '明细',
				content : $('#window-div')
			});
		}
		/* 编辑 */
		function bj(id, sl, jg) {
		var temp=0;
			$.ajax({
				type : "post",
				url : "<%=basePath%>purctrl/selectcrgbyid.do?id=" + id,
				dataType : "json",
				success : function(data) //从前台回调回来的数组，处理后的数据
				{
					$("#xcgid").val(data.cgRepId);
					$("#cp").val(data.cpId);
					$("#zt").val(data.zt);
					$("#gs").val(data.companyId);
					$("#cpdj").val(data.kcGoodsInfo.sell);
					$("#cpsl").val(sl);
					$("#cpzj").val(jg);
					$("#bzxx").html(data.bzXx);
				}
			});
	
			var index = layer.open({
				type : 1,
				area : [ '600px', '450px' ],
				btn : [ '提交', '取消' ],
				fix : false, //不固定
				maxmin : true,
				shade : 0.4,
				title : '编辑',
				content : $('#window-from'),
				yes : function() {
				temp=1;
					/* 输出序列后的值，name一定要和bean的一样 */
					/* alert($('#from').serialize()); */
					$.ajax({
						type : "post", //请求方式
						url : "purctrl/updatetCgR.do", //url地址
						data : $('#from').serialize(), //序列化表单的参数
						dataType : "json" //响应类型
					});
					//提交完成后关闭弹层
					layer.close(index);
					if (temp == 1) {
						layer.msg("修改成功", {
							icon : 6,
							time : 2000
						});
					}
				},
				//end是关闭窗口时自动执行
				end : function() {
					/* alert("关闭后刷新页面"); */
					setTimeout(function() {
						location.replace(location.href);
					}, 1000)
				}
			});
		//弹层全屏
		//layer.full(index);
		}
	</script>
</body>
</html>