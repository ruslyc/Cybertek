package day25_ArraysDay2;

public class CountMatches {
	public static void main(String[] args) {
		
		double[] prices = { 12.45, 19.97, };
		
		int count=0;
		
		for(int i=0; i<prices.length; i++) {
			if(prices[i]>20) {
				count++;
			}
			
		}System.out.println(count+ " items over 20$");

		if(count==0) {
			System.out.println("No items are more than 20$");
		}
		//for EACH loop Example
		int countForEach = 0;
				for(double price:prices) {
					if(price>20) {
						countForEach++;
					}
				}System.out.println(countForEach+ " items over 20$");

				if(countForEach==0) {
					System.out.println("No items are more than 20$");
					}
	}

}
