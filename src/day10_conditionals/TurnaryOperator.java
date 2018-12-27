package day10_conditionals;

public class TurnaryOperator {

	public static void main(String[] args) {
		
		//Ternary operator : ?

		int score = 70;
		
		String status;
		
		if(score>=60&&score<=100) {
			status = "pass"	;	
		}else {
			status ="fail" ;
		}
		status = (score>=60&&score<=100) ?  "pass" : "fail" ;
		System.out.println(status);
		
		boolean express=true;
		
		int shipping;
		
		shipping = (express) ? 25 : 15;
		
		System.out.println(shipping);
		
		//OR
		
		
		boolean eXpress = true;
		
		System.out.println((eXpress) ? 25:15);
	}}

	



