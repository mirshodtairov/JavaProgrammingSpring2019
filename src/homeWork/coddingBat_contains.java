package homeWork;

import java.util.Scanner;

public class coddingBat_contains {

	public static void main(String[] args) {

		String bobthere;
		Scanner scan = new Scanner(System.in);
		bobthere = scan.next();
		String anybob;

		if (bobthere.contains("bob")) {
			anybob = "bob";
			if (anybob.length() - 1 != 'o')
				;
			{
				System.out.println("bob is there");
			}
		} else {
			System.out.println("bob is not there");
		}

	}

}
