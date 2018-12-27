package day36_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		
//		List<String> names = new ArrayList<>();
//		Scanner scan = new Scanner(System.in);
//		for ( int i = 1; i<6; i++) {
//			System.out.println("Please enter name "+ i);
//			String name = scan.nextLine();
//			names.add(name);
//		}
//		System.out.println(names);
//		
//		
//		List<String> names1 = new ArrayList<>();
//		int idx = 1;
//		String response ="";
//	do {
//		System.out.println("Please enter name " + idx);
//		String name1 = scan.nextLine();
//		System.out.println("Do you want to add more names? Yes/No");
//		response = scan.nextLine();
//		idx ++;
//		names1.add(name1);
//	}while (response.equalsIgnoreCase ("Yes"));
//	System.out.println(names1);
		List<String> names = new ArrayList<>();
		
		names.add("John5");
		names.add("John5");
		names.add("John567");
		names.add("John5678");
		names.add("John56789");
		removeCertainLengthElements(names, 5);
		System.out.println(names);
		
	}
	public static List<String> removeCertainLengthElements(List<String> names, int size){
		
		for (int i = 0; i<names.size();i++) {
			if(names.get(i).length()==size) {
				names.remove(i);
				i--;
			}
		}
		
		return names;
	}

}
