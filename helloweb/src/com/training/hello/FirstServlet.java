package com.training.hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init ()");
		String jdbcDriver = config.getInitParameter("jdbcdriver");
		System.out.println("JDBC Driver = "+jdbcDriver);
	}

	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet () called ");
		PrintWriter out = resp.getWriter();
		out.println("<h1> Welcome to Servlet Hello World "+new Date()+"</h1>");
		out.println("<h1>"+req+" , "+resp+"</h1>");
		String name = req.getParameter("nam");
		String age = req.getParameter("age");
		out.println("<h1> name  = "+name+" age = "+age+"</h1>");
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost () called ");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("nam");
		String age = req.getParameter("age");
		out.println("<h1> POST name  = "+name+" POST 1age = "+age+"</h1>");
		Enumeration<String> nameEnumeration = req.getHeaderNames();
		while(nameEnumeration.hasMoreElements()){
			String headerName = nameEnumeration.nextElement();
			Enumeration<String> valueEnumeration = req.getHeaders(headerName);
			while(valueEnumeration.hasMoreElements()){
				String value = valueEnumeration.nextElement();
				out.println("<h1>"+headerName+" = "+value+"</h1>");
			}
		}
		HttpSession session = req.getSession(true);
		session.setAttribute("sessone", "This is Session data");
		Cookie cookie = new Cookie("onecookie",URLEncoder.encode("This is a cookie"));
		cookie.setMaxAge(600);
		resp.addCookie(cookie); 
		req.setAttribute("onekey", "This is from firstservlet");
		
		ServletContext context = getServletContext();
		context.setAttribute("contextone", "This is context value");
		
		RequestDispatcher rd = req.getRequestDispatcher("/sec");
		rd.forward(req, resp);
		
		
	}
	
}
