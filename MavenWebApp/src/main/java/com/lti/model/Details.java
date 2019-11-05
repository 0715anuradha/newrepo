package com.lti.model;

public class Details {
	int cid;
	String cname;
	String coursetype;
	String city;
	int fees;
	int pincode;
	
	
	
	public Details() {

	}

	public Details(int cid, String cname, String coursetype, String city, int fees, int pincode) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.coursetype = coursetype;
		this.city = city;
		this.fees = fees;
		this.pincode = pincode;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCoursetype() {
		return coursetype;
	}

	public void setCoursetype(String coursetype) {
		this.coursetype = coursetype;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Details [cid=" + cid + ", cname=" + cname + ", coursetype=" + coursetype + ", city=" + city + ", fees="
				+ fees + ", pincode=" + pincode + "]";
	}
	
	
}
