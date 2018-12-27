package day43_recap;

import java.util.ArrayList;
import java.util.List;

public class FacebookApp {
	
	static List<FacebookUser> fbList = new ArrayList<>();
	public static void loadUsers(List<String> names) {
		
		for(String name : names) {
			String password = CustomClass.generatePassword(name);
			String username = CustomClass.generateUsername(name);
			
			FacebookUser fb = new FacebookUser(name, username, password);
			fbList.add(fb);
		}
	}
	
	public static void seeAllFacebookUsers() {
		for(FacebookUser f : fbList) {
			f.userInfo();
		}
	}
	
	public static boolean userExists(String username) {
		boolean b = false;
		for(FacebookUser f : fbList) {
			if (username.equals(f.username)) {
				b =  true;
			}
		}return b;
	}
	
	public static void addUser(FacebookUser f) {
		for(FacebookUser fb: fbList) {
			if(f.username.equals(fb.username)) {
				System.out.println("user already exists in the system");
			}else {
				fbList.add(f);
			}
		}
	}
	
	public static void removeUser(FacebookUser f) {
		for(FacebookUser fb: fbList) {
			if(f.username.equals(fb.username)) {
				fbList.remove(f);
			}else {
				System.out.println("user doesn't exist in the system");
			}
	}
	

}
}
