package day24_Arrays;

public class PrintArrayValues {
	public static void main(String[] args) {
		
		//create an array cars and assign values:
		//Audi, Porsche, BMW, Toyota, Honda, Tesla, Dodge, Kia, Acura, Fiat
		
		String[] cars = new String[] {"Audi", "Porsche", "BMW", "Toyota", "Honda", "Tesla", "Dodge", "Kia", "Acura", "Fiat", "maserati"};
		
		System.out.println(cars.length);
		
		for(int idx=0; idx<cars.length;idx++) {
			System.out.println(cars[idx]);
			
		}//same thing using for EACH loop
		
		for(String index :cars) {	//for EACH loop only works with arrays or other data collections 
			System.out.println(index);
		}
		int[] nums = {1,2,3,4,5,6,7};
		
		for(int n : nums) {
			System.out.println(n);
		}
		
	}

}
