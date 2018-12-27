package Assignments;

import java.util.Arrays;

public class ZombieAttack1 {
	public static void main(String[] args) {

		int[] inhabitants = { 9, 5, 0, 7, 9, 5, 7, 1, 8 };

		int day = 0;
		int sum = 0;
		do {
			sum = 0;
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
			for (int j = 0; j < inhabitants.length; j++) {
				inhabitants[j] /= 2;
				sum += inhabitants[j];
			}

			day++;
		} while (sum > 0);

	}
}
