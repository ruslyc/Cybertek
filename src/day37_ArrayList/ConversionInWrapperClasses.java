package day37_ArrayList;

public class ConversionInWrapperClasses {
public static void main(String[] args) {
	
//	Autoboxing and Unboxing
//	If int gets converted  to Integer type it's called autoboxing
//  Autoboxing  - automatically  converting from primitive to object data type.
//	If Integer gets converted to int type then it's Unboxing
	
	System.out.println(extractNum("Your total is : 12.78$"));
}
public static double extractNum(String s) {
	   String output = "";
	   double d = 0;
	   for (int i = 0; i<s.length(); i++) {							// s = s.replaceAll("\\D +", "");
	     if(Character.isDigit(s.charAt(i)) || s.charAt(i) == '.'){
	       output +=s.charAt(i);
	       d = Double.valueOf(output);
	     }
	   }return d;
	  
	  }
}
