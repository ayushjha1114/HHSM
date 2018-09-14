package com.ayush.dao;



import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ayush.model.AdminModel;
import com.ayush.model.ConnectionProvider;
import com.ayush.model.registeredstudModel;
import com.ayush.model.studmodel;

public class StudLoginDao {

	
	 public String authenticateStudent(registeredstudModel sd)
	 {
	 
	String id = sd.getSid();
	 String password = sd.getPassword();
	 
	 String idDB = "";
	 String passwordDB = "";
	 
	try
	 {
		Connection con = ConnectionProvider.getCon();
	    Statement st = con.createStatement();
	    if(id.startsWith("stu")) {
	      ResultSet rs = st.executeQuery("select sid,password from allotment");
 
		while (rs.next()) {
			idDB = rs.getString("sid"); 
			  passwordDB = rs.getString("password");
			 
			   if(id.equals(idDB) && password.equals(passwordDB))
			   {
			      return "SUCCESS-STUDENT"; 
			   }
		}
		}
				}
	 catch(SQLException e)
	 {
	 e.printStackTrace();
	 }
	 return "Invalid Credentials"; 
	 }
	
	 public String authenticateAdmin(AdminModel ad)
	 {
	 
	String id = ad.getAid();
	 String password = ad.getPassword();
	 
	 String idDB = "";
	 String passwordDB = "";
	 
	try
	 {
		Connection con = ConnectionProvider.getCon();
	    Statement st = con.createStatement();
	    if(id.startsWith("adm")) {
	    	 ResultSet rs = st.executeQuery("select password,aid from adminregister");
	    	 
	 		while (rs.next()) {
	 			idDB = rs.getString("aid"); 
	 			  passwordDB = rs.getString("password");
	 			 
	 			   if(id.equals(idDB) && password.equals(passwordDB))
	 			   {
	 			      return "SUCCESS-ADMIN"; 
	 			   }
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

/*
create table registeredstudent(
sid varchar(100) NOT NULL,
password varchar(100) NOT NULL
);
*/