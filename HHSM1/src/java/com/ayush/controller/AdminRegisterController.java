package com.ayush.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ayush.dao.AdminRegisterDao;

import com.ayush.model.AdminModel;


/**
 * Servlet implementation class AdminRegisterController
 */
@WebServlet("/AdminRegisterController")
public class AdminRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			AdminModel sd = new AdminModel();
			
			sd.setName(request.getParameter("name"));
			sd.setPassword(request.getParameter("password"));
			sd.setAid(request.getParameter("aid"));
			sd.setEmail(request.getParameter("email"));
			sd.setHostelname((request.getParameter("hostelname")));
		
			sd.setGender(request.getParameter("gender"));
			
			AdminRegisterDao addao = new AdminRegisterDao();
			
			 
			
			 String userRegistered = addao.registerAdm(sd);
			 
			 if(userRegistered.equals("SUCCESS"))  
			 {
				 System.out.println("success");
			 request.getRequestDispatcher("registered.jsp").forward(request, response);
			 }
			 else   
			 {
				 System.out.println("elsepart");
			 request.setAttribute("errMessage", userRegistered);
			 request.getRequestDispatcher("failure.jsp").forward(request, response);
			 }
			 
			 
		} 
		
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
