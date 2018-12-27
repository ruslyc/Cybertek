package day21_forLoops;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a word:");

		String word = scan.next();

		String reversed = "";

		for (int index = word.length() - 1; index >= 0; index--) {

			reversed += word.charAt(index);

		}
		if (reversed.equalsIgnoreCase(word)) {

			System.out.println("Palindrome");
		} else {
			System.out.println("not palindrome");
		}
		// Task 2

		System.out.println("please enter a word");

		String word1 = scan.next().toLowerCase();

		System.out.println("please enter a character");

		char chr = scan.next().toLowerCase().charAt(0);
		int counter = 0;

		for (int idx = 0; idx < word1.length(); idx++) {

			if (word1.charAt(idx) == chr) {

				counter++;
			}
		}
		System.out.println("your word " + word1 + " contains " + chr + " " + counter + " times");

		// Task 3

		System.out.println("Please enter a word:");
		String input = scan.next();

		String unique = "";

		for (int indexA = 0; indexA <input.length() ; indexA++) {

			if (!unique.contains(input.substring(indexA, indexA+1))) {

				unique += input.substring(indexA, indexA+1);
			}
		}System.out.println(unique);

	}

}
