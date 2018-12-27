package day41_EncapsulationAndConstructors;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FacebookExamples {
	public static void main(String[] args) throws FileNotFoundException{
		
		
		Random random = new Random();
		
		List<String> names = new ArrayList<>();
		List<FacebookUser> database = new ArrayList<>();
		
		File file = new File("test.txt");

		Scanner sc=new Scanner(file);

        while(sc.hasNextLine()){

        String name = sc.nextLine().trim();
        
        names.add(name);
        }
 
        for(int i =0; i < names.size(); i++) {
        	String username = "user" + names.get(i).substring(0,names.get(i).indexOf(" ") );
        	String password = "" +random.nextInt(99999-10000)+10000;
        	FacebookUser user = new FacebookUser(username, password);
        	user.name = names.get(i);
        	user.age = random.nextInt(75-14)+14;
        	database.add(user);
        	user.userInfo();
        	
        }
        int count= 0;
        for(int i = 0; i < database.size()-1; i++) {
        for(int j = i+1; j<database.size();j++) {
        	database.get(i).sendFriendRequest(database.get(j));
        	count++;
        }
        }System.out.println(count);
       
        for(int j = 0; j<database.size();j++) {
        	 database.get(j).acceptRequests();
        	 
        }

}
}

