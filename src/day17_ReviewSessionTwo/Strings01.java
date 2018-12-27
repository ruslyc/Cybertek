package day17_ReviewSessionTwo;

public class Strings01 {

	public static void main(String[] args) {
		// String is a combination of chars
		
		String greeting = "Hello World!";
		//print out the number of characters
		System.out.println(greeting.length());
		int len = greeting.length();
		System.out.println(greeting.charAt(0));
		char firstChar = greeting.charAt(0);
		//print the last character
		System.out.println(greeting.charAt(len-1));
		char lastCh = greeting.charAt(greeting.length()-1);
		
	}

}
