package day20_ForLoop;

public class ReverseString {

	public static void main(String[] args) {
		
		String word = "ruslan";
		
		String reversed = "";
		
		for (int idx = word.length()-1; idx>=0;idx-- ) {
			
			System.out.print(word.charAt(idx));
		}

	}

}
