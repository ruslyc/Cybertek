package day19_Loops;

public class day19_Assignment {

	public static void main(String[] args) {

		String bank = "CHASE";

		bank = bank.substring(0, 1).toUpperCase() + bank.substring(1, bank.length()).toLowerCase();

		System.out.println(bank);

		int num = 1;

		while (num <= 10) {

			System.out.print(num + " ");

			num++;
		}

		int num1 = 10;

		while (num1 >= 1) {

			System.out.print(num1 + " ");

			num1--;

		}
	}

}
