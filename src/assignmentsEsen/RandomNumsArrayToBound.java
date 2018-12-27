package assignmentsEsen;

import java.util.Arrays;
import java.util.Random;

public class RandomNumsArrayToBound {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(randomArrayToBound(14,100)));
		
	}
public static int [] randomArrayToBound(int size, int bound) {
	int [] nums = new int [size];
	Random random = new Random();
	for(int i =0; i<nums.length; i++) {
		nums[i] = random.nextInt(bound);
	}
	
	return nums;
}
}
