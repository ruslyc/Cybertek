package day36_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AddMultipleElementsToList {
	public static void main(String[] args) {
		List<String> names = new ArrayList <>();
		add(names, "John", "Greg", "Silvia");
		System.out.println(names);
	}
public static List<String> add(List<String> names, String ... name){
	
	for(String str : name) {
		names.add(str);
	}
	
	return  names;
}
}
