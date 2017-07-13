<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<!-- 测试application的属性可以共享全局的信息-->
<body>
获取服务器信息：<%=application.getServerInfo()%><br/>
获得主机:<%=application.getVirtualServerName() %><br/>
获得信息：<%=application.getContextPath() %>
</body>
</html>