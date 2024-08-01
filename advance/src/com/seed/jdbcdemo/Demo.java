package com.seed.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public interface Demo {
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			ResultSet rs=st.executeQuery("select id,ename,salary from employee");
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+"");
				System.out.println(rs.getString(2)+"");
				System.out.println(rs.getInt(3)+"");
			}
			System.out.println("REVERSE PRINT");
			while(rs.previous()) {
				System.out.println(rs.getInt(1)+"");
				System.out.println(rs.getString(2)+"");
				System.out.println(rs.getInt(3)+"");
			} 
			System.out.println("printing random record");
			rs.absolute(4);
			System.out.println(rs.getInt(1)+"");
			System.out.println(rs.getString(2)+"");
			System.out.println(rs.getInt(3)+"");
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
