package day31_ArraysRecap;

public class WarmUpTask {
	public static void main(String[] args) {
		
		int [] grades = {15,25,33,35,66,44,78,95,1,500};
		
		int min = grades[0];
		int max =grades[0];
		
		for(int i=0;i<grades.length; i++) {
			if(grades[i]>max) {
				max = grades[i];
			}
			if (min>grades[i]) {
				min = grades[i];
			}
			}System.out.println(max+ " " + min);
		}
		
		
	}


