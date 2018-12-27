package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayUserInput {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the size of the group");

		int size = scan.nextInt();

		scan.nextLine();

		String[] names = new String[size];

		System.out.println("Please enter the names of group memebers");

		for (int i = 0; i < size; i++) {

			names[i] = scan.nextLine();
		}
		System.out.println("Group members:\n " + Arrays.toString(names));

		printStudentNameA(names);
		firstLetterSelectName(names, 'I');
	}

	public static void printStudentNameA(String[] names) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].charAt(0) == ('A') || names[i].charAt(0) == ('a')) {
				System.out.println(names[i]);
			}
		}

	}
	public static void firstLetterSelectName (String[] names, char j) {
		boolean flag = true;
		for(int n = 0; n< names.length; n++) {
			if(names[n].charAt(0) == j) {
				System.out.println(names[n]);
				flag = false;
				return;
			}
	}if (flag = true) {
		System.out.println("No such names!");
	}
		
	}
	
}
