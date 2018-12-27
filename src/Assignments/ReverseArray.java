package Assignments;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		
		int [] nums = {1,2,3,4,5,6,7};
		
		int temp =0;
		
		for (int i = 0; i< nums.length/2; i++ ) {
			
			temp = nums[i];
			
			nums[i] = nums[nums.length-1-i];
			
			nums[nums.length-1-i]=temp;
		}System.out.println(Arrays.toString(nums));
	}

}
