package com.user.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class CloseSessionServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		req.setCharacterEncoding("UTF-8");
		doPost(req, resp);
		HttpSession httpSession = req.getSession();
		if(httpSession.getAttribute("num")!=null){
			httpSession.removeAttribute("num");
			httpSession.removeAttribute("pd");
		    RequestDispatcher dispatcher = req.getRequestDispatcher("/classDesign/Login.jsp");
		    dispatcher.forward(req,resp);
		    return;
		}
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	

}
