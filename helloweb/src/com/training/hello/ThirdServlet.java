package com.training.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
	

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Third servlet doPost () called ");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Third servlet ...</h1>");
		String data = (String)req.getAttribute("onekey");
		out.println("<h1>"+data+"</h1>");
	}

}
