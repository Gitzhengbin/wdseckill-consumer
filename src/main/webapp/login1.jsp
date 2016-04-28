<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
response.setHeader("Cache-Control","no-store"); 
response.setHeader("Pragrma","no-cache"); 
response.setDateHeader("Expires",0); 
%>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>登录界面</title>
<link href="css/secKill.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="div">
		<div class="above">
			<div style="float: left; margin: 20px;">秒杀平台</div>
			<div>
				<ul>
					<li><a href="#"> 登录</a></li>
					<li><a href="register.jsp"> 注册</a></li>
				</ul>
			</div>
		</div>
		<div class="middle">会员登录</div>
		<form action="login.do" method="post">
		<div class="bottom">
			<table>
				<tr>
					<td>用户名：</td>
					<td>
						<input type="text" name="u_name" placeholder="4-20个字母和数字组成" id="name">
						<strong style="color: red">*</strong>
						<div id="error-name" class="error-info">输入的不合法</div>
					</td>
				</tr>
				<tr>
					<td>密码：</td>
					<td>
						<input type="password" name="u_pwd" id="pwd" placeholder="最长12个字母"> 
						<strong style="color: red">*</strong>
						<div id="error-pwd" class="error-info">输入的不合法</div>
					</td>
				</tr>
			</table>
		</div>
		<div class="button">
			<input type="button" name="" value="返回首页"> 
			<input type="submit" name="" onclick="toValidate()" value="登录">
		</div>
		</form>
	</div>
</body>
</html>