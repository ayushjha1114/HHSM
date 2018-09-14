
package com.ayush.controller;

import com.ayush.model.ConnectionProvider;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ChangepassStud", urlPatterns = {"/ChangepassStud"})
public class ChangepassStud extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    try {
			
			String sid = request.getParameter("sid");
			 String password = request.getParameter("password");
			
			String newpassword = request.getParameter("newpassword");
			String replypassword = request.getParameter("replypassword");
                        
		 String idDB = "";
	 String passwordDB = "";
          ResultSet rs=null;
          Statement st = null;

		         if(newpassword.equals(replypassword)) 
			 {
				Connection con = ConnectionProvider.getCon();
	                       st = con.createStatement();
	
	       rs = st.executeQuery("select sid,password from allotment");
 
		while (rs.next()) {
			idDB = rs.getString("sid"); 
			  passwordDB = rs.getString("password");
			 
			   if(sid.equals(idDB) && password.equals(passwordDB))
			   { 
                               st.executeUpdate("update allotment  set password='newpassword' where sid=" + sid); 
			 request.getRequestDispatcher("SuperUserDashboard.jsp").forward(request, response);
			 }
                         }
                         }
                        else
			 {
			 
			 request.getRequestDispatcher("changepassword.jsp").forward(request, response);
			 }
 
                         }
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
    }
}