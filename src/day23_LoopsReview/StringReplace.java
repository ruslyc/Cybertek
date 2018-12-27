package day23_LoopsReview;

public class StringReplace {
public static void main(String[] args) {
	
	String sentence = "We are learning java";
	System.out.println(sentence);
	
	sentence = sentence.replace("java", "C++");
	
	System.out.println(sentence);
	
	sentence = sentence.replace("learning", "practicing");
	
	System.out.println(sentence);
	
	String word = "abcdefg java selenium";
	
	System.out.println(word.replace("ava", "unit"));
	
}
}
