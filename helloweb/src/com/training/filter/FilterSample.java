package com.training.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterSample implements Filter{

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse reqt, FilterChain fc)
			throws IOException, ServletException {
		System.out.println("Before servlet");
		fc.doFilter(req, reqt);
		System.out.println("After Servlet");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("filter init");
		
	}

}
