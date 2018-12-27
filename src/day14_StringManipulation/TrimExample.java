package day14_StringManipulation;

public class TrimExample {

	public static void main(String[] args) {
		
		String str = " blah ";
		
		System.out.println(str.trim());// .trim() gets rid of the white spaces before and after the string
		
		System.out.println(str.trim().length()); // chaining methods, putting one method after another
	}

}
