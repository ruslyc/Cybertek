package day_9;

public class ShippingCalculator {

	public static void main(String[] args) {

		int shippingMode = 1; //1-regular, 2 express
		double purchasePrice = 98.5;
		double shippingCost = 0;
		
		if (shippingMode == 1) {
			System.out.println("Regular shipping selected");
			if (purchasePrice>=1.0 && purchasePrice<= 100.0) {
				shippingCost = 17.0;
			}else if (purchasePrice>100.0 && purchasePrice<= 300.0) {
				shippingCost = 10.0;
			}else if(purchasePrice>300.0) {
				shippingCost = 0.0;
			}
		}else if (shippingMode == 2) {
			System.out.println("Express shipping selected");
			if (purchasePrice>=1.0 && purchasePrice<= 100.0) {
				shippingCost = 35.0;
			}else if (purchasePrice>100.0 && purchasePrice<= 300.0) {
				shippingCost = 20.0;
			}else if(purchasePrice>300.0) {
				shippingCost = 15.0;
			}
		}
		}

	}


