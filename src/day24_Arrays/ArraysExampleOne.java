package day24_Arrays;

public class ArraysExampleOne {
	
	public static void main(String[] args) {
		
		//declare aarays that can hold 5 items
		int[] numbers = new int[8];
		//assign values
		numbers[0] =1;
		numbers[1] =4;
		numbers[2] =6;
		numbers[3] =8;
		numbers[4] =7;
		//read from array
		System.out.println(numbers[5]);
		//Declare char array grades and assign A,B,C,D,E to it. 
		char[] grades = new char[9];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		System.out.println(grades[6]);//doesnt print anything as it was not given value
		char[]grade = new char[] {'a','b','c'}; // this way it will automatically count how many values have been stored in this array
		
		String[] cities = new String[3];
		cities[0]= "Washington";
		cities[1]= "New York";
		
	}

}
