package com.user.filter;


/**
 * 注册的过滤
 */

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

import com.user.jdbc.Users;

/**
 * Servlet Filter implementation class RegisterFilter
 */
@WebFilter("/RegisterFilter")
public class RegisterFilter implements Filter {

   
	
	public void destroy() {
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		httpServletRequest.setCharacterEncoding("UTF-8");
		String r_name = httpServletRequest.getParameter("r_username");
		String r_pd = httpServletRequest.getParameter("r_password");
		String r_tn = httpServletRequest.getParameter("r_turename");
		String r_em = httpServletRequest.getParameter("r_email");
		String r_te = httpServletRequest.getParameter("r_telephone");
		Users users = new Users();
		boolean iscopy = users.Copy(r_name);
		
		HttpSession httpSession = httpServletRequest.getSession();
		
		 Pattern p = Pattern.compile(
					"^(13[4,5,6,7,8,9]|15[0,8,9,1,7]|188|187)\\d{8}$"); // 创建正则表达式
			Matcher m = p.matcher(r_te);//匹配数据

			boolean isture = m.matches();
		
		if(!(r_name.equals(""))&&!(r_pd.equals(""))&&!(r_tn.equals(""))&&!(r_em.equals(""))&&!(r_te.equals(""))&&iscopy==false&&isture==true){
			
			chain.doFilter(request, response);
			return;
		}
		
		
		 if(iscopy ==true){
			 RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/classDesign/Register.jsp");
			 httpSession.setAttribute("registerMessage","用户名已被注册！");
				requestDispatcher.forward(httpServletRequest, httpServletResponse);
				return;
		}
		
		
		else if(r_name.equals("")){
			RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/classDesign/Register.jsp");
			httpSession.setAttribute("registerMessage","用户名未填写！");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
			return;
		}
		
		else if(r_pd.equals("")){
			RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/classDesign/Register.jsp");
			httpSession.setAttribute("registerMessage","密码未填写！");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
			return;
			
			
		}
		
		else if(r_tn.equals("")){
			RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/classDesign/Register.jsp");
			httpSession.setAttribute("registerMessage","真实姓名未填写！");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
			return;
			
			
		}
		
		
		else if(r_em.equals("")){
			RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/classDesign/Register.jsp");
			httpSession.setAttribute("registerMessage","邮箱名未填写！");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
			return;
			
			
		}
		
		 
		else if(r_te.equals("")){
			RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/classDesign/Register.jsp");
			httpSession.setAttribute("registerMessage","电话未填写！");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
			return;
			
			
		}
		 
		else if(isture==false){
			RequestDispatcher requestDispatcher = httpServletRequest.getRequestDispatcher("/classDesign/Register.jsp");
			httpSession.setAttribute("registerMessage","电话错误！");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
			return;
			
		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
