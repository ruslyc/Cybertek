package day48_Overrriding;

public class SoccerPlayer extends Human{
	String name;
	int jerseyNumber;
	
	@Override					//annotation
	public void run() {
		System.out.println("Soccer player is running");
		
	}
	
	public void train() {
		System.out.println("Soccer player is training");
	}
	public void bycicleKick() {
		System.out.println("Soccer player is bycicle kicking");
	}
}
