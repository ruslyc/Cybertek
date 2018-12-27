package day33;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimStringArrayUserInput {
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(userInputGroups()));

	}

	public static String[][] userInputGroups() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of groups: ");
		int groups = scan.nextInt();
		String[][] students = new String[groups][];
		for (int i = 0; i < groups; i++) {
			System.out.println("Please enter the number of members for group " + (i+1));
			int size = scan.nextInt();
			scan.nextLine();
			students[i] = new String[size];
			for (int j = 0; j < size; j++) {
				System.out.println("Please enter the name of student " + (j+1) + " of group " + (i+1));
				String name = scan.nextLine();
				students[i][j] = name;
			}

		}
		return students;
	}
}
