<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">修改学生信息</h1>
<br>
<br>
<br>
<h3 align="center">按学号修改</h3>
<form action="<%=request.getContextPath()%>/AlterStudentServlet" method="post">
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
<h3 align="center">修改学生信息</h3>
<form action="<%=request.getContextPath()%>/AlterStudentServlet" method="post">
<table align="center">
<tr>
<td><br></td>
<td><br></td>
</tr>
<tr align="right">
<td><input type="submit" value="修改" ></td>
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