package com.training.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("second servlet doPost () called ");
		PrintWriter out = resp.getWriter();
		out.println("second servlet ...");
		RequestDispatcher rd = req.getRequestDispatcher("/third");
		rd.forward(req, resp);
		
	}

}
