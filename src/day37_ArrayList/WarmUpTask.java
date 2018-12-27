package day37_ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("test.txt");
		Scanner sc = new Scanner(file);
		List<String> names = new ArrayList<>();
		while (sc.hasNextLine()) {
			String name = sc.nextLine().trim();
			if(!name.isEmpty()) 
			{
			names.add(name);
			}
	}
		System.out.println(names.size());
		
		certainSizeGroup(names, 3);
		certainStringLengthPrintOut(names, 6);
		shortesToLongest(names);
}
	public static void certainSizeGroup(List<String> names, int size) {
		int count =0;
		for(String str : names) {
			count++;
			if(count%size == 0) {
				System.out.print(str);
			}else {
				System.out.print(str + " - ");
			}
			
			if(count%size == 0)
				System.out.println();
		}
	}
	public static void certainStringLengthPrintOut(List<String> names, int length) {
		int count =0;
		for(String str : names) {
			if(str.length()== length) {
				count++;
				System.out.println(str);
			}
		}System.out.println("there are "+ count + " students with " + length + " characters in their name" +'\n' +"-------------------------------------");
	}
	public static void shortesToLongest(List<String> names) {
		int min = names.get(0).length();
		int max = names.get(0).length();
		for(String j : names) {
			if(j.length()<min) {
				min = j.length();
				}else if(j.length()>max) {
					max = j.length();
				}
		}
		System.out.println(min);
		System.out.println(max);
		for ( int  i = min; i<=max ; i++) {
			List<String> name = new ArrayList<>();
			for( String str : names) {
				if (str.length() == i) {
					name.add(str);
				}
			}for(String str1 : name) {
				System.out.println(str1);
			}
		}
	}
}
