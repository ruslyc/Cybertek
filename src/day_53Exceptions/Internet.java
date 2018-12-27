package day_53Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Internet {
	
	public static void main(String[] args)  {
		
		String name = "JAmes";
		//System.out.println(name.charAt(23));
		File file = new File("VVV");
		try {
			Scanner sc = new Scanner(file);				// Will catch the exception and continue the execution of the program
			
		} catch (FileNotFoundException | StringIndexOutOfBoundsException e) {
			System.out.println("Not found");
			e.printStackTrace();
		}
		//catch (StringIndexOutOfBoundsException e) {
			//System.out.println("NAme doesnt have given index");
		System.out.println(name);
		}
		
		
	}


