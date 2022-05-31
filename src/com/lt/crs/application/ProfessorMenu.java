/**
 * 
 */
package com.lt.crs.application;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * @author admin
 *
 */
public class ProfessorMenu {

	/**
	 * @param args
	 */
	// This method is written to verify Professor username and password
	public static void professorLogin() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER login Id :");
		String LoginId = sc.nextLine();
		System.out.println("ENTER Password :");
		String Password = sc.nextLine();
		if (LoginId.equals("professor") && Password.equals("professor")) {
			professorMainMenu();
		} else {
			System.out.println("Wrong Credentials Please Try Again.\n");
			CRSApplication.home();
		}

	}

	// This method is written to display Professor menu
	private static void professorMainMenu() {
		Scanner sc = new Scanner(System.in);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Welcome Professor ");
		System.out.println("Professor logged in successfully  : " + localDateTime);

		System.out.println("\n1. Add Grades");
		System.out.println("2. View Enrolled Students");
		System.out.println("3. Courses to teach");
		System.out.println("4. Exit \n");

		System.out.println("select an Option :");
		int option = sc.nextInt();
		switch (option) {
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;
		case 4:
			CRSApplication.home();
			break;
		default:
			CRSApplication.home();

		}

	}

}
