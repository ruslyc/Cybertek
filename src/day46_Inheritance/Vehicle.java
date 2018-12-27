package day46_Inheritance;

public class Vehicle {
	String type, color ;
	int year;
	boolean isNew;
	
	public void	startEngine () {
		System.out.println("Engine is starting ");
	}
	
	public void stopEngine() {
		System.out.println("Engine is stopping");
	}
	
	public static void fixVehicle(String date) {
		System.out.println("Vehicle is getting fixed on "+ date);
	}
	
	
}
