package com.training.customtaglib;

import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

public class TableTagHandler extends TagSupport {

	List<Employee> data;
	String border;
	String cellspacing;
	String cellpadding;

	
	public String getBorder() {
		return border;
	}

	public void setBorder(String border) {
		this.border = border;
	}

	public String getCellspacing() {
		return cellspacing;
	}

	public void setCellspacing(String cellspacing) {
		this.cellspacing = cellspacing;
	}

	public String getCellpadding() {
		return cellpadding;
	}

	public void setCellpadding(String cellpadding) {
		this.cellpadding = cellpadding;
	}

	public List<Employee> getData() {
		return data;
	}

	public void setData(List<Employee> list) {
		this.data = list;
	}

	public TableTagHandler() {

	}

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.println("<table border="+border+" cellspacing="+cellspacing+" cellpadding="+cellpadding+">");
			for (Employee emp : data) {

				out.println("<tr><td>" + emp.getId() + "</td><td>" + emp.getName() + "</td><td>" + emp.getSal()
						+ "</td></tr> ");

			}
			out.println("</table>");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Tag.EVAL_PAGE;
	}
	
	public static int length(String str){
		return str.length();
	}

}
