package com.training.mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.mvc.model.Employee;

@WebServlet(name="fc",urlPatterns={"/fc"})
public class FrontControllerServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Employee> empList = new ArrayList<Employee>();
		
		for(int i=0;i<5;i++){
			Employee emp = new Employee();
			emp.setId(i+1);
			emp.setName("Name "+i);
			emp.setSal(30.0 * (i+1));
			empList.add(emp);
		}
		req.setAttribute("emplist", empList);
		RequestDispatcher rd = req.getRequestDispatcher("/emp.jsp");
		rd.forward(req, resp);
	}

}
