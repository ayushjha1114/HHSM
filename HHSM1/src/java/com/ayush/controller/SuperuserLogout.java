
package com.ayush.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SuperuserLogout", urlPatterns = {"/SuperuserLogout"})
public class SuperuserLogout extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      	HttpSession session = request.getSession(false); //Fetch session object
		 
		 if(session!=null) //If session is not null
		 {
		 session.invalidate(); //removes all session attributes bound to the session
		 request.setAttribute("errMessage", "You have logged out successfully");
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("SuperUser.jsp");
		 requestDispatcher.forward(request, response);
		 System.out.println("Logged out");
    }

    }

}
