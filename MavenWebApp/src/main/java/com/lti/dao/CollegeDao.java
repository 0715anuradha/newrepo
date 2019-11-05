package com.lti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lti.model.Details;



public class CollegeDao {
	public List<Details> showAllColleges(){
		List<Details> college = new ArrayList<>();
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:scott@//localhost:1521/XE", "hr", "hr");
		//Statement stmt = conn.createStatement();
		String query = "Select * from College ";
		PreparedStatement pstmt = conn.prepareStatement(query);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()){
			int cid = rs.getInt("cid");
			String cname = rs.getString("cname");
			String coursetype= rs.getString("coursetype");
			String city = rs.getString("city"); 
			int fees = rs.getInt("fees"); 
			int pincode = rs.getInt("pincode"); 
			Details det = new Details(cid, cname, coursetype, city, fees, pincode);
			college.add(det);
			
		}
	}
	catch(ClassNotFoundException | SQLException e){
		e.printStackTrace();
		
	}
	return college;

	}
	public int deleteCollege(int cid){
		int result=0;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:scott@//localhost:1521/XE", "hr", "hr");
			String query = "Delete from College where cid=?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, cid);
			result = pstmt.executeUpdate();
		}
		catch(SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}
		return result;
		}
	public int addCollege (Details det){
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:scott@//localhost:1521/XE", "hr", "hr");
			String query = "Insert into College values (?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, det.getCid());
			pstmt.setString(2, det.getCname());
			pstmt.setString(3, det.getCoursetype());
			pstmt.setString(4, det.getCity());
			pstmt.setInt(5, det.getFees());
			pstmt.setInt(6, det.getPincode());
			
			result = pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return result;
}
}
		
