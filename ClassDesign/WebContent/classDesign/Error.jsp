<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>错误页面</title>
</head>
<body>

<div align = "center">

<%=request.getAttribute("errorMessage") %>

</div>

<div align = "center">
<a href="<%=request.getContextPath() %>/classDesign/Login.jsp">登陆</a>
</div>


</body>
</html>