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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.jdbc.Users;


@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

	
    
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		httpServletRequest.setCharacterEncoding("UTF-8");
		
		String url = httpServletRequest.getServletPath();
		
		//System.out.println(url);
		
		//HttpSession httpSession = httpServletRequest.getSession(); //获得会话
		
		String num = (String) httpServletRequest.getParameter("username");
		
		String pd = (String) httpServletRequest.getParameter("password");
		
		Cookie cookie = new Cookie("cookie", num);
		cookie.setMaxAge(1000*60*60*24*3);
		
		//System.out.println(num +"   "+pd);
		
		 if(url.equals("/LoginServlet")&&!(url.equals(""))&&!(num.equals(""))||!(pd.equals(""))) {
				
			    httpServletRequest.getSession().setAttribute("num",num);
				httpServletRequest.getSession().setAttribute("pd",pd);
				chain.doFilter(httpServletRequest, httpServletResponse);
				return;
			}
		
		
		
		  		
		 if(url.equals("/LoginServlet")&&!(url.equals(""))&&(num.equals(""))||(pd.equals(""))) {
			
			RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/classDesign/Login.jsp");
			
			httpServletRequest.setAttribute("loginMessage","帐号或密码为空！");
			
			requestDispatcher.forward(httpServletRequest,httpServletResponse);
			
			return;
		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
