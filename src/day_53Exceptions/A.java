package day_53Exceptions;

import java.util.List;

public class A {
	static List<String> one;
public static void main(String[] args) {
	try {
	System.out.println(one.get(0));
	}catch(NullPointerException e) {
		System.out.println("no such element");
	}
}
}
