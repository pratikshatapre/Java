package com.seed;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;


public class MyClass extends TagSupport {
	
	public int doStartTag() throws JspException{
		JspWriter out=pageContext.getOut();
		
		try {
			out.println("Hellow world from JSP custom tag");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return super.doStartTag();
		
	}
	
	

}
