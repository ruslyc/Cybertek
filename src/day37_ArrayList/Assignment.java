package day37_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	List<Integer> nums = new ArrayList<>();
	for(int i = 1; i<6; i++) {
		int num = sc.nextInt();
		if(num%2==0) {
			nums.add(num);
		}
	}System.out.println(nums);
}
}
