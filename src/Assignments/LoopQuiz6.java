package Assignments;

import java.util.Scanner;

public class LoopQuiz6 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a word: ");
		
	      String str1 = input.nextLine();
	        
	        String strFind1 = "dog";
	        String strFind2 = "cat";
	        int count1 = 0, fromIndex1 = 0;
	        int count2 = 0, fromIndex2 = 0;
	        
	        while ((fromIndex1 = str1.indexOf(strFind1, fromIndex1)) != -1 ){
	
	            count1++;
	            fromIndex1++;    
	        }
	        while ((fromIndex2 = str1.indexOf(strFind2, fromIndex2)) != -1 ){
	        	
	            count2++;
	            fromIndex2++;
	            
	        }
	        if(count1 == count2) {
	        	
	        	System.out.println("True");
	        	
	        }else {
	        	
	        	System.out.println("False");
	        }
	}

}
