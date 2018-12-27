package day40_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	List<Book> books = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter the number of books: ");
	
	int bookNr = sc.nextInt();
	sc.nextLine();
		
	for(int i = 1; i<= bookNr; i++) {
		
		Book bk = new Book();
		System.out.println("Please enter the title for book "+ i );
		bk.title = sc.nextLine();
		System.out.println("Please enter the author for book "+ i );
		bk.author = sc.nextLine();
		System.out.println("Please enter the pages number for book "+ i );
		bk.pages = sc.nextInt();
		sc.nextLine();
		books.add(bk);
		
		}
	System.out.println(books.size());
}
}
