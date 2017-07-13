<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ page import="DAO.studentDAO" %>
<%@ page import="Shopping.student" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <p>你好！</p>
    <table>
    <%
      studentDAO student =new studentDAO();
      ArrayList<student> lists =student.getstudent();
      if(lists!=null){
       for(int i=0;i<lists.size();i++){
       student students =lists.get(i);
     %>
    <tr>
    <td><%=students.getId() %></td>
    <td><%=students.getNumber() %></td>
    <td><%=students.getMessage() %></td>
    <td><%=students.getSex() %></td>
    <td><%=students.getYears() %></td>
    <td><%=students.getEmail() %></td>
    <td><%=students.getName() %></td>
    <td><%=students.getSpecial() %></td>
    <td><%=students.getClass() %></td>
    </tr>
    <%
        }
     }
     %>
    </table>
  </body>
</html>

