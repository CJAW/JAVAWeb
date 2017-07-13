<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<div align = "center">

<h1>欢迎使用！</h1>
</div>


<br>
<br>
<br>
<br>
<br>
<br>

<div align=left>
<a href="<%=request.getContextPath() %>/CloseSessionServlet">注销</a>
</div>


<br>
<br>
<br>
<div align="center">
<a href="<%=request.getContextPath() %>/classDesign/AddStudent.jsp">增加学生</a>
</div>
<br>
<br>
<br>

<div align="center">
<a href="<%=request.getContextPath() %>/classDesign/AlterStudent.jsp">修改学生信息</a>
</div>
<br>
<br>
<br>
<div align="center">
<a href="<%=request.getContextPath() %>/classDesign/DeleteStudent.jsp">删除学生信息</a>
</div>
<br>
<br>
<br>
<div align="center">
<a href="<%=request.getContextPath() %>/classDesign/SelectStudent.jsp">查询学生信息</a>
</div>



</body>
</html>