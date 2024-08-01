package com.seed;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String uname=request.getParameter("username");
		String email=request.getParameter("email");
		String pass=request.getParameter("password");
		String gender=request.getParameter("gender");
		String city=request.getParameter("city");

		try {
			PrintWriter out=response.getWriter();
			Class.forName("oracle.jdbc.driver.OracleDriver");
	  	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
	  	
		PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
		ps.setString(1, uname);
		ps.setString(2, email);
		ps.setString(3, pass);
		ps.setString(4, gender);
		ps.setString(5, city);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
			rd.forward(request, response);
		}else {
			System.out.println("<font color=red size=12> Login Failed!!!!<br>");
			System.out.println("<a href=Register.html>Try AGAIN!!");
			
		}
		
		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
