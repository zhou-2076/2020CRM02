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
			<from action=""> <input type="text" value="${ssz}"
				class="input-text" style="width:250px" placeholder="供货商名称模糊搜索"
				id="sousuo">
			<button type="button" class="btn btn-success radius"
				onclick="return sousuo()">
				<i class="Hui-iconfont">&#xe665;</i> 搜索
			</button>
			<button onclick="cla()" type="reset"
				style="background-color: pink;border: 0px;"
				class="btn btn-success radius">
				<i class="Hui-iconfont">&#xe68f;</i>重置
			</button>
			</from>
		</div>
		<script type="text/javascript">
			function cla() {
				document.getElementById("sousuo").value = "";
			}
		</script>
		<c:if test="${temp=='no'}">
			<h1>暂无数据</h1>
		</c:if>

		<div class="cl pd-5 bg-1 bk-gray mt-20">
			<span class="l"> </span> <span class="r">共有数据：<strong>${page.total}</strong>
				条
			</span>
		</div>
		<div class="mt-20">
			<table
				class="table table-border table-bordered table-hover table-bg table-sort">
				<thead>
					<tr class="text-c">
						<th width="80">ID</th>
						<th width="100">采购标题</th>
						<th width="100">商品名</th>
						<th width="100">数量</th>
						<th width="100">价格</th>
						<th width="40">是否入库</th>
						<th width="40">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${page.list }" var="p">
						<tr class="text-c">
							<td>${p.cgXqId }</td>
							<td>${p.cgOrder.cgTitle }</td>
							<td>${p.cpName}</td>
							<td>${p.cpNum }辆</td>
							<td>${p.cpJg }w</td>
							<td><c:if test="${p.sfRk=='未入库'}">
									<span class="label label-danger radius">${p.sfRk}</span>
								</c:if> <c:if test="${p.sfRk=='已入库'}">
									<span class="label label-success radius">${p.sfRk}</span>
								</c:if></td>
							<td class="td-manage"><a style="text-decoration:none"
								onClick="cksjxq(${p.cgXqId })" href="javascript:;"
								title="查看采购明细"> <i class="Hui-iconfont">&#xe616;</i>
							</a> <c:if test="${p.cpId!=-1}">
									<a onclick="change(${p.cgXqId})" title="入库" class="ml-5"
										style="text-decoration:none;"> <i class="Hui-iconfont">&#xe6e1;</i>
									</a>
								</c:if> <c:if test="${p.cpId==-1}">
									<a onclick="changexh(${p.cgXqId})" title="入库" class="ml-5"
										style="text-decoration:none;"><i class="Hui-iconfont">&#xe6e1;</i>
									</a>
								</c:if></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div id="window-from" class="none">
				<form style="margin-left: 20px;" id="from" method="post">
					<table>
						<tr>
							<td>商品名称</td>
							<td>
							<input class="inputcl" type="hidden" id="cgxqid">
							<input readonly="readonly" class="inputcl" type="text"
								id="spmc" name="productName"></td>
							<td>商品类别</td>
							<td><input type="text" id="splb"
								name="productType"></td>
						</tr>
						<tr>
							<td>库存数量</td>
							<td><input readonly="readonly" type="text" id="kcsl"
								name="kcNum"></td>

							<td>规格说明</td>
							<td><input type="text" id="ggsm" name="ggsm"></td>
						</tr>
						<tr>
							<td>仓库</td>
							<td><select id="ck" name="warehouseId" class="selectbyzy">
							</select></td>
							<td>零售价</td>
							<td><input type="text" id="lsj"
								name="renall"></td>
						</tr>
						<tr>
							<td>公司</td>
							<td><input readonly="readonly" type="text" id="gs">
								<input type="hidden" id="gsid" name="companyId"></td>
							<td>成本价</td>
							<td><input type="text" id="cbj"
								name="cost"></td>
						</tr>
						<tr>
							<td>单位</td>
							<td><input type="text" id="dw" name="unit"></td>
							<td>经销价</td>
							<td><input type="text" id="jxj"
								name="sell"></td>
						</tr>
						<tr>
							<td><div>备注信息</div></td>
							<td colspan="3"><textarea style="float: left;" rows="5"
									cols="70" id="bzxx" name="orderRemark"></textarea></td>
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
									id="b" class="hvr-sweep-to-right button">^_^!</a>
								<li><a id="c" class="hvr-sweep-to-left button">^_^!</a></li>
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
				  
				  location.href="purctrl/enter.do?pageNum="+${page.navigateFirstPage }+
				      "&name="+document.getElementById("sousuo").value
				  }
				  </script>
					<button onclick="syy()"
						style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">上一页</button>
					<script type="text/javascript">
				  function syy(){
				 
				  location.href="purctrl/enter.do?pageNum="+${page.prePage}+
				      "&name="+document.getElementById("sousuo").value
				  }
				  </script>
					<button disabled="disabled"
						style=" width:26px;height:26px;background-color: rgb(90, 152, 222);border: 0px;border-radius: 5px;">${page.pageNum}</button>
					<button onclick="xyy()"
						style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">下一页</button>
					<script type="text/javascript">
				     function xyy(){
				  		 
				      location.href="purctrl/enter.do?pageNum="+${page.nextPage}+
				      "&name="+document.getElementById("sousuo").value
				    }
				   </script>
					<button onclick="wy()"
						style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">尾页</button>
					<script type="text/javascript">
				     function wy(){
				     location.href="purctrl/enter.do?pageNum="+${page.navigateLastPage }+
				      "&name="+document.getElementById("sousuo").value
				    }
				  </script>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		/* 搜索 */
		function sousuo() {
			var sousuo = document.getElementById("sousuo").value;
			location.href = "purctrl/enter.do?name=" + sousuo
		}
		/*明细*/
		function cksjxq(id) {
			$.ajax({
				type : "post",
				url : "<%=basePath%>purctrl/selectDetailBycgXqId.do?id=" + id,
				dataType : "json",
				success : function(data) //从前台回调回来的数组，处理后的数据
				{
				
					$("#a").html("操作人：" + data.czrmc);
					$("#b").html("公司：" + data.comname);
					$("#c").html("备注：" + data.bzXx);
				}
			});
			layer.open({
				type : 1,
				area : [ '700px', '300px' ],
				fix : false, //不固定
				maxmin : true,
				shade : 0.4,
				title : '明细',
				content : $('#window-div')
			});
		}
		/* 补货入库 */
		function change(id) {
			$.ajax({
				type : "post",
				url : "<%=basePath%>purctrl/changerk.do?id=" + id,
				dataType : "json",
				success : function(data) //从前台回调回来的数组，处理后的数据
				{
					if (data == 1) {
						layer.msg("此商品补货已完成", {
							icon : 6
						});
						setTimeout(function() {
							location.replace(location.href);
						}, 1000)
					}
				}
			});
		}
		/* 新货入库 */
		function changexh(id) {
			$.ajax({
				type : "post",
				url : "<%=basePath%>purctrl/selectdial.do?id=" + id,
				dataType : "json",
				success : function(data) //从前台回调回来的数组，处理后的数据
				{
				
				    $("#cgxqid").val(data.cgXqId);
					$("#spmc").val(data.cpName);
					$("#kcsl").val(data.cpNum);
					$("#gs").val(data.comname);
					$("#gsid").val(data.conpanyId);
					var op = "";
					op = "<option>请选择</option>";
					$.each(data.kcWarehouseInfo, function(i, comp) {
						op += "<option value='" + comp.warehouseId + "'>" + comp.warehouseName + "</option>"
					});
					$("#ck").html(op);
				}
			});
			var index = layer.open({
				type : 1,
				area : [ '600px', '530px' ],
				btn : [ '提交', '取消' ],
				fix : false, //不固定
				maxmin : true,
				shade : 0.4,
				title : '编辑',
				content : $('#window-from'),
				yes : function() {
					temp = 1;
					$.ajax({
						type : "post", //请求方式
						url : "purctrl/addkcgoods.do?id="+id, //url地址
						data : $('#from').serialize(), //序列化表单的参数
						dataType : "json" //响应类型
					});
					//提交完成后关闭弹层
					layer.close(index);
					if (temp == 1) {
						layer.msg("新商品入库成功", {
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
		}
	</script>
</body>
</html>