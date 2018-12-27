package day11_SwitchStatement;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input your grade");

		char grade = input.next().charAt(0);
		
		switch (grade) {
		
		case 'A' : 
			System.out.println("Excellent");
			break;
		case 'B' : 
			System.out.println("GOOD");
			break;
		case 'C' : 
			System.out.println("Acceptable");
			break;
		case 'D' : 
			System.out.println("Poor");
			break;
		default :
			System.out.println("No such grade");
			
		
		}
		
	}

}
