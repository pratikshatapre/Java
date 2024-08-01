package com.seed.jdbcdemo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbOperations1 {
	
	DbConnection db=new DbConnection ();
	public void addData(int empid,String ename,int salary) {

		 try {
			 
				PreparedStatement st=db.getPreparedStatement("insert into employee values(?,?,?)");
				st.setInt(1,empid);
				st.setString(2, ename);
				st.setInt(3, salary);
				st.executeUpdate();
				db.closeConnection();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		
		 }
	public void modifyData(int empid,int salary) {
		 try {
				
				PreparedStatement st=db.getPreparedStatement("update employee set salary=? where empid=?");
				st.setInt(1,salary);
				st.setInt(2, empid);
				st.executeUpdate();
				db.closeConnection();
				
			}  catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public void deleteData(int empid) {
		
		try {
			
			PreparedStatement st=db.getPreparedStatement("delete from employee where salary=?");
			st.setInt(1,empid);
			st.executeUpdate();
			db.closeConnection();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void displayData() {

		 try {
				
				Statement st=db.getStatement();
				
				ResultSet rs=st.executeQuery("select * from employee");
				while (rs.next())
				{
					System.out.println(rs.getInt(1)+"");
					System.out.println(rs.getString(2)+"");
					System.out.println(rs.getInt(3)+"");
					
				}
				
				db.closeConnection();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
