package day11_SwitchStatement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double num1, num2, result ;
		char operator;
		Scanner input = new Scanner(System.in);
		System.out.println("please enter number one:");
		num1 = input.nextDouble();
		System.out.println("please enter number two:");
		num2 = input.nextDouble();
		System.out.println("please enter the desired operation:");
		operator = input.next().charAt(0);
		
		result =0;
		switch(operator) {
		
		case '+' :
			result = num1+num2;
			break;
		case '-' :
			result = num1-num2;
			break;
		case '*' :
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;
			break;
		case '%':
			result = num1%num2;
			break;
		default :
			System.out.println("Invalid operator");
			return;//don't run the rest of the code, get out of main method
		}System.out.println(result);

	}

}
