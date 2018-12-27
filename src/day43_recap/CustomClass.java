package day43_recap;

import java.util.Random;

public class CustomClass {
	public static void main(String[] args) {
		System.out.println(generateUsername("Vasile Gorea"));
		System.out.println(generatePassword("Vasile Gorea"));
	}
	
	public static String generateUsername(String str) {
		String result = "";
		Random random = new Random();
				int ran = random.nextInt(100);
		if(str.trim().contains(" ")) {
			result= str.substring(0, str.indexOf(" ")).toLowerCase() + str.substring(str.indexOf(" ")+1).toLowerCase() + ran;
		}else {
			result = str.toLowerCase()+ran;
		}
		return result;
	}
	
	public static String generatePassword(String str) {
		StringBuilder result = new StringBuilder();
		Random random = new Random();
				int ran = random.nextInt(500);
				String finalResult= "";
		if(str.trim().contains(" ")) {
			result.append( str.substring(0, str.indexOf(" ")).toLowerCase() + str.substring(str.indexOf(" ")+1).toLowerCase());
			finalResult = result.reverse().toString().toLowerCase() + ran;
		}else {
			result.append(str);
			finalResult = result.reverse().toString().toLowerCase() + ran;			
		}
		return finalResult;
	}
	

}
