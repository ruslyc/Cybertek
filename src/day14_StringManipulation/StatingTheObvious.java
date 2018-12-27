package day14_StringManipulation;

import java.util.Scanner;

public class StatingTheObvious {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please neter your email:");

		String entry = scan.nextLine(); // donaldtheduck@gmail.com

		// 1. find the location of @ sign
		// 2. find the location of the . sign
		// 3. substring using those two locations

		int start = entry.indexOf("@") + 1;

		int end = entry.indexOf(".");

		String mail = entry.substring(start, end);

		System.out.println(mail);

		if (mail.equals("yahoo") || mail.equals("gmail")) {

			System.out.println("Your email is valid");
		} else {
			System.out.println("Invalid email");
		}

	}
}
