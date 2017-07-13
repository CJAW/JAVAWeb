package com.user.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.jdbc.Users;

public class LoginServlet extends HttpServlet{


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession httpSession = req.getSession();
		String name = (String) httpSession.getAttribute("num");
		String pd = (String) httpSession.getAttribute("pd");
		req.setCharacterEncoding("UTF-8");
		Users users = new Users();
		java.util.Map<String, String> map = users.getLogin(name);
		
		String username =map.get("username");
		String password = map.get("password");
	
		
		if(name.equals(username)&&pd.equals(password)){
			//请求转发，服务器端
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/classDesign/Welcome.jsp");
			requestDispatcher.forward(req, resp);
			return;
		}
		
		if(!(name.equals(username))&&!(pd.equals(password))){
			//请求转发，服务器端
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/classDesign/Error.jsp");
			req.setAttribute("errorMessage","用户名和密码错误！");
			requestDispatcher.forward(req, resp);
			return;
		}
		
		if(name.equals(username)&&!(pd.equals(password))){
			
			//请求转发，服务器端
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/classDesign/Error.jsp");
			req.setAttribute("errorMessage","密码错误！");
			requestDispatcher.forward(req, resp);
			return;
		}
		
	if(!(name.equals(username))&&pd.equals(password)){
			
			//请求转发，服务器端
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/classDesign/Error.jsp");
			req.setAttribute("errorMessage","用户名错误！");
			requestDispatcher.forward(req, resp);
			return;
		}
		
	}

	
	
}
