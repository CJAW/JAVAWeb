<%@page import="com.sun.net.httpserver.Authenticator.Success"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆界面</title>
</head>



<body>
<h1 align="center">欢迎使用</h1>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<form action="<%=request.getContextPath() %>/LoginServlet" method ="post">
<table align="center">

<tr>
<td>
用户名：
</td>
<td>
<input type ="text" name = "username" >

</td>
</tr>
<tr>
<td>密码:</td>
<td><input type = "password" name = "password"></td>
</tr>
<tr align="right">
<td><br></td>
<td><br></td>
</tr>
<tr align="right">
<td><br></td>
<td><br></td>
</tr>
<tr align="right">
<td><input type ="submit" name ="submit"></td>
<td><input type ="reset" name = "reset"></td>
</tr>


</table>
</form>
<a href="<%=request.getContextPath()%>/classDesign/Register.jsp">注册</a>
</body>
</html>