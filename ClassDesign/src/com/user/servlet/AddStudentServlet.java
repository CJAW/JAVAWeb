package com.user.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.jdbc.Users;


public class AddStudentServlet extends HttpServlet{
    String t_sex;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
		Users users = new Users();
		String name = req.getParameter("s_name");
	    String number=req.getParameter("s_number");
	    String message=req.getParameter("s_message");
	    String sex=req.getParameter("s_sex");
	    String email=req.getParameter("s_email");
	    String special=req.getParameter("s_special");
	    String year=req.getParameter("s_year");
	    String classes=req.getParameter("s_class");
		req.setCharacterEncoding("UTF-8");
		
		
		if(sex.equals("1")){
			t_sex = "男";
			
		}else  {
			t_sex = "女";
		}
		
		boolean result = users.insertStudentMessage(name, number, message, t_sex, email, special, year, classes);
		//System.out.println(result);
		
		//System.out.println(t_sex);
		if(result==false){
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/ReturnMessageJSP/Success.jsp");
			req.setAttribute("successMessage","录入信息成功！");
			dispatcher.forward(req,resp);
			return;
		}
	}

	
	
}
