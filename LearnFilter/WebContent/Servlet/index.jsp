<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

登陆信息的状态：<%=request.getAttribute("msg") %>
用户名：<%=request.getParameter("username") %>
密码：<%=request.getParameter("password") %>

登陆信息：<%=request.getSession().getAttribute("flage") %>

<a href="<%=request.getContextPath()%>Login.jsp">返回</a>
</body>
</html>