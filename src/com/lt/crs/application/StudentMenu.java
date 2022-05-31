/**
 * 
 */
package com.lt.crs.application;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.lt.crs.service.StudentService;
import com.lt.crs.service.StudentServiceInterface;

/**
 * @author admin
 *
 */
public class StudentMenu {

	/**
	 * @param args
	 */
	// This method is written to verify Student username and password
	public static void studentLogin() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER login Id :");
		String LoginId = sc.nextLine();
		System.out.println("ENTER Password :");
		String Password = sc.nextLine();
		if (LoginId.equals("student") && Password.equals("student")) {
			studentMainMenu();
		} else {
			System.out.println("Wrong Credentials Please Try Again.\n");
			CRSApplication.home();
		}

	}

	// This method is written to display Student menu
	private static void studentMainMenu() {
		Scanner sc = new Scanner(System.in);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Welcome Student ");
		System.out.println("Student logged in successfully  : " + localDateTime);

		System.out.println("\n1. View Catalog");
		System.out.println("2. Course Registration");
		System.out.println("3. Add Course");
		System.out.println("4. Drop Course");
		System.out.println("5. View Grades");
		System.out.println("6. Pay Fee");
		System.out.println("7. Exit \n");

		System.out.println("Enter Student Id :");
		int studentId = sc.nextInt();
		System.out.println("select an Option :");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			StudentServiceInterface ssc = new StudentService();
			ssc.viewCatalog();
			System.out.println("Please select the Course\n");
			int inp = sc.nextInt();
			ssc.registerCourse(inp);

			break;

		case 2:
			StudentServiceInterface ssc1 = new StudentService();
			ssc1.viewreportcard(studentId);
			break;

		case 3:
			StudentServiceInterface ssc2 = new StudentService();
			ssc2.viewCatalog();
			break;

		case 4:
			StudentServiceInterface ssc3 = new StudentService();
			ssc3.course();
			break;

		case 5:
			StudentServiceInterface ssc4 = new StudentService();
			ssc4.payFee(studentId);
			break;

		case 6:
			break;
		case 7:
			CRSApplication.home();
			break;
		default:
			CRSApplication.home();

		}

	}

}
