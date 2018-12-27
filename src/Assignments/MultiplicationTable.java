package Assignments;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("_____________________________________________________________");
		System.out.println("|                     " + "Multiplication Table" + "                  |");
		for (int i = 1; i <= 12; i++) {
			System.out.println('\n' + "|" + "___________________________________________________________" + "|");
			for (int j = 1; j <= 12; j++) {
				if (j != 12) {
					if ((i * j) < 10) {
						System.out.print("|  " + i * j + " ");
					} else if ((i * j) >= 10 && (i * j) < 100) {
						System.out.print("| " + (i * j) + " ");
					} else if ((i * j) >= 100) {
						System.out.print("| " + i * j);
					}
				} else {
					if ((i * j) < 10) {
						System.out.print("|  " + i * j + " |");
					} else if ((i * j) >= 10 && (i * j) < 100) {
						System.out.print("| " + (i * j) + " |");
					} else if ((i * j) >= 100) {
						System.out.print("| " + i * j + "|");
					}
				}
			}
		}
		System.out.println('\n' + "|" + "___________________________________________________________" + "|");

	}
}
