package day31_ArraysRecap;

import java.util.Arrays;

public class MultiDimensionalArrayExample {
	public static void main(String[] args) {
		
		int [][] numbers = {{1,2,3,4,7},
							{5,6,7,8,3},
							{4,5,7,3,6},
							{9,0,4,5,8}};
		
		int [][] numbers1 = {{1,2,3,4,7},
							{5,6,7,8,3},
							{4,5,7,3,6},
							{9,0,4,5,8}};
		
		for(int row = 0; row<numbers.length; row++) {
			for(int col =0; col<numbers[row].length; col++) {
				System.out.print(numbers[row][col]+"\t");
			}
			System.out.println();
		}
		getCoord(numbers,2,3);
		printOut2DArray(numbers, numbers1);
	}
	public static void getCoord(int [][] arr, int row, int col) {
		System.out.println("The element at the row number "+ row + " column number "+ col + " is :" + arr[row][col]);
	}
	
	public static void printOut2DArray(int[][] numbers, int[][] numbers1) {
		System.out.println("This is the first array");
		for(int row = 0; row<numbers.length; row++) {
			for(int col =0; col<numbers[row].length; col++) {
				System.out.print(numbers[row][col]+"\t");
			}
			System.out.println();
	}
		System.out.println("This is the second array");
		for(int row = 0; row<numbers1.length; row++) {
			for(int col =0; col<numbers1[row].length; col++) {
				System.out.print(numbers1[row][col]+"\t");
			}
			System.out.println();
	}
}
}