package day27_arrays04;

public class ArrayCopySomeValues {
	public static void main(String[] args) {
		
		String[] arr = {"zero", "one", "two","three","feer"};
		
		//count how many words have e in the arr
		int counter1 =0;
		int counter = 0;
		for(String str:arr) {
			if(str.contains("e")) {
				counter++;
			}
		}//create array fewValues with the size of counter
		String[] fewValues = new String[counter];
		//go over arr one more time and add the words with 'e' into fewValues
		for(String idx:arr) {
			if(idx.contains("e")) {
				counter1++;
				fewValues[counter1-1]= idx;
			}
		}for(String idx1:fewValues) {
			System.out.println(idx1);
		}
		
	}

}
