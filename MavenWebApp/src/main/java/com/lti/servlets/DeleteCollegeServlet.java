package com.lti.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.service.CollegeService;

public class DeleteCollegeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CollegeService service = new CollegeService();
		int cid = Integer.parseInt(request.getParameter("text1"));
		System.out.println(cid);
		boolean result = service.removeCollege(cid);
		RequestDispatcher rd = request.getRequestDispatcher("read.do");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
