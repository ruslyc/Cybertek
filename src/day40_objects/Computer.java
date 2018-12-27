package day40_objects;

public class Computer {
	
//	4.   Create a class Computer
//	Instance variables: model, color, memory, size, new(boolean)
//	Instance variables: 
//	-> turnOn: void method, print “computer turning on”
//	-> turnOff
//	: void method, print “ %model turning off”
	
	String model;
	String color;
	int memory;
	int size; 
	boolean neW;
	
	public void turnOn() {
		System.out.println("Computer turning ON");
	}
	public void turnOff() {
		System.out.println(model + " turning OFF");
	}	
}
