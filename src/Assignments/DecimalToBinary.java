package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("please enter a number");

		int dec = input.nextInt();

		int[] binary = new int[8];

		int[] bitArray = { 128, 64, 32, 16, 8, 4, 2, 1 };

		for (int i = 0; i < bitArray.length; i++) {

			if (dec / bitArray[i] == 1) {

				binary[i] = 1;

				dec = dec % bitArray[i];
			}
		}
		System.out.println(Arrays.toString(binary));
	}

}
