package day30_CustomMethodCreation;

public class MentoringFindSecondLargestNumberArray {
	
	public static void main(String[] args) {
		
		int [] array = {2, 4, 34, 5, 3};
		
		System.out.println("the second higher number is: "+ findSecondValue(array));
	}
	public static int findSecondValue(int[] array) {
		
		if(array.length<3) {											//SOLVE THIS!!!!!!!
			System.out.println("Please enter longer array");
		}
		return 0;
	}
}
