package com.lti.jdbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Demo3_InsertRecord {

	public static void main(String[] args) throws SQLException {
		String url= "jdbc:oracle:thin:@localhost:1521/XE";
	  Connection conn=DriverManager.getConnection(url,"HR","hr");
		if (conn != null)
		{
		System.out.println("Connected");
		}
		try {
		Statement stmt=conn.createStatement();
		//int i=stmt.executeUpdate("insert into PRODUCTS values(104,'Pen',500)");
		//System.out.println("no of records added "+i);
		
	   boolean ans=stmt.execute("insert into PRODUCTS values(105,'Pen',500)");
		System.out.println("no of records added "+ans);
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
