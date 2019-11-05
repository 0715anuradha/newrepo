<%@page import="java.util.List"%>
<%@page import="com.lti.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Colleges</title>

<style>
#college {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#college td, #college th {
  border: 1px solid #ddd;
  padding: 8px;
}

#college tr:nth-child(even){background-color: #f2f2f2;}

#college tr:hover {background-color: #ddd;}

#college th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #f44336;
  color: white;
}
</style>

</head>
<body>
	<table id="college">
	<tr>
		<th> College Id </th>
		<th> College Name</th>
		<th> Course Type </th>
		<th> City</th>
		<th> Fees </th>
		<th> Pincode </th>
	</tr>
	<%
	List<Details> det = (List<Details>)request.getAttribute("listdet");
	for(Details college : det)
	{
		out.println("<tr>");
		out.println("<td>"+ college.getCid() +"</td>");
		out.println("<td>"+college.getCname()+"</td>");
		out.println("<td>"+college.getCoursetype()+"</td>");
		out.println("<td>"+college.getCity()+"</td>");
		out.println("<td>"+college.getFees()+"</td>");
		out.println("<td>"+college.getPincode()+"</td>");
		
		out.println("</tr>");
	}
	
	%>
	</table>
</body>
</html>