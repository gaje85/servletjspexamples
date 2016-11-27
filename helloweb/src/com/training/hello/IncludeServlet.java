package com.training.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IncludeServlet extends HttpServlet {
	

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Include servlet doPost () called ");
		PrintWriter out = resp.getWriter();
		
		RequestDispatcher rd = req.getRequestDispatcher("/header");
		rd.include(req, resp);
		out.println("<h1>Include servlet ...</h1>");
		RequestDispatcher rdfooter = req.getRequestDispatcher("/footer");
		rdfooter.include(req, resp);
		
	}

}
