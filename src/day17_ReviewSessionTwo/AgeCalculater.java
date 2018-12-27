package day17_ReviewSessionTwo;

import java.util.Scanner;

public class AgeCalculater {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the age in months:");

		double age = input.nextDouble();

		if (age > 0 && age < 1) {

			System.out.println(" this is a newborn");

		} else if (age >= 1 && age < 12) {

			System.out.println(age + " months old infant");

		} else if (age >= 12 && age < 36) {

			System.out.println(age + " months old toddler");

		} else if (age >= 36 && age < 72) {

			System.out.println(age + " months old Pre-school child");

		} else if (age >= 72 && age < 156) {

			System.out.println(age + " months old School-age child");

		} else if (age >= 156 && age < 228) {

			System.out.println(age + " months old Adolescent");

		} else if (age >= 228 && age < 480) {

			System.out.println(age + " months old Young Adult");

		} else if (age >= 480 && age < 780) {

			System.out.println(age + " months old Middle Age Adult");

		} else if (age >= 780 && age < 1200) {

			System.out.println(age + " months old Older Adult");

		} else if (age >= 1200) {

			System.out.println("You are a SUPERMAN!!!");

		} else {

			System.out.println("Invalid entry");
		}

	}	

}
