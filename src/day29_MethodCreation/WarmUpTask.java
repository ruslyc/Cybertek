package day29_MethodCreation;

public class WarmUpTask {
public static void main(String[] args) {
	
	int [] nums = {76, 89, 10, 3, 20, 55, 15};
		int replacement = 10;
		for(int i =0; i < nums.length; i++) {
			if(nums[i] != 0) {
				nums[i] = replacement;
			}else {
				replacement = nums[i];
			}
		}
}
}
