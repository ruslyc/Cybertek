package Assignments;

import java.util.Scanner;

public class FindLongestWordInArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  System.out.println("Please enter the word");
		  words[i] = input.nextLine();
		  
		}
		
		//write your code below
		String max = "";
		for(int j =0; j<words.length;j++){
		  if(words[j].length()>max.length()){
			  max=words[j];
		  }
		
	}System.out.println(max);

	}
	}
