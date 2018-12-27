package day13_stringmanipulation;

public class Login {
	public static void main(String[] args) {
		
		String secretUserName = "admin";
		String secretPassword ="abc123";
		
		String userName = new String("admin");
		String password = new String("abc123");
		
		if (secretUserName.equals(userName)&&secretPassword.equals(password)) {
			System.out.println("Login succesful");
		}else if(secretUserName.equals(userName)&&!(secretPassword.equals(password))) {
			System.out.println("Incorrect password");
		}else if(!(secretUserName.equals(userName))&&secretPassword.equals(password)) {
			System.out.println("Incorrect Username");
		}else{
			System.out.println("Incorrect password and Username");
		}
		}
	}


