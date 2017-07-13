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

public class SelectStudentServlet extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		// 根据身份证查询
		String idMessage = req.getParameter("messageNumber");
		// 根据学号查询
		String numMessage = req.getParameter("studentNumber");

		Users users = new Users();
		HttpSession httpSession = req.getSession();

		if (numMessage != null && idMessage == null) {
			boolean isNumber = users.NumberCopy(numMessage);

			// 根据学号查询
			if (isNumber == true) {
				Map<Integer, Map<Integer, String>> map = users.SelectNumberByMessage(numMessage);
				RequestDispatcher dispatcher = req.getRequestDispatcher("/ReturnMessageJSP/SelectMessage.jsp");
				httpSession.setAttribute("list", map);
				dispatcher.forward(req, resp);
				return;
			}
			if (isNumber == false) {
				RequestDispatcher dispatcher = req.getRequestDispatcher("/ReturnMessageJSP/SelectError.jsp");
				req.setAttribute("selectMessage", "学号错误！或无信息！");
				dispatcher.forward(req, resp);
				return;
			}
		}
		// 根据身份证查询
		if (idMessage != null && numMessage == null) {
			boolean isMessage = users.messageCopy(idMessage);

			if (isMessage == true) {

				Map<Integer, Map<Integer, String>> map = users.SelectMessageByMessage(idMessage);
				RequestDispatcher dispatcher = req.getRequestDispatcher("/ReturnMessageJSP/SelectMessage.jsp");
				httpSession.setAttribute("list", map);
				dispatcher.forward(req, resp);
				return;
			}

			if (isMessage == false) {
				RequestDispatcher dispatcher = req.getRequestDispatcher("/ReturnMessageJSP/SelectError.jsp");
				req.setAttribute("selectMessage", "身份证错误！或无信息！");
				dispatcher.forward(req, resp);
				return;
			}
		}
	}
	
}
