package com.seed.jdbcdemo;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbOperations {
	
	public void addData(int empid,String ename,int salary) {

		 try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
				
				PreparedStatement st=con.prepareStatement("insert into employee values(?,?,?)");
				st.setInt(1,empid);
				st.setString(2, ename);
				st.setInt(3, salary);
				st.executeUpdate();
				con.close();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		
		 }
	public void modifyData(int empid,int salary) {
		 try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
				
				PreparedStatement st=con.prepareStatement("update employee set salary=? where empid=?");
				st.setInt(1,salary);
				st.setInt(2, empid);
				st.executeUpdate();
				con.close();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public void deleteData(int empid) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			
			PreparedStatement st=con.prepareStatement("delete from employee where salary=?");
			st.setInt(1,empid);
			st.executeUpdate();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void displayData() {

		 try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
				
				Statement st=con.createStatement();
				
				ResultSet rs=st.executeQuery("select * from employee");
				while (rs.next())
				{
					System.out.println(rs.getInt(1)+"");
					System.out.println(rs.getString(2)+"");
					System.out.println(rs.getInt(3)+"");
					
				}
				
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
