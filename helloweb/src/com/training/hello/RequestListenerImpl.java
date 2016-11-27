package com.training.hello;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class RequestListenerImpl implements ServletRequestAttributeListener{

	@Override
	public void attributeAdded(ServletRequestAttributeEvent event) {
		System.out.println("Att added "+event.getName());
		System.out.println("Att added "+event.getSource());
		System.out.println("Att added "+event.getValue());
		
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		
	}

}
