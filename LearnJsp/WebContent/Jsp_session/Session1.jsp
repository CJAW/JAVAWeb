<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!--使用session获取游览器的数据  -->
</head>
<body>
 id:<%session.getId(); %></br>
 time:<%new java.util.Date(session.getCreationTime());  %></br>
 lastTime:<%session.getLastAccessedTime(); %></br>
</body>
</html>