package com.lti.jdbc.demos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo7_MetaData {
	public static void main(String[] args) throws SQLException {
		String url= "jdbc:oracle:thin:@localhost:1521/XE";
		  Connection conn=DriverManager.getConnection(url,"HR","hr");
			Scanner sc=new Scanner(System.in);
		  System.out.println("Enter product id: ");
			int prdId=sc.nextInt();
			System.out.println("Enter product Cost: ");
			double prdCost=sc.nextDouble();
			if (conn != null)
			{
			System.out.println("Connected");
			}
		Statement stmt=null;
		try
		{
			  stmt = conn.createStatement();
		      String query = "select * from Products";
		      ResultSet rs = stmt.executeQuery(query);
		      
		      ResultSetMetaData rsmd = rs.getMetaData();		   			     			      
		      System.out.println("no of columns in the table= "+      rsmd.getColumnCount());
		      System.out.println("Name of the first column "+        rsmd.getColumnName(1));
		      System.out.println("Type of the second column "+       rsmd.getColumnTypeName(2));
		      System.out.println("No of characters in 3rd column "+       rsmd.getColumnDisplaySize(2));	   
				
		      DatabaseMetaData dma = conn.getMetaData();		      
				System.out.println("\n  connected to "+ dma.getURL());
				System.out.println(" driver "+ dma.getDriverName());
				System.out.println(" version "+ dma.getDatabaseProductName());  
            System.out.println(" version "+ dma.getUserName()); 
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
