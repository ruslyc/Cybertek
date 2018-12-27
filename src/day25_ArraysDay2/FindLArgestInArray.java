package day25_ArraysDay2;

import java.util.Scanner;

public class FindLArgestInArray {
	public static void main(String[] args) {
		// ask user to enter the numbers of items in the array
		Scanner input = new Scanner(System.in);

		System.out.println("How many items are in array?");

		int count = input.nextInt();
		// create array called nums with that capacity
		int[] nums = new int[count];

		for (int i = 0; i < count; i++) {
			System.out.println("please enter  number" + (i + 1));
			nums[i] = input.nextInt();
		} // print all items in the same line using for each loop
		for (int j : nums) {
			System.out.print(j + " ");
		}
		System.out.println();
		//iterate in array and find the largest value
		int largest  = nums[0]; //assume that the first one is the ;argest]
		//loop thru the loop and check if they are greater  that the largest
		//if true, than assign the value into the largest.
		//print out "Largest: " + largest after the loop
		for(int j=0; j<count;j++) {
			if(largest<nums[j]) {
				largest = nums[j];
			}
		}System.out.println("Largest is " + largest);
			

	}
}
