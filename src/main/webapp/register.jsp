<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<html>

<head>
<link href="css/secKill.css" rel="stylesheet" type="text/css" />
<title>登录界面</title>

<script type="text/javascript">
function toValidate(){
var reg=/^[0-9a-zA-Z]+$/;
var name=document.getElementById("name").value.replace(/(^\s+)|(\s+$)/g, "");
var pwd=document.getElementById("pwd").value.replace(/(^\s+)|(\s+$)/g, "");
var confirmPwd=document.getElementById("confirmPwd").value.replace(/(^\s+)|(\s+$)/g, "")
 var errorName=document.getElementById("error-name");
 var errorPwd=document.getElementById("error-pwd");
 var errorConfirm=document.getElementById("error-confirm")
 
 

//使用正则表达式
if(!reg.test(name)||name==null){
	
	errorName.style.display="block";
}else{
	errorName.style.display="none";
}
if(pwd.length>120||pwd.length<=0){
	errorPwd.style.display="block";
}if(confirmPwd!=pwd){
	errorConfirm.style.display="block";
}
else{
	errorPwd.style.display="none";
}

}



</script>
</head>
<body>



	<div class="div">
		<div class="above">
			<div style="float: left; margin: 20px;">秒杀平台</div>
			<div>
				<ul>

					<li><a href="index.jsp"  > 登录</a></li>
					<li><a href="#"> 注册</a></li>

				</ul>
			</div>




		</div>


		<div class="middle">会员注册</div>

		<div class="bottom">

			<table>

				<tr>

					<td>用户名：</td>
					<td><input type="text" name="name" class="name" id="name" value=""><strong
						style="color: red">*</strong><div   id="error-name" class="error-info">输入的不合法</div></td>

				</tr>
				<tr>

					<td>密码：</td>
					<td><input type="password" name="pwd" class="pwd"  id="pwd"value="">
						<strong style="color: red">*</strong><div   id="error-pwd"  class="error-info">输入的不合法</div></td>

				</tr>
				<tr>

					<td>再次输入密码：</td>
					<td><input type="password" name="confirmPwd"  id="confirmPwd" value=""> <strong
						style="color: red">*</strong><div   id="error-confirm"  class="error-info">两次输入的密码不相同</div></td>
				</tr>
			</table>


		</div>


		<div class="bottom" style="   border-top: 2px solid grey; border-bottom: 2px solid grey; padding: 11px 0 13px 249px; ">

			我是卖家：<input type="checkbox" name="" value=""> <br /> 店铺名称：<input
				type="text" name="" value="" disabled="disabled"> <strong style="color: red">*</strong><br />





		</div>
		<div class="button">

			<input type="button" name="" value="返回首页"> <input
				type="button" name=""   onclick="toValidate()" value="登录">
		</div>
	</div>




</body>
</html>
