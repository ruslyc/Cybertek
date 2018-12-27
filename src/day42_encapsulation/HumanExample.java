package day42_encapsulation;

import day41_EncapsulationAndConstructors.FacebookUser;

public class HumanExample {
	public static void main(String[] args) {
		Human ex = new Human();
		
		ex.setAge(56);
		ex.setGender("male");
		System.out.println(ex.getAge());
		System.out.println(ex.getGender());
		
		
		FacebookUser f1 = new FacebookUser("jjj","sdfgsd");
		
		f1.userInfo();
		FacebookUser.deleteAccount(f1);
		f1.userInfo();
		
	}

}
