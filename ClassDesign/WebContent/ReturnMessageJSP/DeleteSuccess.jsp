<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1><%=request.getAttribute("deleteMessage") %></h1>
</div>

<div align="left">

<a href="<%=request.getContextPath() %>/classDesign/DeleteStudent.jsp">返回</a>

</div>
</body>
</html>