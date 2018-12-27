package day_53Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Plane {
	
	public static void main(String[] args)  {
		
		System.out.println("Program starting");
		File file = new File ("file");
		try {
			Scanner sc = new Scanner(file);
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
