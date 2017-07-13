package com.user.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.javafx.scene.layout.region.RepeatStruct;

//测试doget和dopost方法
//使用servlet获取登陆的信息
//使用request的键值对获取
//实现页面的跳转
//重写了httpservlet的doget方法后不能在继承父类的doget方法，否者会造成respone的多次响应，http协议只能响应一次，就会出现url和respone的错误


public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//				super.service(request, response);
//				String name = (String) request.getParameter("username");
//				String password = (String) request.getParameter("password");
//				
//				System.out.println("========"+name+"=======");
//				System.out.println("========"+password+"=======");
//					
//	}
	
	
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//				super.doPost(req, resp);
//				
//				String name = (String) req.getParameter("username");
//				
//				String password  = (String) req.getParameter("password");
//				
//				System.out.println("－－－－－－－是doPost－－－－－");
//				System.out.println("------------"+name+"----------");
//				System.out.println("------------"+password+"----------");
//				
//	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
				//super.doGet(req,resp)  //重写了httpservlet的doget方法后不能在继承父类的doget方法，否者会造成respone的多次响应，http协议只能响应一次，就会出现url和respone的错误
		
				String name= req.getParameter("username");
			    String password = req.getParameter("password");
				System.out.println(name+"======"+password);
			
			if( req.getParameter("username").equals("111")){ 
				
				//跳转页面，使用了请求重定向的页面跳转，可以跳转到不同的应用，客户端
				//resp.sendRedirect(req.getContextPath()+"/ServletLogin/Success.jsp"); 
				
			
				//跳转页面，使用了请求转发的页面跳转，不可以跳转到不同的应用，服务器端
				String forward = "/ServletLogin/Success.jsp";
				RequestDispatcher requestDispatcher =req.getRequestDispatcher(forward);
				requestDispatcher.forward(req, resp);
				
		}else{
			
			//跳转页面，使用了请求重定向的页面跳转，可以跳转到不同的应用，客户端
			//resp.sendRedirect(req.getContextPath()+"/ServletLogin/Error.jsp");
			
			
			
			//跳转页面，使用了请求转发的页面跳转，不可以跳转到不同的应用,服务器端
			String forward = "/ServletLogin/Error.jsp";
			RequestDispatcher requestDispatcher =req.getRequestDispatcher(forward);
			requestDispatcher.forward(req, resp);
		}
	}



}
