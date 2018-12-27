package day6_operators_boolean;

public class PostvsPre {
	public static void main(String[] args) {
		
		int number =10;
		
		int number2 = number++;
		
		System.out.println("number2: "+ number2);
		
		System.out.println("number: "+ number);
		
		int tomatoes = 5;
		
		int bag = ++tomatoes;
		
		System.out.println(bag);
		
		System.out.println(tomatoes);
	}

}
