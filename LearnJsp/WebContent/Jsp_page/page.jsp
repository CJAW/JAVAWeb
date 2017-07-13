<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<!--测试page的属性  -->
<body>
<%=page.getClass()%><br/> <!--//返回类对象的类  -->
<%=page.hashCode() %><br/>  <!--  //返回配置对象的hash值-->
<%=page.toString() %><br/>  <!--//返回配置文件-->

</body>
</html>