/**
 * 
 */
package com.lt.crs.service;

import java.util.List;

import com.lt.crs.bean.Student;

/**
 * @author user219
 * 
 */
public interface CourseServiceInterface {
	public String getCourseCode();

	public List<Student> getRegisteredStudents();
	
	

}
