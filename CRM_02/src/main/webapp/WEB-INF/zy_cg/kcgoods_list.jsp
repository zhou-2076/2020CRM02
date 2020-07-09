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
			库存数量范围： <input type="text" id="num1" style="width:200px;"> -
			<input type="text" id="num2" style="width:200px;"> <input
				type="text" style="width:250px" placeholder="对商品名称模糊搜索" id="sousuo">
			<!-- 每次都带上搜索的值 -->
			<input type="hidden" id="ssz" value="${ssz}">
			<!-- 时间格式的转化很重要，要不然功能无法完成 -->
			<input type="hidden" id="num11" value="${num1}"> <input
				type="hidden" id="num22" value="${num2}">
			<!-- 每次都带上搜索的值 -->
			<button type="button" class="btn btn-success radius"
				onclick="return sousuo()">
				<i class="Hui-iconfont">&#xe665;</i> 搜索
			</button>
		</div>
		<c:if test="${temp=='no'}">
			<h1>暂无数据</h1>
		</c:if>
		<c:if test="${temp=='yes'}">
			<br>
			<br>
			<table
				class="table table-border table-bordered table-hover table-bg table-sort">
				<thead>
					<tr class="text-c">
						<th width="25"><input type="checkbox" id="all-check"></th>
						<th width="80">ID</th>
						<th width="100">商品名称</th>
						<th width="100">库存数量</th>
						<th width="40">单价</th>
						<th width="40">商品类别</th>
						<th width="20">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${page.list }" var="p">
						<tr class="text-c">
							<td><input type="checkbox" name="one-check"
								value="${p.productId }"></td>
							<td>${p.productId }</td>
							<td>${p.productName }</td>
							<td>${p.kcNum }</td>
							<td>${p.sell}w</td>
							<td>${p.productType}</td>
							<td class="td-manage"><c:if test="${p.cgRepGoods==null}">
									<a href="javascript:;"
										onclick="add(${p.productId },'${p.productName}',${p.sell})"
										style="background-color:#ceccf7;display: block;"
										class="btn radius"> 请求补货</a>
								</c:if> <c:if test="${p.cgRepGoods!=null}">
									<a href="javascript:;" disabled="disabled"
										style="background-color:#c8d6d6;display: block;"
										class="btn radius"> 您已发布 </a>
								</c:if></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div id="window-from" class="none">
				<form style="margin-left: 20px;" id="from" method="post">
					<table>
						<tr>
							<td>产品</td>
							<td><input class="inputcl" type="hidden" id="cp" name="cpId">
								<input class="inputcl" type="text" id="cp1" name="cpName"></td>
							<td>交货时间</td>
							<td><input style="width: 160px;height: 37.27px" type="text"
								onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"
								class="input-text Wdate" id="jhsj" name="jhDate"></td>
						</tr>
						
						<tr>
							<td>产品单价</td>
							<td><input readonly="readonly" type="text" id="cpdj" name></td>
							
						</tr>
						<tr>
							<td>产品数量</td>
							<td><input oninput="cs()" type="text" id="cpsl" name="cpNum"></td>
							<script>
							function cs(){
		                      $("#cpzj").val($("#cpdj").val()*$("#cpsl").val())
		                              }
							</script>
						</tr>
						<tr>
							<td>产品总价</td>
							<td><input readonly="readonly" type="text" id="cpzj" name="cpJg"></td>
						</tr>
						<tr>
							<td>操作员</td>
							<td>
							<input type="text" value="${public.czrmc}">
							<input type="hidden" id="czy" value="${public.czrid}" name="operaterId">
							</td>
						</tr>
						<tr>
							<td>公司</td>
							<td>
							<select id="comp" name="companyId" class="selectbyzy">
							</select>
							</td>
						</tr>
						<tr>
							<td><div>备注信息</div></td>
							<td colspan="3"><textarea
									style="float: left;" rows="5" cols="70"
									id="bzxx" name="bzXx"></textarea></td>
						</tr>
					</table>
				</form>
			</div>
			<br>
			<div>
				<span>当前${page.pageNum}/${page.pages}页</span>
				<div style="float: right;">
					<button onclick="sy()"
						style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">首页</button>
					<script type="text/javascript">
				  function sy(){
				  
				  location.href="purctrl/seKcGoodsInfo.do?pageNum="+${page.navigateFirstPage }+
				      "&name="+document.getElementById("ssz").value+
				      "&num1="+document.getElementById("num11").value+
				      "&num2="+document.getElementById("num22").value;
				  }
				  </script>
					<button onclick="syy()"
						style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">上一页</button>
					<script type="text/javascript">
				  function syy(){
				 
				  location.href="purctrl/seKcGoodsInfo.do?pageNum="+${page.prePage}+
				      "&name="+document.getElementById("ssz").value+
				      "&num1="+document.getElementById("num11").value+
				      "&num2="+document.getElementById("num22").value;
				  }
				  </script>
					<button disabled="disabled"
						style=" width:26px;height:26px;background-color: rgb(90, 152, 222);border: 0px;border-radius: 5px;">${page.pageNum}</button>
					<button onclick="xyy()"
						style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">下一页</button>
					<script type="text/javascript">
				     function xyy(){
				  		 
				      location.href="purctrl/seKcGoodsInfo.do?pageNum="+${page.nextPage}+
				      "&name="+document.getElementById("ssz").value+
				      "&num1="+document.getElementById("num11").value+
				      "&num2="+document.getElementById("num22").value;
				    }
				   </script>
					<button onclick="wy()"
						style="height: 26px;width: 50px;border: 0px;border-radius: 5px;">尾页</button>
					<script type="text/javascript">
				     function wy(){
				     location.href="purctrl/seKcGoodsInfo.do?pageNum="+${page.navigateLastPage }+
				      "&name="+document.getElementById("ssz").value+
				      "&num1="+document.getElementById("num11").value+
				      "&num2="+document.getElementById("num22").value;
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
			var num1 = document.getElementById("num1").value;
			var num2 = document.getElementById("num2").value;
			if (num1 != "" & num2 != "") {
				if (num2 < num1) {
					alert("不符合搜索逻辑,请重新选择(后面的数量应比前面大)");
					return false;
				}
			}
			if (num1 != "" & num2 != "" & num2 == num1) {
				alert("不符合搜索逻辑,请重新选择(数量不能相同)");
				return false;
			}
			location.href = "purctrl/seKcGoodsInfo.do?name=" + sousuo + "&num1=" + num1 + "&num2=" + num2;
		}
		/* 请求采购 */
		function add(id, name,price) {
			$("#cp").val(id);
			$("#cp1").val(name);
			$("#cpdj").val(price);
			$.ajax({
					type : "post",
					url : "<%=basePath%>purctrl/selectallcompany.do",
					dataType : "json",
					success : function(data) //从前台回调回来的数组，处理后的数据
					{
						var h = "";
						h = "<option>请选择</option>";
						$.each(data, function(i, comp) {
							h += "<option value='" + comp.companyId + "'>" + comp.companyName + "</option>"
						});
						$("#comp").html(h);
					}
				});
			var index = layer.open({
				type : 1,
				area : [ '600px', '550px' ],
				btn : [ '提交', '取消' ],
				fix : false, //不固定
				maxmin : true,
				shade : 0.4,
				title : '编辑',
				content : $('#window-from'),
				yes : function() {
					/* 输出序列后的值，name一定要和bean的一样 */
					/* alert($('#from').serialize()); */
					$.ajax({
						type : "post", //请求方式
						url : "purctrl/addcgreq.do", //url地址
						data : $('#from').serialize(), //序列化表单的参数
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
		
		
	</script>
</body>
</html>