package day17_ReviewSessionTwo;

import java.util.Scanner;

public class Strings02 {

	public static void main(String[] args) {

		// create 1 string variable
		// if first and last chars are the same print " first same"
		// if second from the end and second are same, print "second same'
		// test if anly word has more or 4 characters
		Scanner scan = new Scanner(System.in);

		System.out.println("please enter the word");

		String word = scan.next();
		if(word.length()>=4) {
			if (word.charAt(0) == word.charAt(word.length() - 1)) {
			System.out.println("first same");}  
			if (word.charAt(1) == word.charAt(word.length() - 2)) {
			System.out.println("second same");
		}}else {
			System.out.println("not enough characters");
		}

	}

}
