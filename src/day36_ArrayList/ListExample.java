package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {

		// Convert array to arraylist

		String[] oldNames = { "Trump", "Obama" };
		List<String> newNames = Arrays.asList(oldNames); // Converts an array to List
		List<String> names = new ArrayList<>();
		names.add("James");
		names.add("Adam");
		names.addAll(newNames);
	}
}
