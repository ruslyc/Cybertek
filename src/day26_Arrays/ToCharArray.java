package day26_Arrays;

public class ToCharArray {
	
	public static void main(String[] args) {
		
		String word = "Hello";
		
		char[] letters = word.toCharArray();
		
		for(char idx : letters) {
			
			System.out.println(idx);
		}String gift = "Diamond ring";
		
		char[] letters1 = gift.toCharArray();
		
		for(int i = letters1.length-1; i>=0 ; i--) {
			
			System.out.print(letters1[i]);
		}
	}

}
