package day52_polymorphism;

public class Apple extends Fruit implements Organic{
	
	public void appleMethod() {
		System.out.println("Apple method in Apple class");
	}
	
	@Override
	public void fruitMethod() {
		System.out.println("Overriden version of the fruit method in the apple class");
	}

	@Override
	public void eat() {
		System.out.println("Eating an apple in Apple class");
		
	}

}
