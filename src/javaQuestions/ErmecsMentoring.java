package javaQuestions;

import java.util.Scanner;

public class ErmecsMentoring {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter any number");

		int number = input.nextInt();

		System.out.println(isPrime(number));

		int number2 = input.nextInt();

		System.out.println(gcd(number, number2));

		int[] arr = { 20, 2, 3, 16, 16, 18 };

		System.out.println(gcd(arr));

		System.out.println(lcm(number, number2));

		System.out.println(secondLargestInArray(arr));

	}

	public static boolean isPrime(int number) {

		/*
		 * 
		 * Prime number is a number that is greater than 1 and divided by 1 or itself
		 * only.
		 * 
		 * In other words, prime numbers can't be divided by other numbers than itself
		 * or 1.
		 * 
		 * Numbers that have more than two factors are called composite numbers.
		 * 
		 * For example 2, 3, 5, 7, 11, 13, 17, 19, 23
		 * 
		 */

		// then we need to check all numbers that can be divide our given number

		if (number > 1) {

			for (int i = 2; i <= number; i++) {

				if (i == number) {

					break;

				}

				if (number % i == 0) {

					return false;

				}

			}

		}

		return true;

	}

	public static int lowestCommonMultiple(int num1, int num2) {

		// LCM is a smallest positive integer that exactly divides two or more numbers.
		// For Example, the

		// LCM of 16 and 20 is 80; 80 is the smallest number that is both a multiple of
		// 16 and a multiple of

		// 20.

		// maximum number between n1 and n2 is stored in largest number

		int largestNumber = (num1 > num2) ? num1 : num2;

		while (true) {

			if (largestNumber % num1 == 0 && largestNumber % num2 == 0) {

				return largestNumber;

			}

			largestNumber++;

		}

//        for (int i = 1;i <= smallest; i++){

//            int lcm = largest * i;

//            if (lcm % num1 == 0 && lcm % num2 == 0) {

//                return largestNumber;

//            }

//        }

	}

	public static int gcd(int num1, int num2) {

		/*
		 * 
		 * The greatest common divisor (GCD) of two integers a and b is the largest
		 * integer that is a factor of both a and b.
		 * 
		 * The GCD of any number and 1 is 1, and the GCD of any number and 0 is that
		 * number.
		 * 
		 * One efficient way to compute the GCD of two numbers is to use Euclid's
		 * algorithm, which states the following:
		 * 
		 * In mathematics, the Euclidean algorithm, or Euclid's algorithm, is an
		 * efficient method for
		 * 
		 * computing the greatest common divisor (GCD) of two numbers, the largest
		 * number
		 * 
		 * that divides both of them without leaving a remainder.
		 * 
		 * GCD(A, B) = GCD(B, A % B)
		 * 
		 * GCD(A, 0) = Absolute value of A"
		 * 
		 */

		while (num1 != 0 && num2 != 0) {

			int temp = num2;

			num2 = num1 % num2; // % is remainder

			num1 = temp;

		}

		return num1 + num2;

	}

	public static int gcd(int[] arr) {

		int result = arr[0];

		for (int i = 1; i < arr.length; i++) {

			result = gcd(result, arr[i]);

		}

		return result;

	}

	public static int lcm(int num1, int num2) {

		return num1 * (num2 / gcd(num1, num2));

	}

	public static int lcm(int[] arr) {

		int result = arr[0];

		for (int i = 1; i < arr.length; i++) {

			result = lcm(result, arr[i]);

		}

		return result;

	}

	public static boolean isArmstrong(int number) {

		/*
		 * 
		 * Armstrong Number in Java: A positive number is called armstrong number
		 * 
		 * if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370,
		 * 371, 407 etc.
		 * 
		 */

		int digitOfNum = 0, reminderOfNum, temp;

		temp = number;

		while (number > 0) {

			reminderOfNum = number % 10;

			number = number / 10;

			digitOfNum = digitOfNum + (reminderOfNum * reminderOfNum * reminderOfNum);

		}

		if (temp == digitOfNum) {

			return true;

		} else {

			return false;

		}

	}

	public static int secondLargestInArray(int[] numbers) {

		int largest = 0;

		int second = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > largest) {

				second = largest;

				largest = numbers[i];

			}

			if (numbers[i] < largest && second < numbers[i]) {

				second = numbers[i];

			}

		}

		return second;

	}

	public static boolean isPrime1(int number) {

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {

				return false;

			}

		}

		return true;

	}

	public static int lowestCommonMultiple2(int num1, int num2) {

		int largest = (num1 > num2) ? num1 : num2;

//        while(true){

//            if(largest % num1 == 0 && largest % num2 == 0){

//                return largest;

//            }

//            largest++;

//        }

		for (int i = 1; i <= largest; i++) {

			int lcm = largest * i;

			if (lcm % num1 == 0 && lcm % num2 == 0) {

				return lcm;

			}

		}

		return 0;

	}

	public static int gretestCommonDivisor(int num1, int num2) {

		while (num1 != 0 && num2 != 0) {

			int temp = num2;

			num2 = num1 % num2; // % is remainder

			num1 = temp;

		}

		return num1 + num2;

	}
}
