package Assignments; // This is the assignment for the group The Engineers from Chicago Campus; Ruslan Chiaburu, 
					//Ermek Zhusupov, Eldar Kafarov, Alex Burdeinyi, Aidarova Bermet and Fiona Stanes.

import java.util.Scanner;

public class SaleWithDiscount {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the unit price");
		
		double unitPrice = input.nextDouble();
		
		System.out.println("Please enter the quantity");
		
		double quantity = input.nextDouble();
		
		double grandTotal, discountApplied, total;
		
		grandTotal = unitPrice*quantity;
		
		if(quantity>=100&&quantity<=120) {
			
			total = grandTotal*0.9;
			
			discountApplied = grandTotal*0.1;
			
			System.out.println(" Grand Total "+ grandTotal + "\n Discount 10%" + "\n Discount applied " + discountApplied + "\n Total " + total );
		
		}else if(quantity > 120) {
			
			total = grandTotal*0.85;
			
			discountApplied = grandTotal*0.15;
			
			System.out.println(" Grand Total "+ grandTotal + "\n Discount 15%" + "\n Discount applied " + discountApplied + "\n Total " + total );
		
		}else if(quantity>0&&quantity<100) {
			
			total=grandTotal;
					
			discountApplied=0;
			
			System.out.println(" Grand Total "+ grandTotal + "\n Discount 0%" + "\n Discount applied " + discountApplied + "\n Total " + total );
		
		}else {
			
			System.out.println("Invalid entry");
		}
		
	}

}
