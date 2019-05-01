package homeWork;

import java.util.Scanner;

public class CoddingBat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your word");
		String n = scan.next();
		for (int i = 0; i < n.length() - 1; i++) {
			n.substring(i, i + 2);
			if (n.substring(i, i + 2).equals("hi")) {
				System.out.println("hi is there");
				return;
			} else {
				System.out.println("no hi");
			}

		}

	}

}
