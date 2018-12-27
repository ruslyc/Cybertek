package Day16_ReviewSession1;

public class BooleanWithAndWithoutIf {

	public static void main(String[] args) {
		
		/*

		 * Print items you can purchase based on your budget

		 * 

		 * < 80 -> cannot buy anything

		 * > 435 -> u can buy everything

		 * if budget >= phone+watch

		 * 	you can buy phone+watch

		 * 	or phone+bag

		 * 	or watch + bag

		 * if budget >= phone+bag

		 * 	you can buy phone+bag

		 *  or watch + bag

		 * if budget >= watch+bag

		 * 	you can buy watch+bag

		 * 	

		 * if budget >= phone

		 * 		you can buy phone

		 * 	   or watch+bag

		 * if budget >= watch

		 * 		you can buy watch

		 * 		or bag

		 * else

		 * 	just a watch

		 */

		

    double budget = 330.0;

	

	double phone = 250.0;

	double watch = 105.5;

	double bag = 80.0;

	

	if(budget < 80.0) {

		System.out.println("Cannot buy anything");

	}else if(budget >= 435.5) {

		System.out.println("You can buy all items");

	}else if(budget >= phone+watch) {

		System.out.println("You can buy Phone+Watch OR Phone+Bag OR watch+Bag");

	}else if(budget >= phone+bag) {

		System.out.println("you can buy phone+bag OR watch + bag");

	}else if(budget >= phone) {

		System.out.println("You can buy phone OR watch+bag");

	}else if(budget >= watch+bag) {

		System.out.println("You can buy watch+bag");

	}else if(budget >= watch) {

		System.out.println("You can buy a watch or a bag");

	}else {

		System.out.println("You can buy a bag");

	} 

	

		

		

		

		

		

		

		

		

		

		

		

	}



	}


