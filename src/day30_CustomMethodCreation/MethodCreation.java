package day30_CustomMethodCreation;

public class MethodCreation {
	public static void main(String[] args) {
		printLastLetter("");
		
	}
	public static void printLastLetter(String word) {
		if(word.isEmpty()) {
			System.out.println("Your word is empty");
			return;
		}
		System.out.println(word.charAt(word.length()-1));
	}
	public static void setAge(int age) {
		
	}
}
