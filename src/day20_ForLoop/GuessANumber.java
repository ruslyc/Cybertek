package day20_ForLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Random random = new Random();

		System.out.println(random.nextInt(98));
		int guessedNumber;
		int secretNumber = random.nextInt(10);

		do {
			System.out.println("Guess the number");
			guessedNumber = input.nextInt();

			if (guessedNumber == secretNumber) {
				System.out.println("Congrats, you won!");
			} else {
				System.out.println("incorrect answer, try again!");
			}
		} while (secretNumber != guessedNumber);

	}

}
