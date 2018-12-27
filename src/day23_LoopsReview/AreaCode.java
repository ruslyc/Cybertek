package day23_LoopsReview;

import java.util.Scanner;

public class AreaCode {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the phone number:");

		String phoneNumber = input.next();

		String areaCode = "";

		if (phoneNumber.startsWith("(")) {
			areaCode = phoneNumber.substring(1, 4);
		} else {
			areaCode = phoneNumber.substring(0, 3);
		}

		System.out.println(areaCode);

		String state;

		switch (areaCode) {

		case "202":
			state = "Washington DC";
			break;
		case "703":
			state = "Virginia";
			break;
		case "209":
			state = "California";
			break;
		case "312":
			state = "Illinois";
			break;
		case "347":
			state = "New York";
			break;
		default: //If put on top it needs to be followed by break, at the bottom its not needed.
			state = "Not in the data base";

		}System.out.println(state);

	}

}
