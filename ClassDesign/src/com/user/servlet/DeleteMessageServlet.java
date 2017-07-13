package com.user.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.jdbc.Users;

public class DeleteMessageServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		String numMessage = req.getParameter("num_message");
		//System.out.println(numMessage);
		Users users = new Users();
		boolean isDeleteNumber = users.DeleteMessage(numMessage);
		//System.out.println(isDeleteNumber);
		if(isDeleteNumber ==false){
			//请求转发服务器端行为，url改变
			RequestDispatcher dispatcher = req.getRequestDispatcher("/ReturnMessageJSP/DeleteSuccess.jsp");
			req.setAttribute("deleteMessage", "删除成功！");
			dispatcher.forward(req, resp);
		}
		
		
	}

}
