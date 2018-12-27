package day_53Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ninja {
	
	public static void main(String[] args) {
		
		fly(); 
		
	}
	public static void fly(){ //throwing exception will just pass the responsibility of 
															//dealing with the issue to the next user of the method
		File file = new File("some file");
		try {
			Scanner sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("this file was not found");
			
	}	finally {
		System.out.println("this gets executed no matter what");
	}

}}
