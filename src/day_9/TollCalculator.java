package day_9;

import java.util.Scanner;

public class TollCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//0-100 5$, 101-500 8$, 501-1000 10$, >1000 > 12$
		 System.out.println("please input the number of miles");
		int miles = input.nextInt();
		double tollCost=0;
		
		 if(miles>=0&&miles<=100) {
			tollCost=5;
		}else if(miles>=101&&miles<=500) {
			tollCost=8;
		}else if(miles>=501&&miles<=1000) {
			tollCost=10;
		}else if(miles>=1000) {
			tollCost=12;
		}else {
			System.out.println("invalid entry");
		}
		 System.out.println("For "+ miles + "miles"+ " the cost is: " + tollCost);
	}

}
