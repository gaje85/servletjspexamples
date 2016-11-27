package com.training.hello;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListenerImpl implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("context destroyed ");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("context initialized");
		
	}

}
