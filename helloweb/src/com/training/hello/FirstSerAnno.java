package com.training.hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="firanno",urlPatterns="/fanno")
public class FirstSerAnno extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("Anno init ()");
	}

	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Anno doGet () called ");
		PrintWriter out = resp.getWriter();
		out.println("<h1> Welcome Anno to Servlet Hello World "+new Date()+"</h1>");
	}
}
