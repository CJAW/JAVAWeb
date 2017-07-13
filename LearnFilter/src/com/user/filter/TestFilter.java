package com.user.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import sun.java2d.opengl.CGLGraphicsConfig;

/**
 * Servlet Filter implementation class TestFilter
 * filter的init方法在启动服务器的时候调用
 * 也要在web.xml中进行注册
 */

public class TestFilter implements Filter {

    /**
     * Default constructor. 
     */
    public TestFilter() {
    	
    System.out.println("=========构造方法========");
        
    }
    
/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("=========init========");
		
		String name= null;
		name = fConfig.getInitParameter("username");    //获取web.xml中的值，也是键值对
		System.out.println(name);
	}
	
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		chain.doFilter(request, response);
		
		System.out.println("=========doFilter========");
	}

	
/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		
		System.out.println("=========destroy========");
	}

}
