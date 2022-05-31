package com.lt.crs.bean;

public class Course {

	private String courseCode;
	private String name;
	private boolean isOffered;
	private String instructor;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isOffered() {
		return isOffered;
	}
	public void setOffered(boolean isOffered) {
		this.isOffered = isOffered;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public Course(String courseCode, String name, boolean isOffered, String instructor) {
		super();
		this.courseCode = courseCode;
		this.name = name;
		this.isOffered = isOffered;
		this.instructor = instructor;
	}
	public Course() {
		super();
	}
	
	public Course(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "courseCode=" + courseCode + ", name=" + name +  ", instructor="
				+ instructor + "";
	}
	
		
}
