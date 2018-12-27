package day11_SwitchStatement;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("PLease input the day number");
		
		String classAtSchool="";
		
		String weekdayName="";
		
		int day = scan.nextInt();
		
		if (day==1) {
			classAtSchool = "Group Project";
			weekdayName = "Monday";
			
		}else if(day==2) {
			classAtSchool = "Java";
			weekdayName = "Tuesday";
			
		}else if(day==3) {
			classAtSchool = "Java";
			weekdayName = "Wednesday";
			
		}else if(day==4) {
			classAtSchool = "Testing";
			weekdayName = "Thursday";
			
		}else if(day==5) {
			classAtSchool = "NO";
			weekdayName = "Monday";
			
		}else if(day==6) {
			classAtSchool = "Java";
			weekdayName = "Saturday";
			
		}else if(day==7) {
			classAtSchool = "Java";
			weekdayName = "Sunday";
			
		}System.out.println("It is "+ weekdayName + " and we have " + classAtSchool+" class." );
		
		switch (day) {
		
		case 1 :
			classAtSchool = "Group Project";
			weekdayName = "Monday";
			break;
		case 2 : 
			classAtSchool = "Java";
			weekdayName = "Tuesday";
			break;
		case 3 :
			classAtSchool = "Java";
			weekdayName = "Wednesday";
			break;
		case 4 :
			classAtSchool = "Testing";
			weekdayName = "Thursday";
			break;
		case 5 :
			classAtSchool = "NO";
			weekdayName = "Monday";
		case 6 :
			classAtSchool = "Java";
			weekdayName = "Saturday";
			break;
		case 7 :
			classAtSchool = "Java";
			weekdayName = "Sunday";
			break;
			
		} System.out.println("It is "+ weekdayName + " and we have " + classAtSchool+" class." );
		

	}

}
