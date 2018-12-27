package day15_StringManipulationReview;

import java.util.Scanner;

public class SubstringOne {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("please enter a word:");

		String word = scan.nextLine();

		if (word.charAt(0) == 'x' && word.charAt(1) != 'x') {

			System.out.println(word.substring(1));
		}

		else if (word.charAt(1) == 'x' && word.charAt(0) != 'x') {

			System.out.println(word.charAt(0) + word.substring(2));

		} else if ((word.charAt(0) == 'x' && word.charAt(1) == 'x')) {

			System.out.println(word.substring(2));
		}
	}
}
