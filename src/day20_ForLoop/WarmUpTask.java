package day20_ForLoop;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter two numbers");

		int start = scan.nextInt();

		int end = scan.nextInt();

		while (start < end) {

			System.out.println("Step" + start);

			start++;
		}
		while (end < start) {

			System.out.println("Step" + start);
			start--;
		}
		System.out.println("Please enter a word");

		String word = scan.next();
		int num = 0;

		while (num < word.length())

			System.out.println(word.charAt(num++));
//rewrite the code using substring method
	}

}
