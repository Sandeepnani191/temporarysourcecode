/**
 * 
 */
package com.lt.crs.application;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.lt.crs.bean.Admin;
import com.lt.crs.bean.Course;
import com.lt.crs.exception.CourseNotFoundException;
import com.lt.crs.exception.GradeNotWithinRangeException;
import com.lt.crs.service.AdminService;
import com.lt.crs.service.AdminServiceInterface;
import com.lt.crs.service.CatalogService;
import com.lt.crs.service.CatalogServiceInterface;
import com.lt.crs.service.StudentService;
import com.lt.crs.service.StudentServiceInterface;

/**
 * @author admin
 *
 */
public class AdminMenu {

	/**
	 * @param args
	 */
	static CRSApplication crsApp = new CRSApplication();

	// This method is written to verify Admin username and password
	public static void adminLogin() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER login Id :");
		String LoginId = sc.nextLine();
		System.out.println("ENTER Password :");
		String Password = sc.nextLine();
		if (LoginId.equals("admin") && Password.equals("admin")) {
			adminMainMenu();
		} else {
			System.out.println("Wrong Credentials Please Try Again.\n");
			crsApp.home();
		}

	}

	// This method is written to display Admin menu
	public static void adminMainMenu() {
		try {
			Scanner sc = new Scanner(System.in);
			LocalDateTime localDateTime = LocalDateTime.now();
			System.out.println("Welcome Admin ");
			System.out.println("Admin logged in successfully  : " + localDateTime);

			System.out.println("\n1. Add Course");
			System.out.println("2. Remove Course");
			System.out.println("3. Add Professor");
			System.out.println("4. Approve Student Registration");
			System.out.println("5. Generate Report Card");
			System.out.println("6. Exit \n");

			System.out.println("select an Option :");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				addCourse();
				break;
			case 2:
				removeCourse();
				break;
			case 3:
				addProfessor();
				break;
			case 4:
				approveStudentRegistration();
				break;
			case 5:
				generateReportCard();
				break;
			case 6:
				crsApp.home();
				break;
			default:
				crsApp.home();

			}
		} catch (GradeNotWithinRangeException ex) {
			System.out.println("Caught the exception");

			// printing the message from GradeNotWithinRangeException object
			System.out.println("Exception occured: " + ex);
		}
		finally {
			System.out.println("Return back to menu and enter a valid marks.\n" );
			adminMainMenu();
		}
	}

	// This method is written to display the options after user selects add course
	// menu
	public static void addCourse() {
		List<Course> newcourseList = null;
		// TODO Auto-generated method stub
		System.out.println("Currently Availble Courses: \n");
		CatalogServiceInterface catalogService = new CatalogService();
		List<Course> courseList = catalogService.viewCourseDetails();
		courseList.forEach(System.out::println);

		System.out.println("\n1.Add Course");
		System.out.println("2.Admin Main Menu");
		Scanner sc = new Scanner(System.in);
		int option = Integer.parseInt(sc.nextLine());
		switch (option) {
		case 1:
			System.out.print("Enter the Course Code to Add:");
			String CourseCd = sc.nextLine();
			System.out.print("Enter the Course Name to Add:");
			String CourseName = sc.nextLine();
			System.out.print("Enter the instructor name:");
			String instructor = sc.nextLine();

			if (CourseName != "" && CourseName != null && CourseCd != "" && CourseCd != null && instructor != ""
					&& instructor != null) {
				Course course = new Course();
				course.setCourseCode(CourseCd);
				course.setName(CourseName);
				course.setOffered(true);
				course.setInstructor(instructor);

				newcourseList = catalogService.addCourse(course);
			}
			System.out.println("Course Added sucessfully");

			System.out.println("\n Courses avaible after adding the course \n");

			newcourseList.forEach(name -> System.out.println(name));
			System.out.println();
			adminMainMenu();
			break;
		case 2:
			adminMainMenu();
			;

		}

	}

	// This method is written to display the options after user selects remove
	// course menu
	public static void removeCourse() {
		try {
			// TODO Auto-generated method stub
			List<Course> newcourseList = null;
			System.out.println("Currently Availble Courses: ");
			CatalogServiceInterface catalogService = new CatalogService();
			List<Course> courseList = catalogService.viewCourseDetails();
//		for (Object courses : courseList) {
//			System.out.println(courses);
//		}
			courseList.forEach(System.out::println);

			System.out.println("\n1.Remove Course");
			System.out.println("2.Admin Main Menu");
			Scanner sc = new Scanner(System.in);
			int option = Integer.parseInt(sc.nextLine());
			switch (option) {
			case 1:
				System.out.print("Enter the CourseName to Remove:");
				String CourseName = sc.nextLine();

				if (CourseName != "" && CourseName != null) {
					newcourseList = catalogService.deleteCourse(CourseName);
				}
				System.out.println("Course Removed sucessfully");

				System.out.println("\n Courses avaible after Removing the course \n");

				newcourseList.forEach(name -> System.out.println(name));

				System.out.println();
				adminMainMenu();
				break;
			case 2:
				adminMainMenu();
				;

			}
		} catch (CourseNotFoundException ex) {
			System.out.println("Caught the exception");

			// printing the message from InvalidAgeException object
			System.out.println("Exception occured: " + ex);
		}
		finally {
			System.out.println("Return back to menu and enter a valid course name.\n" );
			adminMainMenu();
		}
	}

	// This method is to add the professor
	public static void addProfessor() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Department :");
		String department = sc.nextLine();
		System.out.println("Enter Designation :");
		String designation = sc.nextLine();
		Admin admin = new Admin();
		admin.setDepartment(department);
		admin.setDesignation(designation);
		AdminServiceInterface adminService = new AdminService();
		adminService.addProfessor(admin);
		adminMainMenu();
	}

	// This method is to allow admin to approve the student registration
	public static void approveStudentRegistration() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		StudentServiceInterface ssc = new StudentService();
		System.out.println("Please select the Student Id to register for the course.\n");

		int inp = sc.nextInt();
//			ssc.viewCatalog();

		if (inp == 1 || inp == 2 || inp == 3 || inp == 4) {
			ssc.registerCourse(inp);
		} else {
			System.out.println("Cannot register to this course under this course.");
		}

	}

	// This method is ritten to generate the grade of a student based on marks .
	public static void generateReportCard() throws GradeNotWithinRangeException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Student Id to generate report card.\n");
		int studentId = sc.nextInt();
		System.out.println("Enter the marks for below courses.\n");
		System.out.println("1.Physics\n2.Chemistry\n3.Maths\n4.English");
		int sum = 0;
		String grade = "";
		int[] marks = new int[4];
		for (int i = 0; i < 4; i++) {
			marks[i] = sc.nextInt();
			sum = sum + marks[i];
		}

		int mean = sum / 4;
		if (mean >= 80) {
			grade = "A";
		} else if (mean < 80 && mean >= 60) {
			grade = "B";
		} else if (mean < 60 && mean >= 40) {
			grade = "C";
		} else {
			grade = "D";
		}
		if (mean < 100) {
			System.out.println("Grade for Student Id " + studentId + " is " + grade);
		} else {
			throw new GradeNotWithinRangeException("Grade is not within the range of 100.");
		}
	}

}
