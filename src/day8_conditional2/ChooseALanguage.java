package day8_conditional2;

import java.util.Scanner;

public class ChooseALanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		English press 1
//		Spanish press 2
//		Turkish press 3
//		Russian press 4
//		Uygur press 5
//		Uzbek press 6
//		Kyrgyz press 7
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please select: 1 for English \n"+
							"Spanish press 2 \n"+
							"Turkish press 3 \n"+
							"Russian press 4 \n"+
							"Uygur press 5 \n"+
							"Uzbek press 6 \n"+
							"Kyrgyz press 7 \n");
		
		int language = input.nextInt();
		String greeting= "";
		if(language==1) {
			greeting= "English hello";
		}else if (language==2) {
			greeting= "Spanish hello";
		}else if(language==3) {
			greeting= "Turkish hello";
		}else if(language==4) {
			greeting= "Russian hello";
		}else if(language==5) {
			greeting= "Uygur hello";
		}else if(language==6) {
			greeting= "Uzbek hello";
		}else if(language==7) {
			greeting= "Kyrgyz hello";}
		
		System.out.println(greeting);
		input.close();
	}

}
