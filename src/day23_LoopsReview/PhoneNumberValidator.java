package day23_LoopsReview;

import java.util.Scanner;

public class PhoneNumberValidator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("PLease enter phone number");
		
		String phoneNumber = input.next();
		
		if (phoneNumber.startsWith("(")) {
			if(phoneNumber.length()!=12);
			System.out.println("Invalid length, must be 10 or 12 characters");
			return;
		}else {
			if(phoneNumber.length() !=10) {
				System.out.println("Invalid length, must be 10 or 12 characters");
				return;
			}
		}if(phoneNumber.charAt(0)=='(') {
			if(phoneNumber.charAt(4)!=')') {
				System.out.println("Invalid format");
				return;
			}
		}phoneNumber = phoneNumber.replace("(","");
		
		 phoneNumber = phoneNumber.replace(")","");
		 
		 for(int i=0; i<phoneNumber.length();i++) {
			if (!(phoneNumber.charAt(i)>='0' && phoneNumber.charAt(i)<='9')) {
				System.out.println("Invalid character- must be a number 0-9. "+ phoneNumber.charAt(i));
				return;
			}	
			
		 }
		 System.out.println("All numbers detected");

	}

}
