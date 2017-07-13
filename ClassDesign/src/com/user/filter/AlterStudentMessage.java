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

import com.user.jdbc.Users;

/**
 * Servlet Filter implementation class AlterStudentMessage
 */
@WebFilter("/AlterStudentMessage")
public class AlterStudentMessage implements Filter {

    /**
     * Default constructor. 
     */
    public AlterStudentMessage() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		httpServletRequest.setCharacterEncoding("UTF-8");
		
		String name = httpServletRequest.getParameter("s_name");
	    String number=httpServletRequest.getParameter("s_number");
	    String message=httpServletRequest.getParameter("s_message");
	    String sex=httpServletRequest.getParameter("s_sex");
	    String email=httpServletRequest.getParameter("s_email");
	    String special=httpServletRequest.getParameter("s_special");
	    String year=httpServletRequest.getParameter("s_year");
	    String classes=httpServletRequest.getParameter("s_class");
	    
		//System.out.println(name+number+message+year+email+special+classes);
	    		
		
		if ((name!=null) && (number!=null) && (message!=null) && (sex!=null)
				&& (email!=null) && (special!=null) && (year!=null) && (classes!=null)) {

			chain.doFilter(request, response);
			return;
		}
		
	
		
		else if((name==null)){
			RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/ReturnMessageJSP/Error.jsp");
			httpServletRequest.setAttribute("alterError","学生姓名未填写！");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
			return;
		}
		
		else if(number==null){
			RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/ReturnMessageJSP/Error.jsp");
			httpServletRequest.setAttribute("alterError","学号未填写！");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
			return;
			
			
		}
		
		else if((message==null)){
			RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/ReturnMessageJSP/Error.jsp");
			httpServletRequest.setAttribute("alterError","身份证未填写！");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
			return;
			
			
		}
		
		
		else if((sex==null)){
			RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/ReturnMessageJSP/AlterError.jsp");
			httpServletRequest.setAttribute("alterError","姓别未填写！");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
			return;
			
			
		}
		
		else if((email==null)){
			RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/ReturnMessageJSP/AlterError.jsp");
			httpServletRequest.setAttribute("alterError","邮箱未填写！");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
			return;
			
			
		}
		
		else if((special==null)){
			RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/ReturnMessageJSP/AlterError.jsp");
			httpServletRequest.setAttribute("alterError","专业未填写！");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
			return;
			
			
		}
		 
		else if((year==null)){
			RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/ReturnMessageJSP/AlterError.jsp");
			httpServletRequest.setAttribute("alterError","年级未填写！");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
			return;
			
			
		}
		 
		else if((classes==null)){
			RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/ReturnMessageJSP/AlterError.jsp");
			httpServletRequest.setAttribute("alterError","班级未填写！");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
			return;
			
			
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
