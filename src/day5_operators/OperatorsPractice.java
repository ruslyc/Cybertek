package day5_operators;

import java.util.Scanner;

public class OperatorsPractice {

	public static void main(String[] args) {
		
		int apples = 5;
		
		apples +=10;
		
		int carsInLot = 23;
		
		carsInLot -=10;
		
		int pizzaSlices = 12;
		
		pizzaSlices %=5;
		
		int restOfPizza = pizzaSlices;
		
		int minutes = 100;
		
		minutes %=60;
		
		int minutesLeft = minutes;
		
		double hoursInMinutesLeft = (double)minutesLeft/60;
		
			System.out.println(apples);
			System.out.println(carsInLot);
			System.out.println(restOfPizza);
			System.out.println(minutesLeft);
			System.out.println(hoursInMinutesLeft);
			
	}

}
