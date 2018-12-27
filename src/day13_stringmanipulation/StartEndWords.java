package day13_stringmanipulation;

public class StartEndWords {

	public static void main(String[] args) {

		String str1 = "words";
		String str2 = "fever";

		char one = str1.charAt(1);

		char two = str2.charAt(0);

		int num1 = str1.length();

		int num2 = str2.length();

		if (!(num1 == 5) || !(num2 == 5)) {
			System.out.println("need to be exactly five chars length");
		}

		if (one == two) {
			System.out.println("Fizz");
		} else {
			System.out.println("Buzz-did not match");
		}

	}

}
