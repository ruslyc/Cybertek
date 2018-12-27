package day_12;

import java.util.Scanner;

public class Warm_Up {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

			char startingPoint, destination;
			
			System.out.println("Please enter the starting point");
			
			startingPoint = input.next().charAt(0);
			
			System.out.println("Now please enter the destination ");
			
			destination = input.next().charAt(0);
			
			if (startingPoint=='A'&& destination=='B') {
				
				System.out.println("Go Right");
				
			}else if (startingPoint=='A'&& destination=='C') {
					
					System.out.println("Go Right and go down");
					
			}else if (startingPoint=='A'&& destination=='D') {
				
					System.out.println("Go Right, go down and go left");
				
			}else if (startingPoint=='B'&& destination=='C') {
			
					System.out.println("Go down");
			
			}else if (startingPoint=='B'&& destination=='D') {
				
					System.out.println("go down and go left ");
				
			}else if (startingPoint=='B'&& destination=='A') {
			
					System.out.println("go down,go left and go up");
					
			}else if (startingPoint=='C'&& destination=='D') {
		
					System.out.println("Go left");
		
			}else if (startingPoint=='C'&& destination=='A') {
				
					System.out.println("Go left and go up");
		
			}else if (startingPoint=='C'&& destination=='B') {
			
					System.out.println("go left, go up and go right ");
			
			}else if (startingPoint=='D'&& destination=='A') {
		
					System.out.println("go up");
					
			}else if (startingPoint=='D'&& destination=='B') {
	
					System.out.println("Go up and go left");
	
			}else if(startingPoint=='D'&& destination=='C') {
				
				System.out.println("go up, go right and go rightdown");
				
			}else if (startingPoint==destination) {
	
				System.out.println("you're already here");
				
			}else if(! (startingPoint >= 'A'&& startingPoint>='D'&& destination>='A' && destination >='B' ));
			
				System.out.println("Invalid start or end");
			}
			
			
	}

