package day_9;

import java.util.Scanner;

public class CreditScore {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter your score");
		
		int creditScore = input.nextInt();
		String creditStatus;
		int percentage;
		
		
		if (creditScore>=300&&creditScore<=579) {
			creditStatus = "Very poor";
			percentage = 16;
		}else if (creditScore>=580&&creditScore<=669) {
			creditStatus = "Fair";
			percentage = 18;
		}else if (creditScore>=670&&creditScore<=739) {
			creditStatus = "Good";
			percentage = 21;
		}else if(creditScore>=740&&creditScore<=799) {
			creditStatus = "Very Good";
			percentage = 25;
		}else if(creditScore>=800&&creditScore<=850) {
			creditStatus = "Exceptional";
			percentage = 20;
		}else if(creditScore>850||creditScore<0) {
			creditStatus = "Invalid score";
			percentage = 0;
		}else {
			creditStatus = "Bad credit";
		}		percentage=0;
		System.out.println("Credit status is: "+ creditStatus + " you belong to " + percentage+  "% of americans");

	}

}
