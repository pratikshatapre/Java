package com.seed.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BankAccountServlet
 */
@WebServlet("/BankAccountServlet")
public class BankAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletResponse resopnse;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BankAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		do not create new session
       HttpSession session=request.getSession(false);
       
       if(session !=null) {
    	   response.getWriter().println("Your account balance is :25000");
    	   response.getWriter().println(session.getId());
    	   session.invalidate(); // clear the session data (sessionid also get deleted)//
       }else {
    	   response.getWriter().println("Unauthorised access please login to continue....");
       }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
