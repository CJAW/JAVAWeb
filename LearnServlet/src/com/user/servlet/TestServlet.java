package com.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 测试servlet
 * 要在wen.xml文件中进行注册（包含名字，路径，访问的类）
 * init方法在启动servlet的时候使用
 * 访问java文件直接在游览器输入地址＋web.xml中的servlet－name      例如：localhost:8080/LearnServlet/Hello
 * @author user
 *
 */
public class TestServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		super.init();
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		super.init(config);
	}
	

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse arg1) throws ServletException, IOException {
//	
//		PrintWriter pw =arg1.getWriter();
//		pw.print("hello word");
//		pw.close();
//		
//	}

	@Override
	public void destroy() {
	
		super.destroy();
	}


}
