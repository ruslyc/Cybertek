package day42_encapsulation;

import java.util.ArrayList;

public class Human {
	
	private String gender;
	
	private int age;
	
	static String todaysDate;
	
	public void setAge(int n) {
		
		if(n>=0&&n<=150) {
			this.age = n;
		}else {
			System.out.println("No such age!");
		}
	}
	
	public void setGender(String s) {
		if(s.equals("male")||s.equals("female")) {
			this.gender = s;
		}else {
			System.out.println("No such gender!");
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	

}
