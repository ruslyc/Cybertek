package Assignments;

import java.util.Scanner;

public class LoopQuiz5 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter first number: ");

		int num1 = input.nextInt();

		System.out.println("Please enter the second number: ");

		int num2 = input.nextInt();

		int lcm = (num1 > num2) ? num1 : num2;

		boolean b = true;

		while (b) {

			if (lcm % num1 == 0 && lcm % num2 == 0) {

				System.out.println("Lowest common multiplier of your numbers is: " + lcm);
				break;
			}
			lcm++;
		}
	}

}
