<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



<% 
   HttpSession httpSession = request.getSession();
   Map<Integer,String> map =(Map<Integer,String>) httpSession.getAttribute("studentMsaasge");
%>


<h1 align="center">修改学生信息</h1>

<form action="<%=request.getContextPath() %>/AlterStudentMessageServlet" method="post">
<input type="hidden" name="oldNumber" value=<%=map.get(2) %>>
<table align="center">


<tr>
<td>学生姓名:</td>
<td><input type="text" name="s_name" value=<%=map.get(1) %>></td>
</tr>

<tr>
<td>学号:</td>
<td><input type="text" name="s_number" value=<%=map.get(2) %>></td>
</tr>

<tr>
<td>身份证号:</td>
<td><input type="text" name="s_message"value=<%=map.get(3) %>></td>
</tr>


<tr>
<td>性别:</td>
<td><input type="Radio" name="s_sex" value="1">男   <input type="Radio" name="s_sex" value="0">女</td>
</tr>

<tr>
<td>邮箱:</td>
<td><input type="text" name="s_email" value=<%=map.get(5) %>></td>
</tr>

<tr>
<td>专业:</td>
<td><select name="s_special" size=1 >>
<option selected>软件工程</option>
<option>电子</option>
<option>游戏</option>
<option>外语</option>
</select></td>
</tr>

<tr>
<td>年级:</td>
<td><input type="text" name="s_year" value=<%=map.get(7) %>></td>
</tr>

<tr>
<td>班级:</td>
<td><input type="text" name="s_class" value=<%=map.get(8) %>></td>
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

<a href="<%=request.getContextPath() %>/ReturnMessageJSP/AlterMessage.jsp">返回</a>

</div>
</body>
</html>