package day_9;

import java.util.Scanner;

public class RangeTests {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter students number:");
		int students = input.nextInt();
		int onlineStudents=students-60;
		if (students>=5&&students<30) {
			System.out.println("lets do mentoring session");
		}else if (students>=30&&students<=60) {
			System.out.println("lets have a lecture");
		}else if (students>60) {
			System.out.println("number of online students: " + onlineStudents);
		}else {
			System.out.println("Students number must be more or equal t0 5");
		}

	}

}
