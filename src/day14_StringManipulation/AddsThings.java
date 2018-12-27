package day14_StringManipulation;

import java.util.Scanner;

public class AddsThings {

	public static void main(String[] args) {

		String domain = "@cybertekschool.edu";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your username");
		
		String entry = scan.nextLine();
		
		System.out.println("This is your new email");
		
		System.out.println(entry.concat(domain));  // concat two strings
	}

}
