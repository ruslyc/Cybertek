package day13_stringmanipulation;

public class StringPositions {

	public static void main(String[] args) {
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		System.out.println(alphabet.indexOf("hij"));
		System.out.println(alphabet.indexOf("i"));
		System.out.println(alphabet.indexOf("j"));
		
		String sentence = "today is a good day";
		
		System.out.println(sentence.indexOf("good")); //prints out the position of "g"
		
		System.out.println(alphabet.startsWith("abcd"));
	}

}
