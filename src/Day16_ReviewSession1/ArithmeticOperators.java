package Day16_ReviewSession1;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		/*

		 * arithmetic operators: +,-,/,*,%

		 * shorthand assignment: +=, -=, /=, *=, %=

		 * increment/decrement: --,++

		 * comparison: > ,>=, <, <=, ==, !=

		 */

			/*

			 * distanceInMiles, pace (miles per hour)

			 * How many minutes it will take to reach destination

			 * 

			 */

//			50 miles togo

//			5 mph -> how many minutes.

			double distance = 34;

			double pace = 20;

			

			double minutes = distance / pace * 60;

			System.out.println("Minute to reach destination:" + minutes);

			

			//You spend 5 minutes in traffic

			minutes += 5.0;

			

			//You spend 1 minute extra coz you took a wrong turn

			minutes++;

			

			System.out.println("Finally it takes :" + minutes + " minutes");

			

			int number = 10;

			System.out.println(number / 3); //3

			System.out.println(number % 3); //1

			

			System.out.println(number);

			++number; // add 1

			System.out.println(number);

			number++; // add 1

			System.out.println(number);

			

			int num2 = number++;

			System.out.println(num2);

			System.out.println(number);//13

				//	  14       14

			num2 = ++number + number++; // 15

			

			System.out.println(num2);//28

			System.out.println(number);//15

		}

	}



