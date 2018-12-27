package day33;

public class Mentoring {
	public static void main(String[] args) {
		
		String [] arr = {"MacBook", "Cybertek", "civic", "abba", "anything"};
		String [] newArr = new String[arr.length];
		for(int i = 0; i<newArr.length; i++) {
			newArr[i] = reverseWord(arr[i]);
			
			if(arr[i].equals(newArr[i])) {
				System.out.println(arr[i]+ ": the word is Palindrome");
			}else {
				System.out.println(arr[i] + ": the word is not Palindrome");
			}
		}
		
	}
	public static String  reverseWord(String str) {
		String reversed = "";
		for(int i = str.length()-1; i>=0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
	}
}
