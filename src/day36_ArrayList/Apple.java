package day36_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Apple {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		System.out.println("Size before adding elements: " + names.size());
		names.add("James");
		names.add("George");
		names.add("html");
		names.add(0, "Greg");
		System.out.println("Size after adding elements: " + names.size());
		System.out.println(names);
		String myName = names.get(2);// --> getting an element at a certain index
		System.out.println(names.indexOf("James")); // getting the index of a certain element in the list
		
	}

}
