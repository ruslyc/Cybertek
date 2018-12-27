package day4_operators;

import java.util.Scanner;
//bring Scanner class code so it can be used in this program
//ask user to enter currentYear value as well
//calculate the age and print the result

public class AgeCalculatorWithScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year of birth:");
		// let user to enter an int number during execution
		int yearOfBirth = scan.nextInt();

		// System.out.println("Year of birth is " + yearOfBirth );
		System.out.println("Enter current year: ");
		int currentYear = scan.nextInt();
		int age = currentYear - yearOfBirth;
		System.out.println("Your age is " + age);
		scan.close();

	}

}