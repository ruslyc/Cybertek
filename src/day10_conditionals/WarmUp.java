package day10_conditionals;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the month's number:");
		
		int month = input.nextInt();
		
		String season = "";
		
		if (month>=1&&month<=2||month==12) {
			season = "Winter";
		}else if (month>=3&&month<=5) {
			season = "Spring";
		}else if (month>=6&&month<=8) {
			season = "Summer";
		}else if (month>=9&&month<=11) {
			season = "Fall";
		}
		System.out.println("The month number "+ month + " belongs to "+season);
;
		
	}

}
