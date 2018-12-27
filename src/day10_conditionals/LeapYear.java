package day10_conditionals;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("PLease input the desired year:");
		
		int year = input.nextInt();
		int printYear=year;
		if ((year%=400)==0) {
			System.out.println(printYear + " It's a leap year");
		}else if ((year%4)==0&&(year%100)!=0){ 
			System.out.println(printYear + " It's a leap year");
			}else {
				System.out.println(printYear + " It's not a leap year");
			}
		};
		

	}


