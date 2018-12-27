package day21_forLoops;

import java.util.Scanner;

public class Neighbours {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter your word");
		
		String word = input.next();
		
		for (int idx=0; idx<word.length()-1;idx++) {
			
			if( word.charAt(idx)==word.charAt(idx+1)){
				
				System.out.println("baaap -"+ word.charAt(idx));
			}
		}
	}

}
