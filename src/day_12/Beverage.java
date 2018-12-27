package day_12;

import java.util.Scanner;

public class Beverage {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String drink;
		
		System.out.println("pleas select the beverage");
		
		drink = input.nextLine();
		
		double price;
		
		switch (drink) {
		
		case "tea":
			
			System.out.println("the price of your beverage is 2 dollars");
		
			break;
		
		case "coffee":
			
			System.out.println("the price of your beverage is 5 dollars");
			
			break;
			
		case "juice" :
			
			System.out.println("the price of your beverage is 3 dollars");
			
			break;
			
		case "water" :
			
			System.out.println("water is free");
			
			break;
			
		default :
			
			System.out.println("there's no such beverage in stock");
		
			break;
		

	}

}}
