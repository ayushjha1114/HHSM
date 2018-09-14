package com.ayush.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ayush.dao.StudLoginDao;
import com.ayush.model.AdminModel;
import com.ayush.model.registeredstudModel;
import com.ayush.model.studmodel;


@WebServlet("/StudLogin")
public class StudLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			registeredstudModel sd = new registeredstudModel();
			String sid = request.getParameter("id");
			sd.setSid(sid);
			sd.setPassword(request.getParameter("password"));
			
			AdminModel ad = new AdminModel();
			String aid = request.getParameter("id");
			ad.setAid(aid);
			ad.setPassword(request.getParameter("password"));
			
		
			StudLoginDao lgdao = new StudLoginDao();
			
			String userValidate = lgdao.authenticateStudent(sd);
			
			String adminValidate = lgdao.authenticateAdmin(ad);
			
			if(userValidate.equals("SUCCESS-STUDENT")) 
			 {
				 HttpSession session = request.getSession(); //Creating a session
				 session.setAttribute("sid", sid); //setting session attribute
			 request.setAttribute("sid", sid); //with setAttribute() you can define a "key" and value pair so that you can get it in future using getAttribute("key")
			 request.getRequestDispatcher("StudentDashboard.jsp").forward(request, response);
			 }
			else if(adminValidate.equals("SUCCESS-ADMIN")){
				 HttpSession session = request.getSession(); //Creating a session
				 session.setAttribute("admin", aid); //setting session attribute
				 request.setAttribute("aid", aid);
				 request.getRequestDispatcher("AdminDashboard.jsp").forward(request, response);
			}
			 else
			 {
			 request.setAttribute("errMessage", userValidate); 
			 request.getRequestDispatcher("login.jsp").forward(request, response);
			 }
			 
			 
			 
		} 
		
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
