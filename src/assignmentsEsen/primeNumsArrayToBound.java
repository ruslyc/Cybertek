package assignmentsEsen;

import java.util.Arrays;

public class primeNumsArrayToBound {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(primeNumsArrayToBound(150)));
		
	}
public static int [] primeNumsArrayToBound(int bound) {
	int size =0;
	for (int i = bound ; i >=0; i--) {
		int count = 0;
		for(int j = 1; j <= bound; j++) {
			if (i%j==0) {
				count++;
			}
		} if ((count==2&&i>=2) || i==1) {
			size++;
		} 
	}int [] primeNums = new int [size];
	
	for (int i = bound ; i >=0; i--) {
		int count = 0;
		for(int j = 1; j <= bound; j++) {
			if (i%j==0) {
				count++;
			}
		} if ((count==2&&i>=2) || i==1) {
			primeNums[size-1] = i;
			size--;
		} 
	

	
}return primeNums;
}
}