<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<!--/meta 作为公共模版分离出去-->

<title>添加客户信息</title>
<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<article class="page-container">
	<form action="xscustomctrl/addcustom.do" method="post" class="form form-horizontal" id="form-member-add">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>客户名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
			    <!-- 如果是添加，则没有id；如果是修改就有id -->
			    <input type="hidden" value="${custom.customId }"  id="customId" name="customId">
				<input type="text" class="input-text" value="${custom.customName }" placeholder="请输入客户名称" id="customName" name="customName">
			</div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">客户属性：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.customProperty }" placeholder="" id="customProperty" name="customProperty">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>网站：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.website }" placeholder="" id="website" name="website">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>股票代码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.sharaCode }" placeholder="" id="sharaCode" name="sharaCode">
			</div>
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">上级单位：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.superDepart }" placeholder="" id="superDepart" name="superDepart">
			</div>
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>所有者：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.owner }" placeholder="" id="owner" name="owner">
			</div>
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">员工数：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.empNum }" placeholder="" id="empNum" name="empNum">
			</div>
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">行业编号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.industryId }" placeholder="" id="industryId" name="industryId">
			</div>
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">客户类型：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.customType }" placeholder="" id="customType" name="customType">
			</div>
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">客户状态：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.customStatus }" placeholder="" id="customStatus" name="customStatus">
			</div>
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">客户来源：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.customSource }" placeholder="" id="customSource" name="customSource">
			</div>
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">负责人编号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.principalId }" placeholder="" id="principalId" name="principalId">
			</div>
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>固定电话：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.telephone }" placeholder="" id="telephone" name="telephone">
			</div>
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>移动电话：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.mobilephone }" placeholder="" id="mobilephone" name="mobilephone">
			</div>
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3">客户传真：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.customFax }" placeholder="" id="customFax" name="customFax">
			</div>
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>开户银行：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.bank }" placeholder="" id="bank" name="bank">
			</div>
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>银行账户：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.bankAccount }" placeholder="" id="bankAccount" name="bankAccount">
			</div>
		</div>
				<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>开户银行：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.bank }" placeholder="" id="bank" name="bank">
			</div>
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>下次联系时间：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<%-- <input type="text" class="input-text" value="${custom.nextTime }" placeholder="" id="nextTime" name="nextTime"> --%>
				<input style="width: 160px;height: 37.27px" type="text"
								onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"
								class="input-text Wdate" type="text" id="s" name="nextTime">
			</div>
		</div>
		<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>电子邮箱：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.email }" placeholder="" id="email" name="email">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>SIC编码：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.sic }" placeholder="" id="sic" name="sic">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>支付方式：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.payMethod }" placeholder="" id="payMethod" name="payMethod">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>是否有效：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" value="${custom.enabled }" placeholder="" id="enabled" name="enabled">
			</div>
		</div>
		
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>详细地址：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="password" class="input-text" autocomplete="off" value="${custom.address }" placeholder="密码" id="address" name="address">
		</div>
	</div>
	<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">备注信息：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<textarea name="remarkMessage" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" onKeyUp="$.Huitextarealength(this,100)">${p.customRemark}</textarea>
				<p class="textarea-numberbar"><em class="textarea-length">0</em>/100</p>
			</div>
		</div>
	<div class="row cl">
		<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>公司编号：</label>
		<div class="formControls col-xs-8 col-sm-9">
			<input type="text" class="input-text" value="${custom.companyId }" placeholder="" id="companyId" name="companyId">
		</div>
	</div>
		
		
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-3">最后修改时间：</label>
			<div class="formControls col-xs-8 col-sm-9">
			     <%Date date=new Date();
			       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			       String nowtime=sdf.format(date);
			      %>
				<input type="hidden" class="input-text" value="<%=nowtime %>" id="lastModifyDate" name="lastModifyDate">
			    <%=nowtime %>
			</div>
		</div>
		<div class="row cl">
			<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
				<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
			</div>
		</div>
	</form>
</article>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="CrmStatic/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="CrmStatic/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="CrmStatic/static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="CrmStatic/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本--> 
<script type="text/javascript" src="CrmStatic/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="CrmStatic/lib/jquery.validation/1.14.0/jquery.validate.js"></script> 
<script type="text/javascript" src="CrmStatic/lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="CrmStatic/lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript" src="CrmStatic/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="CrmStatic/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#form-member-add").validate({
		rules:{
			customName:{
				required:true,
			}
		},
		onkeyup:false,
		focusCleanup:true,
		success:"valid",
		submitHandler:function(form){
			$(form).ajaxSubmit();
			var index = parent.layer.getFrameIndex(window.name);
			//parent.$('#btn-refresh').click();
			window.parent.location.reload();//刷新父页面
			parent.layer.msg('操作成功!',{icon: 6,time:1000});
			parent.layer.close(index);
			
		}
	});
});
</script> 
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>