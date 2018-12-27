package day6_operators_boolean;

import java.util.Scanner;

public class SpeedLimit {
	public static void main(String[] args) {
	
	int speedLimit = 55;
	
	Scanner input = new Scanner(System.in);
	System.out.println("please enter your current speed");
	int currentSpeed = input.nextInt();
	
	if (currentSpeed>=speedLimit+20) {
		
		System.out.println("you're getting a ticket asshole :))");
	} else {
		System.out.println("you can keep driving");
	}
	input.close();
	
}
}
