<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--使用response存储cookie  -->
<%
    Cookie c = new Cookie("key","username"); //创建cookie
    c.setMaxAge(3600);
    response.addCookie(c);  //使用response存储cookie

%>
</body>
</html>