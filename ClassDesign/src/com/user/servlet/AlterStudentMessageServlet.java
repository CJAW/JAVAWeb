package com.user.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.jdbc.Users;


public class AlterStudentMessageServlet extends HttpServlet{

	String t_sex;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		Users users = new Users();
		
		//修改后的数据
		String name = req.getParameter("s_name");
	    String number=req.getParameter("s_number");
	    String message=req.getParameter("s_message");
	    String sex=req.getParameter("s_sex");
	    String email=req.getParameter("s_email");
	    String special=req.getParameter("s_special");
	    String year=req.getParameter("s_year");
	    String classes=req.getParameter("s_class");
		req.setCharacterEncoding("UTF-8");
		
		String oldNumber = req.getParameter("oldNumber");
	  
		//System.out.println(oldNumber);
		
		if(sex.equals("1")){
			t_sex = "男";
			
		}else  {
			t_sex = "女";
		}
		
			boolean isUpDate = users.UpDateMessage(name, number, message, t_sex, email, special, year, classes,oldNumber);
			 //System.out.println(isUpDate);
			if (isUpDate == false) {

				//请求转发服务器端行为，url改变
				RequestDispatcher dispatcher = req.getRequestDispatcher("/ReturnMessageJSP/AlterSuccess.jsp");
				req.setAttribute("alterMessage", "修改成功！");
				dispatcher.forward(req, resp);
				return;
			}
		
	}

}
