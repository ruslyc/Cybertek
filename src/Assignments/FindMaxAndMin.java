package Assignments;

import java.util.Scanner;

public class FindMaxAndMin {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String answer;

		int number;

		int maxNum = Integer.MIN_VALUE;

		int minNum =Integer.MAX_VALUE;

		do {

			System.out.println("Enter any number");

			number = input.nextInt();

			System.out.println("Do you want to continue y/n?");

			answer = input.next();

			if (number > maxNum) {

				maxNum = number;
			}

			if (number < minNum) {

				minNum = number;
			}

		} while (answer.equalsIgnoreCase("y"));

		System.out.println("Maximum number: " + maxNum);

		System.out.println("Minimum number: " + minNum);

	}

}
