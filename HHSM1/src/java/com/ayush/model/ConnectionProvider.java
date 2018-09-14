package com.ayush.model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider 
{
	public static   Connection con;
	public  static Connection getCon()
	{
	
		try {
		
			 Class.forName("com.mysql.jdbc.Driver");  
			   Connection con=DriverManager.getConnection(  
			   "jdbc:mysql://localhost:3306/hostel","root","root");  
	return con;
		} catch (ClassNotFoundException e) {
					
			e.printStackTrace();
			return con;
		} catch (SQLException e) {
		
			e.printStackTrace();
			return con;
		}
	}

}
