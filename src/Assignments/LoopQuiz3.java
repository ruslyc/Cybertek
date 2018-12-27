package Assignments;

import java.util.Scanner;

public class LoopQuiz3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a word");
		
		String word = input.nextLine();
		
		for(int i = 0; i<word.length(); i++) {
			
			System.out.print(word.substring(i, i+1)+word.substring(i, i+1));
		}
	}

}
