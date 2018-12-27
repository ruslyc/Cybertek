package day_53Exceptions;

public class Ecplicit {
	public static void main(String[] args) {
		someNumber(23);
		
	}
	
	public static void someNumber(int i) {
		if(i<0) {
			throw new RuntimeException("Enter positive number");
		}
		else {
		System.out.println(i*2);
		}
	}
}
