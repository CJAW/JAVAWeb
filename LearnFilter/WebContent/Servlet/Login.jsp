<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action ="<%=request.getContextPath() %>/loginServlet" method = "GET">
<%if(request.getAttribute("msg")!=null){%>
<input type ="hidden" name="msg" value="<%=request.getAttribute("msg") %>" /> <!-- 隐藏域 -->

<% }%>

user:<input type="text" name = "username" >
password:<input type ="password" name ="password">
<input type="submit" value="log">
<input type="reset" value="reset">
</form>
</body>
</html>