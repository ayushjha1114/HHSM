
package com.ayush.controller;

import com.ayush.model.ConnectionProvider;
import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "LeaveController", urlPatterns = {"/LeaveController"})
public class LeaveController extends HttpServlet {

 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String sid = request.getParameter("sid");
      String hostelname = request.getParameter("hostelname");
      String about = request.getParameter("about");
      String description = request.getParameter("description");
      
      try{
           Connection con = ConnectionProvider.getCon();
	 PreparedStatement ps = con.prepareStatement("insert into leav(sid,about,description,hostelname) values (?,?,?,?)"); 
	 ps.setString(1, sid);
	 ps.setString(2, about);
	 ps.setString(3, description);
         ps.setString(4, hostelname);
          int i= ps.executeUpdate();
          if (i>0){
              request.getRequestDispatcher("registered.jsp").forward(request, response);
          }else{
              request.getRequestDispatcher("failure.jsp").forward(request, response);
          }
      }
      catch(SQLException | ServletException | IOException e){
          System.out.println(e);
      }
      
      
      
    }



}
