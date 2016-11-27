package com.training.customtaglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class OneTagHandler extends TagSupport {
	
	public OneTagHandler() {
	}
	@Override
	public int doStartTag() throws JspException {
		System.out.println("Do startTag");
		JspWriter out = pageContext.getOut();
		try {
			out.println("<h1>Welcome to JSP training</h1>");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Tag.EVAL_PAGE;
	}
	
	@Override
	public int doEndTag() throws JspException {
		System.out.println("Do endTag");
		return super.doEndTag();
	}
	
	@Override
	public int doAfterBody() throws JspException {
		System.out.println("Do after body");
		return super.doAfterBody();
	}

}
