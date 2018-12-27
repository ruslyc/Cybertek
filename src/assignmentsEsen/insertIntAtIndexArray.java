package assignmentsEsen;

import java.util.Arrays;

public class insertIntAtIndexArray {
	public static void main(String[] args) {

		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		insertIntAtIndexArrays(nums, 100, 5);
		

	}

	public static int[] insertIntAtIndexArrays(int[] arr, int target, int targetIdx) {

		int[] result = new int[arr.length + 1];

		for (int i = 0; i < result.length; i++) {

			if (i >= 0 && i < targetIdx) {
				result[i] = arr[i];
			} else if (i == targetIdx) {
				result[i] = target;
			} else {
				result[i] = arr[i - 1];
			}
		}
		System.out.println(Arrays.toString(result));
		return result;
	}
}
