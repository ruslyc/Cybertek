package Assignments;

import java.util.Arrays;

public class BinaryArrayToInteger {

	public static void main(String[] args) {

		int[] binary = { 1, 0, 0, 0, 1, 0, 1, 0 };

		String result = "";
		String str = Arrays.toString(binary);

		String[] str1 = str.split(", ");

		for (String idx : str1) {
			result += idx;

		}
		String finalResult = result.substring(1, result.length() - 1);

		System.out.println(Integer.parseInt(finalResult, 2));

	}

}
