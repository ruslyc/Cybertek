package day31_ArraysRecap;

import java.util.Arrays;
import java.util.Scanner;


public class ArraysCopyOfRange {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the size of the array: ");
		int size = scan.nextInt();

		int[] numbers = new int[size];

		System.out.println("Please enter the nnumbers of your array");

		for (int i = 0; i < size; i++) {

			numbers[i] = scan.nextInt();
		}
		System.out.println("The String value of your array is: "+ Arrays.toString(numbers));
		System.out.println("The ist half of your array is: "+ Arrays.toString(Arrays.copyOfRange(numbers, 0, numbers.length/2)));
		System.out.println("The 2nd half of your array is : "+ Arrays.toString(Arrays.copyOfRange(numbers, numbers.length/2, numbers.length)));
	}

}
