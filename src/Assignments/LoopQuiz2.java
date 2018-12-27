package Assignments;

import java.util.Scanner;

public class LoopQuiz2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int max = 0;
		int sum = 0;
		for(int i =1; i<=3; i++) {
			System.out.println("Please enter a number");
			int num = input.nextInt();
			if(num>max) {
				max=num;
			}sum+=num;
		}System.out.println("max number is "+ max + '\n'+ "sum is "+ sum);
	}

}
