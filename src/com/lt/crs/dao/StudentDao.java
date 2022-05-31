package com.lt.crs.dao;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDao implements StudentDaoInterface {
	public void registerCourse(int inp) {

		if (inp == 1) {
			System.out.println("Successfully Registered for Java Course");
		} else if (inp == 2) {
			System.out.println("Successfully Registered for Python Course");
		} else if (inp == 3) {
			System.out.println("Successfully Registered for Big data Course");
		} else if (inp == 4) {
			System.out.println("Successfully Registered for Cloud Course");
		}

	}

	public void viewreportcard(int i) {

		if (i == 10) {
			System.out.println("Grades : ");
			System.out.println("Java - A");
			System.out.println("Python - B");
			System.out.println("Big data - A+");
			System.out.println("Cloud - A");
		} else if (i == 1) {
			System.out.println("Grades : ");
			System.out.println("Java - B");
			System.out.println("Python - C");
			System.out.println("Big data - A+");
			System.out.println("Cloud - A");
		} else if (i == 2) {
			System.out.println("Grades : ");
			System.out.println("Java - A");
			System.out.println("Python - C");
			System.out.println("Big data - A+");
			System.out.println("Cloud - B+");
		} else if (i == 3) {
			System.out.println("Grades : ");
			System.out.println("Java - C");
			System.out.println("Python - C");
			System.out.println("Big data - C");
			System.out.println("Cloud - D");
		} else if (i == 4) {
			System.out.println("Grades : ");
			System.out.println("Java - A");
			System.out.println("Python - C");
			System.out.println("Big data - B");
			System.out.println("Cloud - D");
		}
	}

	public ArrayList viewCatalog() {

		ArrayList datalist = new ArrayList();

		datalist.add("Java");
		datalist.add("Python");
		datalist.add("Big data");
		datalist.add("Cloud");

		return datalist;
	}

	public ArrayList course() {
		ArrayList c = new ArrayList();
		viewCatalog();

		System.out.println("If you want to add course, press 1");

		System.out.println("If you want to  delete course, press 2");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		while (choice == 1) {

			System.out.println("1. Enter 1 to add Java");
			System.out.println("2. Enter 2 to add Python");
			System.out.println("3. Enter 3 to add Big Data");
			System.out.println("4. Enter 4 to add Cloud");
			System.out.println("5. Enter 5 to see the list of Courses added");
			System.out.println("6. Enter 6 to go back");

			int course = sc.nextInt();
			if (course == 1) {
				c.add("Java");
				System.out.println("Java added successfully ");

			}
			if (course == 2) {
				c.add("Python");
				System.out.println("Python added successfully ");

			}
			if (course == 3) {
				c.add("Big Data");
				System.out.println("Big Data  added successfully ");

			}
			if (course == 4) {
				c.add("Cloud");
				System.out.println("Cloud added successfully ");

			}
			if (course == 5) {
				System.out.println(c);
			}
			if (course == 6) {
				break;
			}
		}

		while (choice == 2) {
			System.out.println("If you want to remove Java course, press 1");
			System.out.println("If you want to remove Python course, press 2");
			System.out.println("If you want to remove Big Data course, press 3");
			System.out.println("If you want to remove Cloud course, press 4");
			System.out.println("If you want to see the current courses, press 5");
			System.out.println("If you want to exit, press 6");

			int course = sc.nextInt();

			if (course == 1) {
				c.remove("Java");
				System.out.println("Java removed successfully ");
			}
			if (course == 2) {
				c.remove("Python");
				System.out.println("Python removed successfully");
			}
			if (course == 3) {
				c.remove("Big Data");
				System.out.println("Big Data added successfully ");
			}
			if (course == 4) {
				c.remove("Cloud");
				System.out.println("Cloud removed successfully ");
			}

			if (course == 5) {
				System.out.println(c);
			}
			if (course == 6) {
				break;
			}
			// System.out.println(" Courses : "+c);

		}
		return c;

	}

	public void viewFee(int f) {
		if (f == 10) {
			System.out.println("Fee which has been payed: Rs.0");
			System.out.println("Total Fee to be payed : Rs.1,00,000");

		}

		else if (f == 1)

		{

			System.out.println("Fee which has been payed: Rs.80,000");
			System.out.println("Total Fee to be payed : Rs.20,000");
		} else if (f == 2)

		{

			System.out.println("Fee which has been payed: Rs.65,000");
			System.out.println("Total Fee to be payed : Rs.35,000");
		}

		else if (f == 3)

		{

			System.out.println("Fee which has been payed: Rs.90,000");
			System.out.println("Total Fee to be payed : Rs.10,000");
		}

		else if (f == 4)

		{

			System.out.println("Fee which has been payed: Rs.70,000");
			System.out.println("Total Fee to be payed : Rs.30,000");
		}
		System.out.println("Press 1 to pay the Fee");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		if (input == 1) {

			System.out.println("Select the payment methods:\n1.Credit/Debit Card\n2.UPI\n3.Bank Transfer");
			int p = sc.nextInt();
			if (p == 1) {
				System.out.println("Enter Card Details");
				System.out.println("Enter Card Number: ");
				int cn = sc.nextInt();
				System.out.println("Enter the expiry in mmyy format: ");
				int cm = sc.nextInt();
				System.out.println("Enter CVV: ");
				int cv = sc.nextInt();

			}
			if (p == 2) {
				System.out.println("Enter UPI ID");
				int upi = sc.nextInt();
			}

			if (p == 3) {
				System.out.println("Enter the bank account details:");
				int b = sc.nextInt();
			}
			payFee();
		}
	}

	public void payFee() {
		System.out.println("The Fee has been payed");
	}

}
