package Day21;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;

		do {
			System.out.println("enter 2 numbers");
			int a = scan.nextInt();
			int b = scan.nextInt();
			sum = a + b;
		} while (sum <= 100);
		System.out.println("good number");

	}
}
