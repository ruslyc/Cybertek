package day13_stringmanipulation;

public class CheckWords {

	public static void main(String[] args) {

		String str1 = "word";
		String str2 = "cat";
		String str3 = "bracket";
		
		
		int res1 = str1.length();
		int res2 = str2.length();
		int res3 = str3.length();
		
		if(res1==res2&&res2==res3) {
			System.out.println("All words are sthe same length");
		}else if((res1==res2)&&!(res2==res3)||!(res1==res2)&&(res2==res3)||(res1==res3)&&!(res2==res3)){
			System.out.println("Not Same nor Different lengths");
		}else if(!(res1==res2)&&!(res2==res3)&&!(res1==res3)) {
			System.out.println("All different length");
		}

	}

}
