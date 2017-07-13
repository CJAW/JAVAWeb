<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>使用parmeter动作，与forward一起使用,进行值的传递</title>
</head>
<body>

<jsp:forward page="parmeter.jsp">
<jsp:param value="xxx" name="username"/>
</jsp:forward>


<%=request.getParameter("username") %>
</body>
</html>