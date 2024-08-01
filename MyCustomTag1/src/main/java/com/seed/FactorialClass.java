package com.seed;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class FactorialClass extends TagSupport { 
	
	private Integer num;
	
	
	
	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}


	@Override
	public int doStartTag() throws JspException {
		
		JspWriter out=pageContext.getOut();
		
		int ans=1;
		for(int i=num;i>0;i--) {
			ans=ans*i;
		}
		try {
			out.println("Factorial is:"+ans);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return super.doStartTag();
	}

}
