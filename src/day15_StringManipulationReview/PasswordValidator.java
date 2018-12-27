package day15_StringManipulationReview;

import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the password");

		String pass = scan.nextLine();

		boolean hasUpper = !pass.equals(pass.toLowerCase());

		boolean hasLower = !pass.equals(pass.toLowerCase());

		boolean hasSpecial = pass.matches(".*[!@#$%^&()_+=-}{':;/?>,<].*");

		boolean hasNUmber = pass.matches(".*[0-9].*");

		if (pass.length() >= 8 && hasUpper == true && hasLower == true && hasSpecial == true && hasNUmber == true) {

			System.out.println("the password you entered is valid");
		} else {

			System.out.println("this is not a valid password");
		}

	}

}
