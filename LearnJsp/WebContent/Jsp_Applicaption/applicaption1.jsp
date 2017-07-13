<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!--applicaption的纪录游览器的访问次数  -->
</head>
<body>
<% 
     Object obj = application.getAttribute("counter");  //获取全局信息
     
     if(obj == null){
    	 application.setAttribute("counter", new Integer(1));//纪录信息，键值对
    	out.print( "游览器被访问了1次；");
     }else{
    	 int currint = Integer.parseInt(obj.toString()); //object转换为int
    	 currint++;
         out.print( "游览器被访问了"+currint+"次；");
         
    	 application.setAttribute("counter", currint);//纪录信息
     }


%>



</body>
</html>