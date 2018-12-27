package day30_CustomMethodCreation;

import java.util.Scanner;

public class Amazon {

	public static void main(String[] args) {
		
		System.out.println("This is the Amazon application");
		System.out.println("Please login");
		System.out.println("username");
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		System.out.println("password: ");
		String pass = sc.nextLine();
		System.out.println("\n\nEnd of Amazon program");
		userWelcome(username);
	}
	public static void userWelcome(String user) {
		System.out.println("welcome "+ user + "!!!");
	}
}
