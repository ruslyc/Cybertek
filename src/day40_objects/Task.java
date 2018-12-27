package day40_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		House house1 = new House();
		house1.address = "1044 Tomahawk trl Invline Village NV 89007";
		house1.numRooms = 6;
		house1.type = "townhouse";
		
		House house2 = new House();
		house1.address = "4732 N KEystone Ave Chicago IL 60630";
		house1.numRooms = 5;
		house1.type = "single family home";
		
		House house3 = new House();
		house1.address = "1789 Tomahawk trl Invline Village NV 89007";
		house1.numRooms = 9;
		house1.type = "Single family home";
		
		House house4 = new House();
		house1.address = "6780 n California Ave Chicago IL 60700";
		house1.numRooms = 4;
		house1.type = "Condo";
		
		
		//********************************************************************************
		
		Book book1 = new Book();
		book1.author = "Jack London";
		book1.pages = 256;
		book1.title = "White tooth";
		
		Book book2 = new Book();
		book2.author = "Carlos Castaneda";
		book2.pages = 245;
		book2.title = "A separate reality";
		
		Book book3 = new Book();
		book3.author = "Joe Dispenza";
		book3.pages = 237;
		book3.title = "Breaking the habbit of being yourself";
		
		List <Book> books = new ArrayList <>();
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		for(Book b : books) {
			System.out.println(b.author);
			
		//************************************************************************************
			
		
		}
	}
	
		
}
