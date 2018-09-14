
package com.ayush.dao;


import com.ayush.model.ConnectionProvider;
import com.ayush.model.superusermodel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SuperUserDao {
     public String authenticateS(superusermodel sud)
	 {
	 
	String username = sud.getUsername();
	 String password = sud.getPassword();
	 
	 String idDB = "";
	 String passwordDB = "";
	 
	try
	 {
		Connection con = ConnectionProvider.getCon();
	    Statement st = con.createStatement();
	    
	      ResultSet rs = st.executeQuery("select username,password from superuser");
 
		while (rs.next()) {
			idDB = rs.getString("username"); 
			  passwordDB = rs.getString("password");
			 System.out.println("retrieve");
                         
			   if(username.equals(idDB) && password.equals(passwordDB))
			   {
                               System.out.println("inside if ");
			      return "SUCCESS"; 
			   }
                       
		}
		
				}
	 catch(SQLException e)
	 {
	 e.printStackTrace();
	 }
	 return "Invalid Credentials"; 
	 }
	
	
}
