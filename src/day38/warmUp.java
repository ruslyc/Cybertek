package day38;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class warmUp {
	public static void main(String[] args) {
		
		System.out.println(modifiedString("conference"));
		System.out.println(modifiedString("conference", "eren"));
		
	}
public static String modifiedString(String word) {
	
	if(word.contains(" ")|| word.length()<3) {
		System.out.println("Invalid data!");
		return "";
	}else {
		if(word.toLowerCase().contains("con")) {
			StringBuilder word1 = new StringBuilder(word.toLowerCase().trim());
			
			word1 = word1.delete(word1.indexOf("con"),word1.indexOf("con")+3 );
			word = word1.toString();
		}else {
			return word;
		}
	}
	return word;
}
public static String modifiedString(String word, String target) {
	if(word.contains(" ")|| word.length()<3) {
		System.out.println("Invalid data!");
		return "";
	}else {
		if(word.toLowerCase().contains(target)) {
			StringBuilder word1 = new StringBuilder(word.toLowerCase().trim());
			
			word1 = word1.delete(word1.indexOf(target),word1.indexOf(target)+target.length() );
			word = word1.toString();
		}else {
			return word;
		}
	}
	return word;
}
public static void removeEveryOther(ArrayList<String> words){
	  ArrayList<String> temp = new ArrayList<>();
	  for(int i = 0; i< words.size(); i++){
	    if(i%2==0){
	      temp.add(words.get(i));
	    }
	  }
	  words.clear();
	  words.addAll(temp);
	  
	 
	}
}
