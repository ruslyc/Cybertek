package day19_Loops;

import java.util.Scanner;

public class GiveMe5Dollars {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int amount;

		do {
			System.out.println("Give me 5 bucks");
			amount = input.nextInt();
		} while (amount != 5);
		System.out.println("Thanks! HI 5!");
	}
}
