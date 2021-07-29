package com.lti.jdbc.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2_GetRecords {

	public static void main(String[] args) throws SQLException {
		
		int totalCost=0;
		String url = "jdbc:oracle:thin:@localhost:1521/XE"; // orcl or XE or OSE
		Connection conn=DriverManager.getConnection(url,"HR","hr");
		if (conn != null)
		{
		System.out.println("Connected");
		}
		try {
		
		  Statement stmt= conn.createStatement();
		  ResultSet rs =stmt.executeQuery("select * from Products");
		  while(rs.next())
		  {
			  int id=rs.getInt(1);
			  String name=rs.getString(2);
			  float cost=rs.getFloat(3);
			 //int id= rs.getInt("PRDID");
			 //String name=rs.getString("PRDNAME");
			 //float cost=rs.getFloat("PRDCOST");
			// System.out.println("Id:" +id +", Name" +name+", Cost :" +cost);
			  System.out.println("Id:" +id);
		 
			  //totalCost=totalCost+cost;
		  }
		}
		  catch(SQLException e)
		  {
			  System.out.println(e.getMessage());
		  }
		  finally
		  {
			  conn.close();
		  }
		  {
			  
		  }
	
	}
}

