package com.seed.demo;

import java.io.IOException;
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
		
		if(user.equals("admin") && pass.equals("admin")) {
//			true means create new session
			HttpSession session=request.getSession(true); 
			
			response.sendRedirect("BankAccountServlet");
		}else {
		response.getWriter().println("incorrect uername/password");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		if(user.equals("admin") && pass.equals("admin")) {
//			true means create new session
			HttpSession session=request.getSession(true);   
			response.sendRedirect("BankAccountServlet");
		}else {
		response.getWriter().println("incorrect username/password");
		}
		
	}

}
