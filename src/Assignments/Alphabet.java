package Assignments;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter a letter:");
		
		String character = input.next();
		//654654645
		String letter = character.toLowerCase();
		
		String vovels = "a, e, i, o, u, y";
		
		String consonants = "b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, v, w, x, z";
		
		if(vovels.contains(letter)) {
			System.out.println(letter +" is a vovel");
		
		}else if(consonants.contains(letter)) {
			System.out.println(letter +" is a consonant");
			
		}else {
			System.out.println("Invalid character");
		}
		
		
		
	}

}
