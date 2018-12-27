package day18_Loops;

public class PrintEvens {

		public static void main(String[] args) {
			
			//using IF condition within while loop.
			//start variable number with 1 and loop until 100
			//check if number is even
			//print the number
			
			int number = 1;
			
			while(number<=100) {
				if(number%2==0) {
					System.out.println(number);
				}number++;
			}
			
		}
}
