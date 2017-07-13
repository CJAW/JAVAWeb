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

public class SelectAllMessageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
		req.setCharacterEncoding("UTF-8");
		Users users = new Users();
		HttpSession httpSession = req.getSession();
		
		Map<Integer, Map<Integer,String>> map = users.SelectAllMessage();
		
		//System.out.println(map.size());
			RequestDispatcher dispatcher = req.getRequestDispatcher("/ReturnMessageJSP/SelectMessage.jsp");
			httpSession.setAttribute("list",map);
		    dispatcher.forward(req,resp);
		     return;
		
	}

}
