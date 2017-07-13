<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- 测试response的响应头 -->
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cach");  //属性可以为private，public 。。。。
response.setIntHeader("Refresh",2);  //两秒自动刷新
out.print("data is :"+new java.util.Date().toString());
%>
</body>
</html>