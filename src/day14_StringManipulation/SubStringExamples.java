package day14_StringManipulation;

public class SubStringExamples {

	public static void main(String[] args) {
		
		//substring gets a part of a string
		//there are 2 versions, one takes 1 int, the other one 2 ints
		//if it takes one int it means starting point
		String str = "01234";
		
		//"01234".substring(1);
		
				System.out.println(str.substring(1));
				
				System.out.println(str.substring(3));
		
				System.out.println(str.substring(1,5));
		

	}

}
