package day6_operators_boolean;

public class IfElseStatement {
	public static void main(String[] args) {
		
		double coffeePrice = 7.0;
		
		if(coffeePrice>6.0) {
			
			System.out.println("I dont have enough money");
		}else { 
			System.out.println("I can buy a coffee");
	}
		double accountBalance = 450.50;
				
		double price = 200;
		//if you have enough money ,you buy the item, otherwise say not enough balance
		
		if (accountBalance<price) {
			
			System.out.println("I will buy it");
		}else {
			System.out.println(("not enough balance"));
		}
	}

}
