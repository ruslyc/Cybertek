package day6_operators_boolean;

import java.util.Scanner;

public class day7_conditionals {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("USD Amount: ");
		
		double dollars = scan.nextDouble();
		
		double usd2eurosExchangerate = 0.86;
		
		double euros = dollars*usd2eurosExchangerate;
		
		
		System.out.println(dollars+" USD= " + euros + " euros");
				
		
		System.out.println("");
		scan.close();
		
	}

}
