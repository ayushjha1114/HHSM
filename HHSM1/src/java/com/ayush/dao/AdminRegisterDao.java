package com.ayush.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ayush.model.AdminModel;
import com.ayush.model.ConnectionProvider;


public class AdminRegisterDao {
	 public String registerAdm(AdminModel studBean)
	 {
		 
	 String name = studBean.getName();
	 String password = studBean.getPassword();
	 String aid = studBean.getAid();
	 String email = studBean.getEmail();
	 String hostelname = studBean.getHostelname();
	
	 
	 String gender = studBean.getGender();
	
	 
	
	 
	 try
	 {
		 Connection con = ConnectionProvider.getCon();
//	 String query = "insert into student(SlNo,name,password,email,rollno,course,branch,gender,year,percent) values (NULL,?,?,?,?,?,?,?,?,?)";
	 PreparedStatement ps = con.prepareStatement("insert into adminregister(name,password,aid,email,hostelname,gender) values (?,?,?,?,?,?)"); 
	 ps.setString(1, name);
	 ps.setString(2, password);
	 ps.setString(3, aid);
	 ps.setString(4, email);
	 ps.setString(5, hostelname);
	 ps.setString(6, gender);
	
	
	 System.out.println("hgjhhj");
	 int i= ps.executeUpdate();
	 System.out.println(i);
	 if (i>0) 
	     {
		 System.out.println("success return");
	     return "SUCCESS"; 
	     }
	 }
	 catch(SQLException e)
	 {
	 e.printStackTrace();
	 }
	 
	 return "Oops.. Something went wrong there..!";  
	 }
}




/*create table adminregister(
name varchar(100) NOT NULL,
password varchar(100) NOT NULL,
aid varchar(100)  NOT NULL,
email varchar(100) NOT NULL,
hostelname varchar(100) NOT NULL,
gender varchar(6) NOT NULL
);

*/

