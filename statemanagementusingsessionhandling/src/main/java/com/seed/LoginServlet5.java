package com.seed;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoginServletJsp
 */
@WebServlet("/LoginServlet5")
public class LoginServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		
		if(user.equals("admin") && pass.equals("admin")) {
			
		
           request.setAttribute("message", "Successfully logged in!!!!!!!!");
			
		}else {
	        request.setAttribute("message", "Incorrect username or password");
		}
		request.getRequestDispatcher("Login.jsp").forward(request,response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		
		if(user.equals("admin") && pass.equals("admin")) {
			
		
           request.setAttribute("message", "Successfully logged in!!!!!!!!");
			
		}else {
	        request.setAttribute("message", "Incorrect username or password");
		}
		request.getRequestDispatcher("Login.jsp").forward(request,response);

		
	}
}


