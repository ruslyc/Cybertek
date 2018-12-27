package day28_Arrays;

public class ArraysUtility {
	public static void main(String[] args) {
	String [] students = {"Donald", "James", "Adam"};
	
	for(String student : students) {
		if(student.equals("James")) {
			System.out.println("True");
			break;						//
		}
	}
}

}
