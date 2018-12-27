package day34_methodOverloading;

public class OverloadingMethods {
	public static void main(String[] args) {
		String [] arr = {"mihai", "mihai john victor"};
		MultipleWords(arr,3 );
	}
public static String ArrayToString(int [] nums) {
	return ArrayToString(nums);
}
public static String ArrayToString(String [] names) {
	return ArrayToString(names);
}
public static void MultipleWords(String [] studentList) {
	for(String idx : studentList) {
		if(idx.trim().contains(" ")) {
			System.out.println(idx);
		}
	}
}
public static void MultipleWords(String [] studentList, int num) {
	for(String index : studentList) {
		int idx = 0;
		int count = 0;
		while (idx != -1) {
			idx = index.indexOf(" ", idx);
			if (idx != -1) {
				idx ++;
				count++;
				if (count == num-1) {
					System.out.println(index);
				}
			}
		}
	}
	}
}

