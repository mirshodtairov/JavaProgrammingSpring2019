package Day19;

import java.util.Scanner;

public class enterPasword {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String pass = "abs123";
		String input;

		do {
			System.out.println("enter pass:");
			input = scan.next();
		} while (!input.equals(pass));

	}

}
