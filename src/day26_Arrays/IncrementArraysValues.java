package day26_Arrays;

public class IncrementArraysValues {
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,7,8,9};
		
		for(int idx : nums) {
			System.out.print(idx + " ");
			
		}System.out.println();
		for(int i=0; i<nums.length;i++) {
			
			if(nums[i]%2==0) {
				nums[i] *=2;
			}else {
				nums[i] *=3;
			}
		}for(int idx1 : nums) {
			System.out.print(idx1 + " ");
		}
	}

}
