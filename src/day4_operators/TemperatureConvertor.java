package day4_operators;
import java.util.Scanner;

public class TemperatureConvertor {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a value  in Fahrenheit");
	
			int fahrenheit = scan.nextInt(); 
			double celsius = (5.0/9)*(fahrenheit -32);
			System.out.println("the temperature is: " + celsius + " degrees Celsius");
		}
}