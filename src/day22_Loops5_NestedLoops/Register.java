package day22_Loops5_NestedLoops;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the number of items you bought");
		
		int num = scan.nextInt();
		
		String items="";
		
		double totalPrice = 0;
		
		for(int n = 1; n <=num; n++) {
			
			System.out.println("What is item nr "+n+"?");
			
			String item = scan.next();
			
			System.out.println("How much is " + item + "?");
			
			double price = scan.nextDouble();
			
			items+=(item+" ");
			
			totalPrice+=price;
					
		}System.out.println("Your items: "+items);
		System.out.println("Your total price: $" +totalPrice);

	}

}
