<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<!--测试request的数据传递  -->
<body>
<%
//获取数据
String str = request.getParameter("username");
String passwork = request.getParameter("password");

//传输数据，键值对
request.setAttribute("userName", str);
request.setAttribute("passwork", passwork);

%>

<jsp:forward page="Welcome.jsp"></jsp:forward>
</body>
</html>