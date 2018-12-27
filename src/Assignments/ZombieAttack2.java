package Assignments;

import java.util.Arrays;

public class ZombieAttack2 {
	public static void main(String[] args) {
		/*
		 * An array inhabitants represents cities and their respective populations. For
		 * example, the following arrays shows 8 cities and their respective
		 * populations:[3, 6, 0, 4, 3, 2, 7, 1] Some cities have a population of 0 due
		 * to a pandemic zombie disease that is wiping away the human lives.After each
		 * day, any city that is adjacent to a zombie-ridden city will lose half of its
		 * population. Write a program to loop though each city population and make it
		 * lose half of its population if it is adjacent(right or left) to a city with
		 * zero people until all cities have no humans left. Make updates to each
		 * element in the array And print the array like below for each day: * /
		 */
		int[] inhabitants = { 1, 1, 0, 1, 1, 1, 1, 1 };
		int sum = 0;
		int day = 0;
		System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
		do {
			sum = 0;

			for (int i = 0; i < inhabitants.length; i++) {
				if (i < inhabitants.length - 1) {
					if (inhabitants[i + 1] == 0) {
						inhabitants[i] /= 2;
					}
					if (inhabitants[i] == 0 && inhabitants[i + 1] != 0) {
						inhabitants[i + 1] /= 2;
						i++;
					}
					
				}sum += inhabitants[i];
			}
			day++;
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

		} while (sum > 0);

	}

}
