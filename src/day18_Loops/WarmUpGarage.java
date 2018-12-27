package day18_Loops;

public class WarmUpGarage {

	public static void main(String[] args) {

		String garage = "Toyota, Nissan, Honda, BMW, Mazerati, Ford";

		garage = garage.toLowerCase();

		System.out.println(garage.isEmpty());

		if (garage.contains("toyota") || garage.contains("nissan")) {

			System.out.println("There are Japanese cars in the garage");

		} else
			System.out.println("No Japanese cars");

		if (garage.contains("bmw")) {

			System.out.println("There's a german car in the garage");

		} else
			System.out.println("No German cars");

		if (garage.contains("mazerati")) {

			System.out.println("There's an italian car in the garage");

		} else
			System.out.println("No Italian cars");

		if (garage.contains("ford")) {

			System.out.println("There's an American car in the garage");

		} else
			System.out.println("No American cars");

	}

}
