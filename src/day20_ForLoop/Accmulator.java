package day20_ForLoop;

public class Accmulator {

	public static void main(String[] args) {


			int sumEven = 0;
			
			int sumOdd=0;
			
			for(int i=0; i<=100; i++) {
				if (i%2==0) {
				sumEven=sumEven+i;
				}else {
					sumOdd=sumOdd+i;
				}
				
			}System.out.println("Sum of even is "+sumEven + "and sum of odd is "+sumOdd);
	}

}
