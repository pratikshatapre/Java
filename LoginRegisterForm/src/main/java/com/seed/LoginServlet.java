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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String uname = request.getParameter("username");
//		String pass = request.getParameter("password");
//		try {
//			PrintWriter out = response.getWriter();
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
//
//			PreparedStatement ps = con.prepareStatement("select password from login where username=?");
//			ps.setString(1, uname);
//
//			ResultSet rs = ps.executeQuery();
//			while (rs.next()) {
//				if (rs.getString("password").equals(pass)) {
//					RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
//					rd.forward(request, response);
//				} else {
//					out.println("<font color=red size=12> Login Failed!!!!<br>");
//					out.println("<a href=login.jsp>Try AGAIN!!");
//
//				}
//
//			}
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
      	String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		try {
			PrintWriter out = response.getWriter();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");

			PreparedStatement ps = con.prepareStatement("select password from login where username=?");
			ps.setString(1, uname);

			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				if(rs.getString("password").equals(pass)) {
					System.out.println("Correct");
					RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
					rd.forward(request, response);
				} else {
					out.println("<font color=red size=12> Login Failed!!!!<br>");
					out.println("<a href=login.jsp>Try AGAIN!!");

				}}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		
}}
