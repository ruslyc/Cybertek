package day29_MethodCreation;

import java.util.Arrays;
import java.util.Random;

public class WarmUpTask2 {
	public static void main(String[] args) {

		Random random = new Random();

		int[][] numbers = new int[4][];

		numbers[0] = new int[5];
		numbers[1] = new int[3];
		numbers[2] = new int[7];
		numbers[3] = new int[7];

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = random.nextInt(100);
			}
		} printDoubleArray(numbers);
		int [] x = {1,2,3,4,5,6,7,8,9};
		 arrayToStringReplica(x);
	}	
		public static void printDoubleArray (int [][] nums) {
			for (int i = 0; i < nums.length; i++) {
				System.out.println(Arrays.toString(nums[i]));
		}
}
		public static void arrayToStringReplica(int [] nums) {
			System.out.print("[");
			for (int i=0; i<nums.length;i++) {
				if(i!=nums.length-1) {
				System.out.print(nums[i] + ", ");
				}else {
					System.out.print(nums[i]);
				}
			}System.out.print("]");
		}
}