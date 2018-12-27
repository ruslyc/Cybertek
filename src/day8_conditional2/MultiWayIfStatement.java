package day8_conditional2;

public class MultiWayIfStatement {

	public static void main(String[] args) {
		
//		int weekday = 1;
//		
//		if (weekday==1) {
//			System.out.println("Monday");
//		}else {
//			System.out.println("it is not monday");
//		}
//		if (weekday==2) {
//			System.out.println("tuesday");
//		}else {
//			System.out.println("not tuesday");
//		}
//		if(weekday==3) {
//			System.out.println("wednesday");
//		}else {
//			System.out.println("not wednesady");
//		}

		int weekday = 1;
		
		if (weekday==1) {
			System.out.println("MOnday");
		}else if(weekday==2) {
			System.out.println("Tueday");
		}else if(weekday==3) {
			System.out.println("wednesday");
		}else if(weekday==4) {
			System.out.println("thursday");
		}else if(weekday==5) {
			System.out.println("friday");
		}else if(weekday==6) {
			System.out.println("saturday");
		}else if(weekday==7) {
			System.out.println("sunday");
		}else {
			System.out.println("invalid day. can only be 1-7");
			
		}
	}

}
