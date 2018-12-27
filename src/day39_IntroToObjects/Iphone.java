package day39_IntroToObjects;


public class Iphone {				// This whole class is called declaration of data type;
	
	String model;  //------> 		instance variable (vs. local variables declared inside the clasess);
	
	int memory;		//------>same 	They are declared at the class level.	
	
	String color;	//------>same	They will have default values.
	
	public void printPhoneInfo() {
		System.out.println("Model: " + model);
		System.out.println("memory: " + memory);
		System.out.println("Color: " + color);
	}	
}