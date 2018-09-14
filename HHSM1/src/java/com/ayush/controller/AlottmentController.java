package com.ayush.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ayush.dao.AllotmentDao;
import com.ayush.model.studmodel;

/**
 * Servlet implementation class AlottmentController
 */
@WebServlet("/AlottmentController")
public class AlottmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			studmodel sad = new studmodel();
			sad.setSid(request.getParameter("sid"));
			sad.setName(request.getParameter("name"));
			sad.setRollno(Integer.parseInt(request.getParameter("rollno")));
			sad.setHostelname(request.getParameter("hostelname"));
			sad.setRoom(Integer.parseInt(request.getParameter("room")));
			sad.setYear(request.getParameter("year"));
		
			AllotmentDao sdao = new AllotmentDao();
			System.out.println("yup!!!!!!");
			 String ss = sdao.allot(sad);
			 
			 if(ss.equals("SUCCESS"))  
			 {
				 System.out.println("success");
				
			 request.getRequestDispatcher("registered.jsp").forward(request, response);
			 }
			 else   
			 {
				 System.out.println("else part");
			 request.setAttribute("errMessage", ss);
			 request.getRequestDispatcher("failure.jsp").forward(request, response);
			 }
			 
			 
		} 
		
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
