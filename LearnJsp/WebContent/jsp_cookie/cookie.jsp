<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>使用cookie技术保存不重要的技术信息,cookie的信息保存在本地</title>
</head>
<body>

<%

Cookie cookie = new Cookie("message","message");   //创建cookie，使用键值对保存
response.addCookie(cookie);  //添加cookie
cookie.setMaxAge(40000); //设置cookie的有效时间
Cookie[] cookies = request.getCookies();//获取cookie
for(Cookie c :cookies){
	c.getValue();
}

%>

</body>
</html>