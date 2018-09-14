package com.ayush.controller;

import java.io.IOException;
import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.ayush.model.ConnectionProvider;
import java.sql.SQLException;



@WebServlet("/AttendanceController")
public class AttendanceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int c=Integer.parseInt(request.getParameter("count"));
			String warden = request.getParameter("warden");
			                 
			String[] mix =new String[c-1];
			String[] radio =new String[c-1];
                        String[] name =new String[c-1];
                                
			for(int i=0;i<c-1;i++) {
				mix[i]=request.getParameter("radio"+(i+1));
			                         System.out.println(mix[i]);
			}
		    for(int j=0;j<c-1;j++){
                        radio[j]=mix[j].substring(0,1);
                        name[j]=mix[j].substring(1);
                    }
			
		                  System.out.println("NAme of wardden"+warden);
			
			 ResultSet rs = null;
			 String a=null;
			 String bb = null;
			
				 Connection con = ConnectionProvider.getCon();
				 Statement stmt = con.createStatement();
				 
				 rs = stmt.executeQuery("select hostelname from adminregister where aid='" + warden + "'");
				 while (rs.next()) {
						bb = rs.getString("hostelname");
					}
				 if(bb.equals("Malviya Bhawan"))
				 {
					 for(int x=0;x<c-1;x++)
					 {
						 rs = stmt.executeQuery("select name from malviyattend where name='" + name[x]+"'");
						 while (rs.next()) {
								a = rs.getString("name");
							} 
						 System.out.println(a);
						 if(a.equals(name[x])) {
                                                     System.out.println("value of x "+x);
							  stmt.executeUpdate("update malviyattend  set attendance='"+radio[x]+"' where name='" + name[x]+"'"); 
						
						     }
                                                 
					 }
					 request.getRequestDispatcher("registered.jsp").forward(request, response);
                                     
				 }
                                 else if(bb.equals("Vivekanand Bhawan"))
                                 {
                                      for(int x=0;x<c-1;x++)
					 {
						 rs = stmt.executeQuery("select name from fblockattend where name='" + name[x]+"'");
						 while (rs.next()) {
								a = rs.getString("name");
							} 
						 System.out.println(a);
						 if(a.equals(name[x])) {
                                                     System.out.println("value of x "+x);
							  stmt.executeUpdate("update fblockattend  set attendance='"+radio[x]+"' where name='" + name[x]+"'"); 
						
						     }
                                                 
					 }
					 request.getRequestDispatcher("registered.jsp").forward(request, response);
                                 }
                                 else if(bb.equals("Patel Bhawan"))
                                 {
                                      for(int x=0;x<c-1;x++)
					 {
						 rs = stmt.executeQuery("select name from bblockattend where name='" + name[x]+"'");
						 while (rs.next()) {
								a = rs.getString("name");
							} 
						 System.out.println(a);
						 if(a.equals(name[x])) {
                                                     System.out.println("value of x "+x);
							  stmt.executeUpdate("update bblockattend  set attendance='"+radio[x]+"' where name='" + name[x]+"'"); 
						
						     }
                                                 
					 }
					 request.getRequestDispatcher("registered.jsp").forward(request, response);
                                 }
                                 else if(bb.equals("LMR"))
                                 {
                                      for(int x=0;x<c-1;x++)
					 {
						 rs = stmt.executeQuery("select name from lmrattend where name='" + name[x]+"'");
						 while (rs.next()) {
								a = rs.getString("name");
							} 
						 System.out.println(a);
						 if(a.equals(name[x])) {
                                                     System.out.println("value of x "+x);
							  stmt.executeUpdate("update lmrattend  set attendance='"+radio[x]+"' where name='" + name[x]+"'"); 
						
						     }
                                                 
					 }
					 request.getRequestDispatcher("registered.jsp").forward(request, response);
                                 }
                                 else if(bb.equals("Navyug"))
                                 {
                                      for(int x=0;x<c-1;x++)
					 {
						 rs = stmt.executeQuery("select name from navyugattend where name='" + name[x]+"'");
						 while (rs.next()) {
								a = rs.getString("name");
							} 
						 System.out.println(a);
						 if(a.equals(name[x])) {
                                                     System.out.println("value of x "+x);
							  stmt.executeUpdate("update navyugattend  set attendance='"+radio[x]+"' where name='" + name[x]+"'"); 
						
						     }
                                                 
					 }
					 request.getRequestDispatcher("registered.jsp").forward(request, response);
                                 }
                                 else if(bb.equals("Sarojini Bhawan"))
                                 {
                                      for(int x=0;x<c-1;x++)
					 {
						 rs = stmt.executeQuery("select name from sarojiniattend where name='" + name[x]+"'");
						 while (rs.next()) {
								a = rs.getString("name");
							} 
						 System.out.println(a);
						 if(a.equals(name[x])) {
                                                     System.out.println("value of x "+x);
							  stmt.executeUpdate("update sarojiniattend  set attendance='"+radio[x]+"' where name='" + name[x]+"'"); 
						
						     }
                                                 
					 }
					 request.getRequestDispatcher("registered.jsp").forward(request, response);
                                 }
                                 else if(bb.equals("MBA"))
                                 {
                                      for(int x=0;x<c-1;x++)
					 {
						 rs = stmt.executeQuery("select name from mbaattend where name='" + name[x]+"'");
						 while (rs.next()) {
								a = rs.getString("name");
							} 
						 System.out.println(a);
						 if(a.equals(name[x])) {
                                                     System.out.println("value of x "+x);
							  stmt.executeUpdate("update mbaattend  set attendance='"+radio[x]+"' where name='" + name[x]+"'"); 
						
						     }
                                                 
					 }
					 request.getRequestDispatcher("registered.jsp").forward(request, response);
                                 }
                                 else if(bb.equals("E Block"))
                                 {
                                      for(int x=0;x<c-1;x++)
					 {
						 rs = stmt.executeQuery("select name from eblockattend where name='" + name[x]+"'");
						 while (rs.next()) {
								a = rs.getString("name");
							} 
						 System.out.println(a);
						 if(a.equals(name[x])) {
                                                     System.out.println("value of x "+x);
							  stmt.executeUpdate("update eblockattend  set attendance='"+radio[x]+"' where name='" + name[x]+"'"); 
						
						     }
                                                 
					 }
					 request.getRequestDispatcher("registered.jsp").forward(request, response);
                                 }
                                  else if(bb.equals("D Block"))
                                 {
                                      for(int x=0;x<c-1;x++)
					 {
						 rs = stmt.executeQuery("select name from dblockattend where name='" + name[x]+"'");
						 while (rs.next()) {
								a = rs.getString("name");
							} 
						 System.out.println(a);
						 if(a.equals(name[x])) {
                                                     System.out.println("value of x "+x);
							  stmt.executeUpdate("update dblockattend  set attendance='"+radio[x]+"' where name='" + name[x]+"'"); 
						
						     }
                                                 
					 }
					 request.getRequestDispatcher("registered.jsp").forward(request, response);
                                 }

			 else   
			 {
				 System.out.println("elsepart");
			 
			 request.getRequestDispatcher("failure.jsp").forward(request, response);
			 }
			 
			 
		} 
		
		
		catch (NumberFormatException | SQLException | ServletException | IOException e) {
		}
	}
	}

