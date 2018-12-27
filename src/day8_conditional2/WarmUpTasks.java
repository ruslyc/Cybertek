package day8_conditional2;

import java.util.Scanner;

public class WarmUpTasks {

	public static void main(String[] args) {
		// write a program that asks a student what is their batch number,
		//if it's 10, say we are classmates, if not say something else
		
		Scanner input = new Scanner(System.in);
		
		//System.out.println("Please enter your batch number: ");
		
		//int batchNumber = input.nextInt();
		
		//if (batchNumber==10) {
			
		//	System.out.println("We are classmates!!!");
			
		//}else {
		//	System.out.println("hmmm, we're not in the same class");
		
		//int pincode = 5465;
		
		System.out.println("Please enter a number");
		
		int usersNumber = input.nextInt();
		
		if (usersNumber%2==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}input.close();
	}}