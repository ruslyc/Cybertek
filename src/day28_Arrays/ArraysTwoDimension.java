package day28_Arrays;

public class ArraysTwoDimension {
public static void main(String[] args) {
	
	int [] [] numbers = {{1,2,3}, {100,200,300}};
	System.out.println(numbers[0][2]);
	
	int [] ages = {1,2,3,4,5};
	
	numbers[0] = ages; //will assign ages array to numbers at the index 0;
	
	System.out.println(numbers[0][0]);
	
}
}
