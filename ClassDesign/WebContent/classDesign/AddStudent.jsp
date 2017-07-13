<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">添加学生信息</h1>

<form action="<%=request.getContextPath() %>/AddStudentServlet" method="post">

<table align="center">


<tr>
<td>学生姓名:</td>
<td><input type="text" name="s_name"></td>
</tr>

<tr>
<td>学号:</td>
<td><input type="text" name="s_number"></td>
</tr>

<tr>
<td>身份证号:</td>
<td><input type="text" name="s_message"></td>
</tr>


<tr>
<td>性别:</td>
<td><input type="Radio" name="s_sex" value="1">男   <input type="Radio" name="s_sex" value="0">女</td>
</tr>

<tr>
<td>邮箱:</td>
<td><input type="text" name="s_email" ></td>
</tr>

<tr>
<td>专业:</td>
<td><select name="s_special" size=1>
<option selected>软件工程</option>
<option>电子</option>
<option>游戏</option>
<option>外语</option>
</select></td>
</tr>

<tr>
<td>年级:</td>
<td><input type="text" name="s_year" ></td>
</tr>

<tr>
<td>班级:</td>
<td><input type="text" name="s_class" ></td>
</tr>


<tr>
<td><br><br></td>
<td></td>
</tr>

<tr align="right">
<td><input type="submit" name="s_submit"></td>
<td><input type="reset" name="s_reset"></td>
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