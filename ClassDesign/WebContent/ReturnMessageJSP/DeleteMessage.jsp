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
<h1 align="center">删除信息</h1>


<% 
   HttpSession httpSession = request.getSession();
   Map<Integer,Map<Integer,String>> map =(Map<Integer,Map<Integer,String>>) httpSession.getAttribute("list");
%>


<table align = "center" border="1" width="100%">
<tr>
<td>学生姓名</td>
<td>学号</td>
<td>身份证号</td>
<td>性别</td>
<td>邮箱</td>
<td>专业</td>
<td>年级</td>
<td>班级</td>
<tr>


<%for(int i=1;i<map.size()+1;i++){%>
<tr>	
<%for(int b=1;b<map.get(i).size()+1;b++){ %>
	<td>
	<%=map.get(i).get(b) %>
	</td>
<% }%>
<td>
<form action="<%=request.getContextPath() %>/DeleteMessageServlet" method="post">
<input type = "hidden" name="num_message" value="<%=map.get(i).get(2)%>">
<input type = "submit" value="删除">
</form>
</td>
</tr>
<%}%>


</table>


<div align="left">

<a href="<%=request.getContextPath() %>/classDesign/DeleteStudent.jsp">返回</a>

</div>
</body>


</html>