package day20_ForLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Random random = new Random();

		System.out.println(random.nextInt(98));
		int guessedNumber;
		int secretNumber = random.nextInt(10);
		int iTries=0;
		do {
			System.out.println("Guess the number");
			guessedNumber = input.nextInt();
			iTries++;

			if (guessedNumber == secretNumber) {
				System.out.println("Congrats, you won!");
			} else if(guessedNumber>secretNumber) {
				System.out.println("Too Large");
			} else {
				System.out.println("Too slow");
			}
			if (iTries==5){
				System.out.println("You Lost");
				System.out.println("Secret number is "+ secretNumber);
				break;
			}
		} while (secretNumber != guessedNumber&&iTries<5);

	}

}
