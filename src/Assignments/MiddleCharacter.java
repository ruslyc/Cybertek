package Assignments;

import java.util.Scanner;

public class MiddleCharacter {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter a word");
	
	String word = input.next();
	
	if (word.length()%2==1) {
		System.out.println("The middle character in the String is " + word.substring(word.length()/2, (word.length()/2)+1));
	}else {
		System.out.println("The middle character in the String is " + word.substring((word.length()/2)-1, (word.length()/2)+1));
	}
	
	
}
}
