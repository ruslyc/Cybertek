package day19_Loops;

public class SnackTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a boolean hungry and assign true
		//create another int variable apples and assign 1 to it
		//as long as you are hungry, print "eating an apple" and increase the apple
		//once you eat 5 apples, you are no longer hungry
		
		boolean hungry = true;
		
		int apples = 1;
		
		
		while (hungry) {
			
			System.out.println("eating an apple");
			
			apples++;
			
			if (apples>5) {
				
				hungry = false;
			}
			
			
		}
		
	}

}
