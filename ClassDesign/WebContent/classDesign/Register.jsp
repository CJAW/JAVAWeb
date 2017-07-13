<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
<h1 align="center">欢迎注册</h1>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<form action ="<%=request.getContextPath() %>/RegisterServelt" method="post">
<table align="center"> 

<tr>
<td> 用户名：</td>
<td><input type="text" name="r_username"></td>
</tr>

<tr>
<td> 密码：</td>
<td><input type="password" name="r_password"></td>
</tr>

<tr>
<td> 真实姓名：</td>
<td><input type="text" name="r_turename"></td>
</tr>

<tr>
<td> E-mail：</td>
<td><input type="text" name="r_email"></td>
</tr>

<tr>
<td> 电话：</td>
<td><input type="text" name="r_telephone"></td>
</tr>

<tr>
<td> 地址：</td>
<td><input type="text" name="r_address"></td>
</tr>

<tr>
<td> <br></td>
<td><br></td>
</tr>
<tr>
<td> <br></td>
<td><br></td>
</tr>
<%String newmessage="详细填写内容"; %>
<%String message = (String)session.getAttribute("registerMessage"); %>

<tr align="center">
<td></td>
<%if(message==null){ %>
<td> <%=newmessage%></td>
<%}else {%>
<td> <%=message%></td>
<% }%>
</tr>

<tr>
<td> <br></td>
<td><br></td>
</tr>

<tr>
<td> <input type="submit" name="r_submit"></td>
<td><input type="reset" name="r_reset"></td>
</tr>
</table>
</form>
<br>
<br>
<br>

</body>
</html>