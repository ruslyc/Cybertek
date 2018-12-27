package Assignments;  // This is the assignment for the group The Engineers from Chicago Campus; Ruslan Chiaburu, 
						//Ermek Zhusupov, Eldar Kafarov, Alex Burdeinyi, Aidarova Bermet and Fiona Stanes.

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the price in cents");
		
		int price = input.nextInt();
		
		int change = 100 - price;
		
		int quarters, dimes, nickels;
		
		quarters = change/25;
		
		change%=25;
		
		dimes = change/10;
		
		change%=10;
		
		nickels = change/5;
	
		if ((price%=5)==0){
		System.out.println("Your change is "+ quarters + " quarters "+ dimes+ " dimes and " + nickels + "nickels");
	}else {
		System.out.println("Not a valid price entry");
	}
		}

}
