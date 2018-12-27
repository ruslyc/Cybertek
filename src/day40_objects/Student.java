package day40_objects;

public class Student {
	
	String name;
	int age;
	String email;
	
	public void read() {
		System.out.println(name + " is reading");
	}
	public void read(Book b) {
		System.out.println("student "+ name + " is reading "+ b.title+ " by " + b.author);
	}

}
