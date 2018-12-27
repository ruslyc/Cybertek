package day33;

import java.util.Random;

public class ReturnMethod {
	public static void main(String[] args) {
		
		int i = getRandomNumberZeroToThousand();
	}
	/**
	 * will give the user a random number between 0 to 1000;
	 * @return
	 */
public static int getRandomNumberZeroToThousand() {
	
	Random random = new Random();
	return random.nextInt(1000);
	}
	
}
