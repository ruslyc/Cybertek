package day48_Overrriding;

public class Game {
	public static void main(String[] args) {
		
	
	SoccerPlayer p1 = new SoccerPlayer();
	
	p1.age =30;
	p1.gender= "male";
	p1.name = "Benzema";
	
	p1.bycicleKick();
	p1.train();
	p1.eat();
	p1.run();
	
	ClubPlayer c1 = new ClubPlayer();
	
	c1.run();
	
	
	}
}
