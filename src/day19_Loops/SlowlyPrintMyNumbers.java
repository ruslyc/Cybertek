package day19_Loops;

public class SlowlyPrintMyNumbers {

	public static void main(String[] args) throws InterruptedException {
		
		int num = 1;

		while (num <= 60) {

			System.out.print(num + " ");

			num++;
			
			Thread.sleep(1000);//pause the execution for one second or whatever you want.
		}

			
	}

}
