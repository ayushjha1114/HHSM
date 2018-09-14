package com.ayush.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ayush.model.ConnectionProvider;
import com.ayush.model.studmodel;

public class StudRegisterDao {

	 public String registerStud(studmodel studBean)
	 {
		 
	 String name = studBean.getName();
	 String sid = studBean.getSid();
	 String email = studBean.getEmail();
	 int rollno = studBean.getRollno();
         String studentmobno = studBean.getStudentmobno();
         String fathername = studBean.getFathername();
         String fathermobno = studBean.getFathermobno();
         String mothername = studBean.getMothername();
         String mothermobno = studBean.getMothermobno();
	 String course = studBean.getCourse();
	 String branch = studBean.getBranch();
	 String gender = studBean.getGender();
	 String year = studBean.getYear();
	 float percent = studBean.getPercent();
	 
	
	 
	 try
	 {
		 Connection con = ConnectionProvider.getCon();
	 PreparedStatement ps = con.prepareStatement("insert into student(sid,name,studentmobno,fathername,fathermobno,mothername,"
                 + "mothermobno,email,rollno,course,branch,gender,year,percent) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)"); 
	 ps.setString(1, sid);
	 ps.setString(2, name);
         ps.setString(3, studentmobno);
         ps.setString(4, fathername);
         ps.setString(5, fathermobno);
         ps.setString(6, mothername);
         ps.setString(7, mothermobno);
	 ps.setString(8, email);
	 ps.setInt(9, rollno);
	 ps.setString(10, course);
	 ps.setString(11, branch);
	 ps.setString(12, gender);
	 ps.setString(13, year);
	 ps.setFloat(14, percent);
	
	 System.out.println("hgjhhj");
	 int i= ps.executeUpdate();
	 System.out.println("value of i in register of student"+ i);
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



/*create database hostel;
use hostel;
create table student(
sid varchar(50) NOT NULL,
name varchar(50) NOT NULL,
PRIMARY KEY(sid),
studentmobno varchar(10) NOT NULL,
fathername varchar(100) NOT NULL,
fathermobno varchar(10) NOT NULL,
mothername varchar(100) NOT NULL,
mothermobno varchar(10) NOT NULL,
email varchar(50) NOT NULL,
rollno integer(20) NOT NULL,
course varchar(10) NOT NULL,
branch varchar(5) NOT NULL,
gender varchar(6) NOT NULL,
year  varchar(4) NOT NULL,
percent float(4,2) not null
);*/
