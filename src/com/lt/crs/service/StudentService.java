package com.lt.crs.service;

import java.util.ArrayList;

import com.lt.crs.dao.StudentDao;
import com.lt.crs.dao.StudentDaoInterface;

public class StudentService implements StudentServiceInterface {
	public void registerCourse(int input) {

		StudentDaoInterface ssd = new StudentDao();
		ssd.registerCourse(input);

	}

	public void viewreportcard(int id) {

		int i = id;
		StudentDaoInterface ssd = new StudentDao();
		ssd.viewreportcard(i);
	}

	public void viewCatalog() {

		StudentDaoInterface ssd = new StudentDao();
		ArrayList resultlist = (ArrayList) ssd.viewCatalog();

		System.out.println(" Courses:");
		for (int i = 0; i < resultlist.size(); i++) {
			System.out.println(i + 1 + "." + resultlist.get(i));
		}

	}

	public void payFee(int i) {

		int f = i;
		StudentDaoInterface ssd = new StudentDao();
		ssd.viewFee(f);
	}

	public void course() {
		// TODO Auto-generated method stub
		StudentDaoInterface ssd = new StudentDao();

		ArrayList a = new ArrayList();
		a = ssd.course();
		// return a;

	}

}
