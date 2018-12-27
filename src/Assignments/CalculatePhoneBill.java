package Assignments;

import java.util.Scanner;

public class CalculatePhoneBill {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Please enter the number of calls");
			
			int numberOfCalls = input.nextInt();
			
			double defaultPrice = 200;
			
			double perCallPrice = 0;
			
			double finalPrice = 0;
			
			if(numberOfCalls>0&&numberOfCalls<=100) {
				
				finalPrice = defaultPrice;
			
			}else if(numberOfCalls>100&&numberOfCalls<=150) {
				
				perCallPrice = 0.6;
				
				finalPrice = 200 + (numberOfCalls - 100)*0.6;
				
			}else if(numberOfCalls>1500&&numberOfCalls<=200) {
				
				perCallPrice = 0.5;
				
				finalPrice = 200 + (numberOfCalls - 100)*0.5;
				
			}else if(numberOfCalls>200) {
				
				perCallPrice = 0.4;
				
				finalPrice =  200 + (numberOfCalls - 100)*0.4;
				
			}else {
				
				System.out.println("Invalid entry");
				
			}System.out.println("Your bill is: " + finalPrice +"$");
		}
}
