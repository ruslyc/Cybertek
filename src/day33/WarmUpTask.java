package day33;

import java.util.Arrays;
import java.util.Random;

public class WarmUpTask {
	public static void main(String[] args) {
		
		int [] arr = getUniqueNumbers(20,21);
		System.out.println(Arrays.toString(arr));
		
		String [] names = {"Vova", "Grisa Md", "Vanea Bros", "Jim"};
		
		System.out.println(Arrays.toString(firstLastName(names)));
		
		int [] nums = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(doubleSizeArray(nums)));
		
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
	
	


public static String[] firstLastName(String [] arr) {
	int newArrSize = 0;
	for (String idx : arr) {
		idx = idx.trim();
		if(idx.contains(" ")) {
			newArrSize++;
		}
	}
	String [] newArr = new String[newArrSize];
	int idx = 0;
	for (String str : arr) {
		str = str.trim();
		if (str.contains(" ")) {
			newArr[idx]=(str);
			idx++;
		}
	} return newArr;
}
public static int[] doubleSizeArray(int [] arr) {
	int [] doubled = new int [arr.length*2];
	for (int i = 0 ; i < arr.length; i++) {
		doubled [i] = arr[i];
	}
	return doubled;
}


}
