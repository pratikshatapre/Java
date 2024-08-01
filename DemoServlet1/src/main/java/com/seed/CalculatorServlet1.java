package com.seed;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet1
 */
@WebServlet("/CalculatorServlet1")
public class CalculatorServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Object result = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int a,b;
		String str="";
		try {
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

		}catch(NumberFormatException e) {
	
			request.setAttribute("result","result");
		}
		request.getRequestDispatcher("Calculator.jsp").forward(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		PrintWriter out=response.getWriter();
		int a,b;
		String str="";
		try {
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

		}catch(NumberFormatException e) {
	
			request.setAttribute("result","result");
		}
		request.getRequestDispatcher("Calculator.jsp").forward(request, response);
		
	}
}
