package day11_SwitchStatement;

public class SwitchCase {

	public static void main(String[] args) {
		
		
	//4 floors, 1-Lobby, 2-Google, 3-Cybertek, 4-Apple;
		
		int floor = 3;
		
		if(floor==1) {
			System.out.println("Lobby");
		}else if(floor==2) {
			System.out.println("Google");
		}else if(floor==3) {
			System.out.println("Cybertek");
		}else if(floor==4) {
			System.out.println("Apple");
		}else {
			System.out.println("No such floor");
		}
		
		switch(floor) {
		
		case 1:
			System.out.println("Lobby");
			break;
		case 2:
			System.out.println("Google");
			break;
		case 3:
			System.out.println("Cybertek");
			break;
		case 4:
			System.out.println("Apple");
			break;
		default:
			System.out.println("No such floor");
		}

	}

}
