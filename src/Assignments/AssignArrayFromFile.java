package Assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AssignArrayFromFile {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("test.txt");
		Scanner sc = new Scanner(file);
		int arraysize = 0;
		while (sc.hasNextLine()) {
			String name = sc.nextLine().trim();
			// variable name gives each name from the test.txt file
			if (!name.isEmpty()) {
				arraysize++;
			}

		}

		sc.close();

		Scanner another = new Scanner(file);
		int idx = 0;
		String[] names = new String[arraysize];
		while (another.hasNextLine()) {
			String name = another.nextLine().trim();
			// variable name gives each name from the test.txt file
			if (!name.isEmpty()) {

				names[idx] = name;
				idx++;

			}

		}
		another.close();
		randomGroup(names, 20);

	}

	public static void randomGroup(String[] arr, int n) {
		Random random = new Random();
		String[] randomGroup = new String[n];
		int [] idx = getUniqueNumbers(n, arr.length);
		for (int i = 0; i < n; i++) {
			randomGroup[i] = arr[idx[i]];
		}
		System.out.println(Arrays.toString(randomGroup));
	}
	public static int[] getUniqueNumbers(int size, int bound){
		Random random = new Random();
		int temp = 0;
		int[] result = new int[size];
		result[0] = random.nextInt(bound);
		boolean check = true;
		int index = 0;
		while(check){
			int ranNum = random.nextInt(bound);
			if(!checkNumberInArray(result, ranNum)) {
				result[index] = ranNum;
				index++;
				
			}
			if(index == size) {
				check = false;
			}
			}
		return result;
		}
	public static boolean checkNumberInArray(int[] arr, int target) {
		for(int i : arr) {
			if(i==target) {
				return true;
			}
		}
		return false;
	}
}
