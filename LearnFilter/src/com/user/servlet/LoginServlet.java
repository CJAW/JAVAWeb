package com.user.servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/**
 * 使用过滤器实现过滤器的权限访问，与编码的一致
 * @author user
 *
 */
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		if(req.getParameter("username").equals("111")&&req.getParameter("password").equals("111")){
			
			req.setAttribute("msg", "登陆成功");
			//使用请求转发实现页面跳转
			String forword ="/Servlet/index.jsp";
			
			RequestDispatcher requestDispatcher = req.getRequestDispatcher(forword);
			
			requestDispatcher.forward(req,resp);
			
			/*
			 * req.setAttribute("msg", "登陆成功")取不到值
			//跟request的作用域有关，request只在forward跳转的前后有效，你在servlet里面setattribute，
			 * 在login.jsp里面可以使用getattribute来取，但在inddex.jsp里面就不行了，
			 * 因为过期了。你可以在updat.jsp里面再setattribute一次。
			 * 可以使用隐藏域处理
			 * 
			 */
			req.getSession().setAttribute("flage","登陆成功");
			
			
			
			
		}else if(req.getParameter("username")==null&&req.getParameter("password")==null){
			req.setAttribute("msg", "登陆失败");
			//使用请求转发实现页面跳转
			String forword = "/Servlet/index.jsp";
			
			RequestDispatcher requestDispatcher = req.getRequestDispatcher(forword);
			
			requestDispatcher.forward(req, resp);
			
			req.getSession().setAttribute("flage","登陆失败");
			
			
		}
		
	}

	
	
}
