package day52_polymorphism;

public class Market {
	public static void main(String[] args) {
	
		Food f = new Apple();
		f.showFood();  // no other methods available for f so far
		
		Fruit ff = (Fruit)f;
		
		ff.fruitMethod();
		ff.showFood();
		
		Apple a = new Apple();
		
		
	}

}
