package Assignments;

import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		//sum method
		//plus();
		
	//Print methods
		Scanner scan = new Scanner(System.in);
		   System.out.println("select image:\n 1) sunset\n 2)earth\n 3) desert");
		   int choice = scan.nextInt();
		   if(choice == 1){
		     printSunset();
		   }else if(choice == 2){
		     printEarth();
		   }else if(choice == 3){
		     printDesert();
		   }
		   //printHollowRect();
		   int [] arr= {1,2,3,-3,-4,0,0};
		   plus_minus(arr);
	}
public static void plus() {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter first number:");
	int num1 = scan.nextInt();
	System.out.println("enter second number");
	int num2 = scan.nextInt();
	System.out.println("result: "+ (num1+num2));
	}
public static void printSunset()
{
     System.out.print("_\\/_                 |                _\\/_\r\n" + 
	     		"/o\\\\             \\       /            //o\\\r\n" + 
	     		" |                 .---.                |\r\n" + 
	     		"_|_______     --  /     \\  --     ______|__\r\n" + 
	     		"1       `~^~^~^~^~^~^~^~^~^~^~^~`\r\n" );
}//end print_sunset

 public static void printEarth()
{
  
     System.out.print("22        _____\r\n" + 
	     		"    ,-:` \\;',`'-, \r\n" + 
	     		"  .'-;_,;  ':-;_,'.\r\n" + 
	     		" /;   '/    ,  _`.-\\\r\n" + 
	     		"| '`. (`     /` ` \\`|\r\n" + 
	     		"|:.  `\\`-.   \\_   / |\r\n" + 
	     		"|     (   `,  .`\\ ;'|\r\n" + 
	     		" \\     | .'     `-'/\r\n" + 
	     		"  `.   ;/        .'\r\n" + 
	     		"jgs `'-._____.");
  
}//print_earth

 public static void printDesert()
{
 
   System.out.print(" 33   .    _    +     .  ______   .          .\r\n" + 
	     		" (      /|\\      .    |      \\      .   +\r\n" + 
	     		"     . |||||     _    | |   | | ||         .\r\n" + 
	     		".      |||||    | |  _| | | | |_||    .\r\n" + 
	     		"   /\\  ||||| .  | | |   | |      |       .\r\n" + 
	     		"__||||_|||||____| |_|_____________\\__________\r\n" + 
	     		". |||| |||||  /\\   _____      _____  .   .\r\n" + 
	     		"  |||| ||||| ||||   .   .  .         ________\r\n" + 
	     		" . \\|`-'|||| ||||    __________       .    .\r\n" + 
	     		"    \\__ |||| ||||      .          .     .\r\n" + 
	     		" __    ||||`-'|||  .       .    __________\r\n" + 
	     		".    . |||| ___/  ___________             .\r\n" + 
	     		"   . _ ||||| . _               .   _________\r\n" + 
	     		"_   ___|||||__  _ \\\\--//    .          _\r\n" + 
	     		"     _ `---'    .)=\\oo|=(.   _   .   .    .\r\n" + 
	     		"_  ^      .  -    . \\.|");
  
}//end
 public static void printHollowRect(){
	    System.out.println("*****\n*   *\n*   *\n*   *\n*****");
 }
 public static void plus_minus(int arr[]){
	    int pos =0;
	    int neg =0;
	    int zero =0;
	    for(int i = 0; i< arr.length; i++){
	      if(arr[i]>0){
	        pos++;
	      }else if(arr[i]<0){
	        neg++;
	      }else if(arr[i]==0){
	        zero++;
	        
	      }
	    }System.out.println("positives:" + pos + ", negatives:" + neg + ", zeros: " + zero);
	  }
}
