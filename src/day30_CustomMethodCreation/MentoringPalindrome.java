package day30_CustomMethodCreation;

public class MentoringPalindrome {
	public static void main(String[] args) {
		
		//Palindrom
		
		String word = "civic";
		System.out.println("Is this palindrom: " + isPalindrom(word) );
		
		
	}
	// create a function take string as parameter and return is palindrom or not : boolean
	
	public static boolean isPalindrom(String word) {
		
		for(int i=0; i<word.length()/2; i++) {
			
			String character1 = word.charAt(i)+"";
			String character2 = word.charAt(word.length()-1-i)+"";
			if(!character1.equals(character2)) {
				return false;
			}
		}
		return true;
	}

}
