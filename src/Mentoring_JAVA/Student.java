package Mentoring_JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private String studentId;
	private int gradeLevel;
	private int tuitionBalance;
	private int pricePerCourse = 400;
	private String domain = "@cybertek.com";
	private String email; 
	private int id;
	private ArrayList<String> listOfCourses = new ArrayList<>();
	
	public Student(String firstName, String lastName, int gradeLevel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeLevel = gradeLevel;
		id++;
	}
	
	public void StudentId() {
		this.studentId =  gradeLevel + "" + id;
	} 
	
	public void enroll() {
		do {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter courses to enroll: ");
		String course = scan.nextLine();
		
		if(!course.equals("q")) {
			listOfCourses.add(course);
			tuitionBalance+=pricePerCourse;
		}
		else {
			break;
		}
		
	}while(1 !=0);

		System.out.println("Enrolled courses: ");
		System.out.println(listOfCourses);
		System.out.println("Current balance: "+ tuitionBalance);
}
	
	public void payTuition() {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter the amount to pay: ");
		int payment = scan1.nextInt();
		tuitionBalance-=payment; 
		System.out.println("Thanks for the payment of " + payment + " dollars");
		System.out.println("Your tuition balance is "+ tuitionBalance);
		System.out.println("Receipt sent to " + setMail());
		
	}
	
	public String setMail() {
		this.email = (firstName +lastName + domain).toLowerCase();
		return email;
	}
	
	
}
