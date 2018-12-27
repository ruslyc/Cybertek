package Assignments;

import java.util.Scanner;

public class LoopQuiz4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num=0;
		do {
			System.out.println("Please enter the month's number");
			num = input.nextInt();
		}while(num>=1&&num<=12);
		
		System.out.println("You entered an incorrect number");
	}
	

}
