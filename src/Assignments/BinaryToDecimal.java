package Assignments;


public class BinaryToDecimal {
	public static void main(String[] args) {
		int[] i = {0, 0, 0, 0, 0, 0, 1, -1};
		int[] j = {1, 1, 1, 1, 1, 1, 1, 1};
		binaryToDecimal(i);
	}
	public static void binaryToDecimal(int[] binary){
		int dec = 0;
		int value = 1;
		//{0, 0, 0, 0, 0, 0, 1, 1};
		    for(int i = binary.length-1; i>= 0; i--){
		      if(binary[i] == 1) {
		    	  dec += value;
		      }
		      value *= 2;
		    }
		    System.out.println(dec);
		    }
	
}
