package com.user.filter;

import java.io.IOException;


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * 对jsp页面进行权限验证，防止未登陆进行操作
**/

/**
 * Servlet Filter implementation class Jurisdiction
 */
@WebFilter("/Jurisdiction")
public class JurisdictionFilter implements Filter {

    /**
     * Default constructor. 
     */
    public JurisdictionFilter() {
       
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		String Url = httpServletRequest.getServletPath();
		httpServletRequest.setCharacterEncoding("UTF-8");
		
		HttpSession session = httpServletRequest.getSession();
		String name = (String) session.getAttribute("num");
		//System.out.println(name);
		
		//System.out.println(Url);
		
		if (Url.equals("classDesign/Login.jsp") || Url.equals("classDesign/Register.jsp")
				|| Url.equals("classDesign/Error.jsp")) {
			chain.doFilter(httpServletRequest, httpServletResponse);
			return;
		}

		
		if (name !=null) {
			chain.doFilter(httpServletRequest, httpServletResponse);
			return;
		}

		else if (name==null) {

			RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/classDesign/Error.jsp");

			httpServletRequest.setAttribute("errorMessage", "没有访问权限！");

			requestDispatcher.forward(httpServletRequest, httpServletResponse);

			return;
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
