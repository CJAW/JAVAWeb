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

public class DeleteStudentServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		
		req.setCharacterEncoding("UTF-8");
		// 根据身份证查询
		String idMessage = req.getParameter("messageNumber");
		// 根据学号查询
		String numMessage = req.getParameter("studentNumber");

		Users users = new Users();
		HttpSession httpSession = req.getSession();
		

		if(idMessage==null&&numMessage==null){
			Map<Integer, Map<Integer,String>> map = users.SelectAllMessage();
		
		//System.out.println(map.size());
			RequestDispatcher dispatcher = req.getRequestDispatcher("/ReturnMessageJSP/DeleteMessage.jsp");
			httpSession.setAttribute("list",map);
		    dispatcher.forward(req,resp);
		     return;
		}

	
		if (numMessage != null && idMessage == null) {
			boolean isNumber = users.NumberCopy(numMessage);

			// 根据学号查询
			if (isNumber == true) {
				Map<Integer, Map<Integer, String>> map = users.SelectNumberByMessage(numMessage);
				RequestDispatcher dispatcher = req.getRequestDispatcher("/ReturnMessageJSP/DeleteMessage.jsp");
				httpSession.setAttribute("list", map);
				dispatcher.forward(req, resp);
				return;
			}
			if (isNumber == false) {
				RequestDispatcher dispatcher = req.getRequestDispatcher("/ReturnMessageJSP/DeleteError.jsp");
				req.setAttribute("deleteMessage", "学号错误！或无信息！");
				dispatcher.forward(req, resp);
				return;
			}
		}
		
	
	}

	
	
}
