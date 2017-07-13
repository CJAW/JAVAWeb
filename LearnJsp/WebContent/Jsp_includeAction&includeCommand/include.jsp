<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>include动作与include指令</title>
</head>
<body>
<%@ include file="include.jsp" %>  //include指令包含一个jsp的页面，页面内容,发生在页面转换之间
<jsp:include page="include.jsp" flush="false"/>  //include动作包含一个jsp页面，页面输出，石否从缓冲读取，发生在请求期间
</body>
</html>