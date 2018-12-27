package day34_methodOverloading;

public class MenthoringSession {
	public static void main(String[] args) {
		System.out.println(swapFirstWithLast("Ruslan"));
		
		char [] str = {'a','a','b'};
		char unique =' ' ;
		for(int i = 0; i< str.length; i++) {
			unique^=str[i];
			System.out.println(unique);
		}
	}
	public static String swapFirstWithLast(String word) {
		String first = word.charAt(0)+"";
		String last = word.charAt(word.length()-1) + "";
		word = last + word.substring(1, word.length()-1)+ first;
		return word;
	}
}
