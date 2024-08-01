package com.seed;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbOperations {
	
	public void addData(int empid,String ename,int salary) {
		DbConnection db=new DbConnection();

		 try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
				
				PreparedStatement st=con.prepareStatement("insert into employee values(?,?,?)");
				st.setInt(1,empid);
				st.setString(2, ename);
				st.setInt(3, salary);
				st.executeUpdate();
				db.closeConnection();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		
		 }
	public void modifyData(int empid,int salary) {
		DbConnection db=new DbConnection();
		 try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
				
				PreparedStatement st=con.prepareStatement("update employee set salary=? where empid=?");
				st.setInt(1,salary);
				st.setInt(2, empid);
				st.executeUpdate();
				db.closeConnection();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public void deleteData(int empid) {
		DbConnection db=new DbConnection();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			
			PreparedStatement st=con.prepareStatement("delete from employee where salary=?");
			st.setInt(1,empid);
			st.executeUpdate();
			db.closeConnection();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public List displayData() {
		DbConnection db=new DbConnection();
		List l=new ArrayList();

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
					l.add(rs.getInt(1)+""+rs.getString(2)+""+rs.getInt(3));
					
				}
				
				db.closeConnection();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 return l;
	}

}
