package Assignments;

public class Oct1Assignments {

	public static void main(String[] args) {

		// 1.Write for and while loops so that they print numbers between 1 and 20

		int i = 1;

		while (i <= 20) {
			System.out.print(i + " ");
			i++;
		}

		for (int n = 1; n <= 20; n++) {
			System.out.print(n + " ");
		}
		// 2.Write for and while loops so that they print only the even numbers between
		// 1 and 20
		System.out.println(" ");
		int a = 1;

		while (a <= 20) {
			if (a % 2 == 0)
				System.out.print(a + " ");
			a++;
		}

		for (int b = 1; b <= 20; b++) {
			if (b % 2 == 0)
				System.out.print(b + " ");
		}
		// 3.Write for and while loops so that they print those numbers between 1 and 20
		// and divisible by 3.
		System.out.println(" ");
		int c = 1;
		while (c <= 20) {
			if (c % 3 == 0)
				System.out.print(c + " ");
			c++;
		}
		for (int b = 1; b <= 20; b++) {
			if (b % 3 == 0)
				System.out.print(b + " ");
		}
		// 4.Write for and while loops so that they print the square of each odd number
		// from numbers between 1 and 20.
		System.out.println(" ");
		int d = 1;
		while (d <= 20) {
			if (d % 2 == 1)
				System.out.print(d * d + " ");
			d++;
		}
		for (int b = 1; b <= 20; b++) {
			if (b % 2 == 1)
				System.out.print(b * b + " ");
		}
		/*
		 * 5.Print numbers between 1 and 20 in a way that:
		 * 
		 * a. numbers are printed with plus signs between them and a space on either
		 * side,
		 */
		System.out.println(" ");
		int e = 1;
		while (e <= 20) {
			if (e != 20) {
				System.out.print(e + " + ");
			} else {
				System.out.print(e);
			}
			e++;
		}
		for (int b = 1; b <= 20; b++) {
			if (b != 20) {
				System.out.print(b + " + ");
			} else {
				System.out.print(b);
			}
		}
		//6.Write for and while loops so that they add numbers between 1 and 20 and display the sum
		System.out.println(" ");
		int f=1;
		while(f<=20) {
			f+=f;
			f++;
		}
	}
	
	
}
