package com.ayush.controller;

import java.io.IOException;



//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ayush.dao.StudRegisterDao;
import com.ayush.model.studmodel;


@WebServlet("/Register")
//@WebServlet("Register")
public class StudRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			studmodel sd = new studmodel();
			sd.setName(request.getParameter("name"));
			sd.setSid(request.getParameter("sid"));
                        sd.setStudentmobno(request.getParameter("studentmobno"));
                        sd.setFathername(request.getParameter("fathername"));
                        sd.setFathermobno(request.getParameter("fathermobno"));
                        sd.setMothername(request.getParameter("mothername"));
                        sd.setMothermobno(request.getParameter("mothermobno"));
			sd.setEmail(request.getParameter("email"));
			sd.setRollno(Integer.parseInt(request.getParameter("rollno")));
			sd.setCourse(request.getParameter("course"));
			sd.setBranch(request.getParameter("branch"));
			sd.setGender(request.getParameter("gender"));
			sd.setYear(request.getParameter("year"));
			sd.setPercent(Float.parseFloat(request.getParameter("percent")));
			//flag = true;
		
			StudRegisterDao stdao = new StudRegisterDao();
			
			 
			
			 String userRegistered = stdao.registerStud(sd);
			 
			 if(userRegistered.equals("SUCCESS"))  
			 {
				 System.out.println("success");
			 request.getRequestDispatcher("AllotmentForm.jsp").forward(request, response);
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
