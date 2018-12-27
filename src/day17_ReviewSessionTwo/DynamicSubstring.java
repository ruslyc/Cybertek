package day17_ReviewSessionTwo;

public class DynamicSubstring {

	public static void main(String[] args) {
		
		String sentence = "We are learning Romanian programming";
		
		/*indexOf -accepts and finds the position 
		 * String str = "abc";
		 * str.indexOf("b") ->1
		 * 
		 * /
		 */
		int start =sentence.indexOf("learning");
		int end = sentence.indexOf("programming");
		
		start+="learning".length();
		
		String language = sentence.substring(start, end);
		
		System.out.println(language);
		System.out.println(language.trim());
	}

}
