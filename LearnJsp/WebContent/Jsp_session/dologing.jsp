<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String username = request.getParameter("userName"); 
String passwork = request.getParameter("passwork"); 
session.setAttribute("username", username); // 使用键值对存值
if(username !=null&&passwork!=null){
	response.setHeader("refresh","2;URL=Welcomejsp.jsp");
}
%>

</body>
</html>