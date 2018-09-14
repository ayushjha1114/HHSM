
package com.ayush.controller;






import com.ayush.dao.SuperUserDao;
import com.ayush.model.ConnectionProvider;
import com.ayush.model.superusermodel;


import java.io.IOException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SuperUserLogin", urlPatterns = {"/SuperUserLogin"})
public class SuperUserLogin extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
	try {
			superusermodel sud = new superusermodel();
			String username = request.getParameter("username");
			sud.setUsername(username);
			sud.setPassword(request.getParameter("password"));
			
			
			
		
			SuperUserDao lgdao = new SuperUserDao();
			
			String userValidate = lgdao.authenticateS(sud);
			
			
			
			if(userValidate.equals("SUCCESS")) 
			 {
				 HttpSession session = request.getSession(); //Creating a session
				 session.setAttribute("username", username); //setting session attribute
			 request.setAttribute("username", username); //with setAttribute() you can define a "key" and value pair so that you can get it in future using getAttribute("key")
			 request.getRequestDispatcher("SuperUserDashboard.jsp").forward(request, response);
			 }
			
			 else
			 {
			 request.setAttribute("errMessage", userValidate); 
			 request.getRequestDispatcher("SuperUser.jsp").forward(request, response);
			 }
			 
			 
			 
		} 
		
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
			 
			 
		
    }

  

}
