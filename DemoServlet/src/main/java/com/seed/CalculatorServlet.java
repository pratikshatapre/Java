package com.seed;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int a,b;
		String str="";
		a=Integer.parseInt(request.getParameter("num1"));
		b=Integer.parseInt(request.getParameter("num2"));
		str=request.getParameter("operation");
		if(str.equals("add")) 
			response.getWriter().println("<h1> Result of addition is:"+(a+b)+"<h1/>");
		else if(str.equals("sub"))
			response.getWriter().println("<h1> Result of substraction is:"+(a-b)+"<h1/>");
		else if(str.equals("mult"))
			response.getWriter().println("<h1> Result of multiplication is:"+(a*b)+"<h1/>");
		else if(str.equals("div"))
			response.getWriter().println("<h1> Result of divition is:"+(a/b)+"<h1/>");
		else
			
				response.getWriter().println("<h1> Result of modulus is:"+(a%b)+"<h1/>");
		
}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String num1=request.getParameter("num1");
//		String num2=request.getParameter("num2");
//		
//		Calculator c=new Calculator();
//		
//		int ans=c.add(Integer.parseInt(num1), Integer.parseInt(num2));
//		response.getWriter().println("Addition is:"+ ans);
	}

}
