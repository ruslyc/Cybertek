package day41_EncapsulationAndConstructors;

public class Cat {
	
	public Cat(String g, String b) {		// this is the method that runs behind every new object creation EX: Cat c = new Cat();
	gender = g;
	breed = b;
	}
	
	public Cat(String g, String b, int i) {	// overloading a constructor
		gender = g;
		breed = b;
		age = i;
	}
	String gender;
	String breed;
	int age;
	boolean shy;
	String color;
	String behaviour;
	
	public Cat(String behaviour) {
		this.behaviour = behaviour;   // this keyword points to the instance variable from the class and not the local variable in the constructor
	}
}
