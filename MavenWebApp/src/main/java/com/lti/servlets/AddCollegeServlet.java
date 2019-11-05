package com.lti.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.model.Details;
import com.lti.service.CollegeService;


public class AddCollegeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid = Integer.parseInt(request.getParameter("cid"));
		String cname = request.getParameter("cname");
		String coursetype = request.getParameter("coursetype");
		String city = request.getParameter("city");
		int fees = Integer.parseInt(request.getParameter("fees"));
		int pincode = Integer.parseInt(request.getParameter("pincode"));
		Details det = new Details(cid, cname, coursetype, city, fees, pincode);
		CollegeService service = new CollegeService();
		boolean result = service.createCollege(det);
		if(result)
		{
			response.sendRedirect("read.do");
		}
		
	}

}
