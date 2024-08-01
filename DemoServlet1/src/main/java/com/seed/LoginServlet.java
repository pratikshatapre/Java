package com.seed;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		response.getWriter().println(" LoginServlet Username:"+user+",pass:"+pass);
		
//		response.sendRedirect("WelcomeServlet");
		
//		request.getRequestDispatcher("WelcomeServlet").forward(request, response);
		
		request.getRequestDispatcher("WelcomeServlet").include(request, response);
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		response.getWriter().println(" LoginServlet Username:"+user+",pass:"+pass);
		
//          response.sendRedirect("WelcomeServlet");
		
//		request.getRequestDispatcher("WelcomeServlet").forward(request, response);
		
		request.getRequestDispatcher("WelcomeServlet").include(request, response);
		
		

	}

}
