package com.training.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet {
	

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("redirect servlet doGet () called ");
		PrintWriter out = resp.getWriter();
		ServletContext context = getServletContext();
		String val = (String)context.getAttribute("contextone");
		System.out.println("value = "+val);
		resp.sendRedirect("http://www.yahoo.com");
		// this will send an HTTP code 302(redirect) + the url to redirect
		
	}

}
