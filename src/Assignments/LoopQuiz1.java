package Assignments;

import java.util.Scanner; 

public class LoopQuiz1 {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter any number");
		
		int n = input.nextInt();
		
		for(int i=1; i<=10;i++) {
			System.out.println(n +" x " + i +" = "+ (n*i));
		}
	}

}
