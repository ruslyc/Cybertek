package day31_ArraysRecap;

import java.util.Arrays;

public class SearchingWithinArray {
public static void main(String[] args) {
	
	String [] groceryList = {"apple", "carrot", "orange", "cherry", "strawberry"};
	
	Arrays.sort(groceryList);
	
	System.out.println(Arrays.binarySearch(groceryList, "apple"));
	//being able to type without looking is qi
	System.out.println(Arrays.binarySearch(groceryList, "orange"));
}
}
