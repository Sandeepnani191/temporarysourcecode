package com.lt.crs.bean;

public class Admin {

	private String department;
	private String designation;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Admin(String department, String designation) {
		super();
		this.department = department;
		this.designation = designation;
	}
	public Admin() {
		super();
	}
	
	
}
