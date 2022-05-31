package com.lt.crs.dao;

import java.util.List;

import com.lt.crs.bean.Student;

public interface CourseDaoInterface {
	public String getCourseCode();
	
	public List<Student> getRegisteredStudents();
	//public List<String> getCourses();
}
