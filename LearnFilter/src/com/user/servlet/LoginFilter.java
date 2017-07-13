package com.user.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * 返回首页的过滤器,通过键值对的形式判断
 * @author user
 *
 */

public class LoginFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public LoginFilter() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;

		HttpServletResponse httpServletResponse = (HttpServletResponse) response;

		// 获得地址
		String servletPath = httpServletRequest.getServletPath();

		// 获得会话
		HttpSession httpSession = httpServletRequest.getSession();
		
		String flage = (String) httpSession.getAttribute("flage");

		// 对所有的页面进行权限的验证
		if (servletPath != null && servletPath.equals("/Servlet/Login.jsp") || servletPath.equals("LoginServlet")
				 || servletPath.equals("/Servlet/index.jsp")) {

			chain.doFilter(httpServletRequest, httpServletResponse);
			
		}else if(httpSession.toString()!=null&&flage.equals("登陆成功")){
			
			
				chain.doFilter(request, response);
				
				//验证失败
			}else if(httpSession.toString()!=null&&flage.equals("登陆失败")){
				
			
				RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/Servlet/Login.jsp");
				
				requestDispatcher.forward(httpServletRequest, httpServletResponse);
			}else{
				
				
				RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/Servlet/Login.jsp");
				
				httpServletRequest.setAttribute("msg", "未登录");
				
				requestDispatcher.forward(httpServletRequest, httpServletResponse);
				
			
			}
			
		}

	

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
