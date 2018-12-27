package day52_polymorphism;

public interface Organic {
	
	void eat();
	default void organicMethod() {
		System.out.println("Organic mehtod in organic interface");
	}

}
