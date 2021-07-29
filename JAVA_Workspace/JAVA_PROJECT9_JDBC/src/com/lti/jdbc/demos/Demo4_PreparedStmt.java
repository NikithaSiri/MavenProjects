package com.lti.jdbc.demos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

	public class Demo4_PreparedStmt {
	
		//what is the advantage of prepared statement?
		//statement gets prepared as per user input //dynamic
		//**these statements are in precompiled form-faster
		public static void main(String[] args) throws SQLException {
			String url= "jdbc:oracle:thin:@localhost:1521/XE";
		  Connection conn=DriverManager.getConnection(url,"HR","hr");
			if (conn != null)
			{
			System.out.println("Connected");
			}
			try {
				
				//?placeholder 1,106-1st ?-set int value 106
			PreparedStatement pstmt=conn.prepareStatement("insert into PRODUCTS values(?,?,?)");
			System.out.println("Enter Product");
			Scanner sc=new Scanner(System.in);
			pstmt.setInt(1, sc.nextInt());
		    pstmt.setString(2, sc.next()); //2nd ? replace value"Eraser"
		    pstmt.setDouble(3,sc.nextDouble());//
		    
		    int rec=pstmt.executeUpdate();
		    System.out.println("records updated "+rec);
		    
		}
			catch(SQLException e)
			  {
				  System.out.println(e.getMessage());
			  }
			  finally
			  {
				  conn.close();
			  }

		}
	}


