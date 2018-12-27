package day15_StringManipulationReview;

import java.util.Scanner;
 														// CTRL+SHIFT+F = arrange the code in the page
public class DuplicateIt {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter first word:");

		String word1 = input.nextLine();

		System.out.println("Please enter the second word:");

		String word2 = input.nextLine();

		System.out.println(word1 + word2 + word2 + word1);

		System.out.println(word1.concat(word2).concat(word2).concat(word1));

		if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {
		}

		System.out.println(word1 + word2.substring(1, word2.length()));

	}

}
