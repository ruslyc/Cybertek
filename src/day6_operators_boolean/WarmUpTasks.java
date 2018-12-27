package day6_operators_boolean;

	import java.util.Scanner;
	
	public class WarmUpTasks {

	public static void main(String[] args) {
		
		//Scanner converter = new Scanner(System.in);
		
		//System.out.println("Please enter the value in miles: ");
		
		//double miles = converter.nextDouble();
		
		//double kilometers= miles*1.6;
		
		//System.out.println("The number of km in " + miles + " miles is: "+ kilometers);
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter current odometer: ");
		
		double currentMiles = input.nextDouble();
		
		System.out.println("Please enter old odometer: ");
		
		double oldMiles = input.nextDouble();
		
		System.out.println("please enter gas added to the tank: ");
		
		double gallons = input.nextDouble();
		
		System.out.println("Please enter the gas price: ");
		
		double fuelPrice = input.nextDouble();
		
		System.out.println("Gas mileage is: "+ (currentMiles-oldMiles)/gallons + " miles per gallon");
		
		System.out.println("Mileage traveled since last time: " + (currentMiles-oldMiles));
		
		System.out.println("Your fuel expense is: " + gallons*fuelPrice + "$");
		
		input.close();
	}

}
