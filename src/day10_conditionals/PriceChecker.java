package day10_conditionals;

import java.util.Scanner;

public class PriceChecker {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int item = scan.nextInt();
		String status;
		if (item>=1&&item<=50) {
			status="Cheap";
		}else if (item>=51&&item<=100) {
			status="Expensive";
		}else {
				status="Not buying";
			}System.out.println(status);
			
			// It can be done --->  status = (item>=1&&item<=50) ? "Cheap" :  (item>=51&&item<=100) ? "Expensive" : "Not buying";
			// but not advised
		}
		
	
}

