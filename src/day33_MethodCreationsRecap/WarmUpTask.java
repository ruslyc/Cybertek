package day33_MethodCreationsRecap;

import java.util.Arrays;

public class WarmUpTask {
	public static void main(String[] args) {
		String [] names = {"Alexei", "Ruslan", "Ivan", "Leonid", "Greg"};
		int [] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(replaceElementsWithTarget(arr , 10)));
		System.out.println(Arrays.toString(stringToCharArray("Eldar")));
		printDesiredLengthStrings(names,6);
	}
public static int [] replaceElementsWithTarget(int [] arr, int n) {
	for(int i = 0; i< arr.length; i++) {
		arr[i] = n;
	}
	return arr;
}
public static char [] stringToCharArray(String str) {
	char [] arr = new char [str.length()];
	for(int i = 0; i< str.length(); i++) {
		arr[i] = str.charAt(i);
	}
	return arr;
}
public static void printDesiredLengthStrings (String [] names, int n) {
	for (String idx : names) {
		if(idx.length() == n) {
		System.out.println(idx);
		}
	}
}
}
