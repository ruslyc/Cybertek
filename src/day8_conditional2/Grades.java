package day8_conditional2;

public class Grades {
	public static void main(String[] args) {
		
		// A,B,C,D
		//USE CHAR VARIABLE GRADE
		//if grade is A say Excellent
		//B say Good
		//C Acceptable
		//D say WTF
		char grade;
		grade= 'V';
		if (grade=='A') {
			System.out.println("Excellent");
		}else if (grade=='B') {
				System.out.println("good");
		}else if (grade=='C') {
			System.out.println("Acceptable");
		}else if (grade=='D') {
			System.out.println("WTF");
		}else {
			System.out.println("Not a valid grade");
		}
	}

}
