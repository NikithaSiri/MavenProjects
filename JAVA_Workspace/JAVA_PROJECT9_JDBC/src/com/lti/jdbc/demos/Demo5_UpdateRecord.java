package com.lti.jdbc.demos;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.*;

	public class Demo5_UpdateRecord {
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
				try {
					
				//Update products set prdcost=? where prdId=?		
				PreparedStatement pstmt=conn.prepareStatement("");
				pstmt.setInt(2, prdId);
				pstmt.setDouble(1, prdCost);
				int rec=pstmt.executeUpdate();
				System.out.println("Records Updated: "+rec);
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




