package practics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertDemo {
	public static void main(String[] args) {
		
		try {
			
			Scanner sc=new Scanner(System.in);
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			
			PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
			
			System.out.println("enter your name");
			String Name=sc.next();
			System.out.println("Name: " + Name);
			
			
			System.out.println("enter your email");
			String Email=sc.next();
			System.out.println("Email: " + Email);
			
			System.out.println("enter your pass");
			String Pass=sc.next();
			System.out.println("Pass: " + Pass);
			
			System.out.println("enter your gender");
			String Gender=sc.next();
			System.out.println("Gender: " + Gender);
			
			
			System.out.println("enter your city");
			String City=sc.next();
		    System.out.println("City: " + City);
		    
		    
			ps.setString(1, Name);

			ps.setString(2, Email);

			ps.setString(3, Pass);

			ps.setString(4, Gender);

			ps.setString(5,City);

			ps.executeUpdate();
			
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
