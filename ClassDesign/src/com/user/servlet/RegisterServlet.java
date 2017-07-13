package com.user.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 注册信息的验证
 */
import org.apache.catalina.User;

import com.user.jdbc.Users;

public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String r_name = req.getParameter("r_username");
		String r_password = req.getParameter("r_password");
		String r_truename = req.getParameter("r_turename");
		String r_email = req.getParameter("r_email");
		String r_telephone = req.getParameter("r_telephone");
		String r_address = req.getParameter("r_address");
		
		//System.out.println(r_name+r_password+r_truename+r_email+r_telephone+r_address);
	
		req.setCharacterEncoding("UTF-8");
		Users users = new Users();
		
		boolean result = users.insertMessage(r_name, r_password, r_truename, r_email, r_telephone, r_address);
		
		//System.out.println(result);
		//System.out.println(result);
		if(result == false){
			//请求转发，服务器端的行为。
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/classDesign/Login.jsp");
		req.setAttribute("registerMessage","success");
		requestDispatcher.forward(req, resp);
		return;
		
		}
		
		
		
		
		
	}
	
	
	

}
