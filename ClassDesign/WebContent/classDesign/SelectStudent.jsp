<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">查询学生信息</h1>
<br>
<br>
<br>

<h3 align="center">按学号查询</h3>
<form action="<%=request.getContextPath()%>/SelectStudentServlet" method="post">
<table align="center">
<tr>
<td>学号：</td>
<td><input type="text" name = "studentNumber"></td>
</tr>
<tr>
<td><br></td>
<td><br></td>
</tr>
<tr align="right">
<td><input type="submit" value="submit"></td>
<td><input type="reset" value="reset"></td>
</tr>
</table>
</form>
<br>
<br>
<br>
<br>
<br>

<h3 align="center">按身份证查询</h3>
<form action="<%=request.getContextPath()%>/SelectStudentServlet" method="post">
<table align="center">
<tr>
<td>身份证号：</td>
<td><input type="text" name = "messageNumber"></td>
</tr>
<tr>
<td><br></td>
<td><br></td>
</tr>
<tr align="right">
<td><input type="submit" value="submit"></td>
<td><input type="reset" value="reset"></td>
</tr>
</table>
</form>
<br>
<br>
<br>
<br>
<br>
<br>

<h3 align="center">查询所有学生信息</h3>
<form action="<%=request.getContextPath()%>/SelectAllMessageServlet" method="post">
<table align="center">
<tr>
<td><br></td>
<td><br></td>
</tr>
<tr align="center">

<td><input type="submit" value="查询" ></td>
</tr>
</table>
</form>
<br>
<br>
<br>
<div align="left">

<a href="<%=request.getContextPath() %>/classDesign/Welcome.jsp">返回首页</a>

</div>
</body>
</html>