package com.lti.jdbc.demos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo6_CallableStatement {

	public static void main(String[] args) throws SQLException {
		String url= "jdbc:oracle:thin:@localhost:1521/XE";
	  Connection conn=DriverManager.getConnection(url,"HR","hr");
		CallableStatement cstmt=null;
		if (conn != null)
		{
		System.out.println("Connected");
		}
		
		try 
		{
			cstmt=conn.prepareCall("{call getProductName(?,?)}");
			cstmt.setInt(1, 1112);
			cstmt.registerOutParameter(2,java.sql.Types.VARCHAR);
			cstmt.executeUpdate();
			String prdName=cstmt.getString(2);
			System.out.println(prdName);
		}
		catch(SQLException e)
		  {
			  System.out.println(e.getMessage());
		  }
		  finally
		  {
			 
		  }
	}
}
