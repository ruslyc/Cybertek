package Assignments;

public class PrintFirstAndLastOfEachWordStringArray2 {
	public static void main(String[] args) {
		/*Given a String array words, iterate through each word and print first and last letter of each element in the format below.

	Example:

	words → ["hello", "why", "by", "apple" , "note"]

	print → [ho, wy, by, ae, ne] 
		 * /
		 */
		String[] words = {"hard", "easy", "tomorrow", "today"};
		
		
		System.out.print("[");
		for(int i=0; i<words.length; i++) {
			if(i!=words.length-1) {
			System.out.print(words[i].charAt(0));
			System.out.print(words[i].charAt(words[i].length()-1)+", ");
			}else {System.out.print(words[i].charAt(0));
			System.out.print(words[i].charAt(words[i].length()-1));
				
			}
		}	System.out.print("]");
	}

}
