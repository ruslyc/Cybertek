package Assignments;

import java.util.Scanner;

public class DescendingOrderNames {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first name: ");
		
		String name1 = scan.next();
		
		System.out.println("Please enter the second name");
		
		String name2 = scan.next();
		
		System.out.println("Please enter the third name");
		
		String name3 = scan.next();
		
		if(name1.length()>name2.length()&&name2.length()>name3.length()) {
			System.out.println(name1+'\n'+name2+'\n'+name3);
			
		}else if(name1.length()>name2.length()&&name3.length()>name2.length()){
			System.out.println(name1+'\n'+name3+'\n'+name2);
			
		}else if(name2.length()>name1.length()&&name1.length()>name3.length()){
			System.out.println(name2+'\n'+name1+'\n'+name3);
			
		}else if(name2.length()>name3.length()&&name3.length()>name1.length()){
			System.out.println(name2+'\n'+name3+'\n'+name1);
			
		}else if(name3.length()>name1.length()&&name1.length()>name2.length()){
			System.out.println(name3+'\n'+name1+'\n'+name2);
			
		}else if(name3.length()>name2.length()&&name2.length()>name1.length()){
			System.out.println(name3+'\n'+name2+'\n'+name1);
			
		}else if(name1.length()>name2.length()&&name2.length()==name3.length()){
			System.out.println(name1+'\n'+name2+"'s length is equal to "+name3+ "'s length.");
			
		}else if(name2.length()>name1.length()&&name1.length()==name3.length()){
			System.out.println(name2+'\n'+name1+"'s length is equal to "+name3+ "'s length.");
			
		}else if(name3.length()>name2.length()&&name2.length()==name1.length()){
			System.out.println(name3+'\n'+name2+"'s length is equal to "+name3+ "'s length.");
		
		}else if(name1.length()==name2.length()&&name2.length()==name3.length()){
			System.out.println("All three names have the same length!");
		}

}
}