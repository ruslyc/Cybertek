package Assignments;

import java.util.Arrays;

public class TwoDArrayMultiplicationTable {
	public static void main(String[] args) {
		
		int [][] multiplicationTable = new int[10][10];
	    
	    for(int rows =0; rows<multiplicationTable.length; rows++){
	      for(int columns =0; columns<multiplicationTable.length; columns++){
	        multiplicationTable[rows][columns] = (rows+1)*(columns+1);
	      }
	    }
	    System.out.println(Arrays.deepToString(multiplicationTable) ) ;
	}

}
