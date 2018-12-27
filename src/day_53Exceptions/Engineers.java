package day_53Exceptions;

public class Engineers {
	public static void main(String[] args) {
		
		int []ages = {23,45,23,53,45};
			
	
		try {
			System.out.println(ages[6]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index");
		}
		System.out.println("End of program");
	}

}
