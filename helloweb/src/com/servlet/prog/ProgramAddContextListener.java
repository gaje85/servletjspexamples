package com.servlet.prog;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ProgramAddContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {

		ServletContext context = event.getServletContext();

		String simpleServletName = "simpleServlet";
		//String simpleFilterName = "simpleFilter";

		

		String[] urlPatterns = new String[] { "/simple" };

		context.addServlet(simpleServletName, "com.servlet.prog.DynamicServlet");

		
		//context.addFilter(simpleFilterName, "description for simple filter",

			//	"", initParams, false);

	}

	public void contextDestroyed(ServletContextEvent event) {

	}

}
