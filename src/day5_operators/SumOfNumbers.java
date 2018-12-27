package day5_operators;
import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		/*
		 * Write a program that asks user to enter 3 numbers from the keyboard
		 *  and calculates the sum of those numbers then show results/
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.println("Sum is " +sum);
		
		scan.close();				
		
		
	}

}
