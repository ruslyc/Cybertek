package day4_operators;

public class basicMathOperators {
	public static void main(String[] args) {
		
		double apples, carrots, tomatoes;
		apples = 3.99;
		carrots = 0.99;
		tomatoes = 1.59;
		double totalBeforeTax = apples + carrots + tomatoes;
		System.out.println("Total before tax: " + totalBeforeTax);
		double tax = totalBeforeTax * 0.06;
		System.out.println("Total tax: "+ tax);
		double grandTotal = totalBeforeTax + tax;
		System.out.println("Your total is: $" + grandTotal);
		
		
	}
}
