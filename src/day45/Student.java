package day45;

public class Student {
	
	protected String g;
	
	String name;
	int age;
	String location;
	
	public void study(String course) {
		System.out.println("Studying "+ course);
	}
	
	public boolean takeExam(int grade) {
		if(grade >=80) {
			return true;
		}else {
			return false;
		}
	}
	

}
