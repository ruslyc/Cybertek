package Assignments;

public class PrintFirstAndLastOfEachWordStringArray {
	public static void main(String[] args) {
		/*Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
		 * /
		 */
		String[] words = {"hard", "easy", "tomorrow", "today"};
		
		for(int i=0; i<words.length; i++) {
			System.out.print(words[i].charAt(0));
			System.out.print(words[i].charAt(words[i].length()-1));
			System.out.println();
		}
	}

}
