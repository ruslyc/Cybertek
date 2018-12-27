package day15_StringManipulationReview;

import java.util.Scanner;

public class MiddleOne {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("please enter a word");

		String word = scan.nextLine();

		if (word.length() % 2 == 1 && word.length() >= 3) {

			System.out.println(word.charAt(word.length() / 2));
		}
	}

}
