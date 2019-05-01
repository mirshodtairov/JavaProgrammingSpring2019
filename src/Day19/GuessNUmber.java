package Day19;

import java.util.Random;
import java.util.Scanner;

public class GuessNUmber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int secretnumber = random.nextInt(101);
		int guessnumber = 0;
		int chance = 5;
		do {
			System.out.println("enter your number, you have 5 chances");
			
			guessnumber = scan.nextInt();
			chance--;
			if (guessnumber > secretnumber) {
				System.out.println("too large");
				System.out.println("you have #" + chance + " chances left");
				//chance--;
			} else if (guessnumber < secretnumber) {
				System.out.println("too small");
				System.out.println("you have #" + chance + " left");

				

			}

		} while (guessnumber != secretnumber && chance > 0);

		if (chance == 0 && guessnumber != secretnumber) {
			System.out.println("you out of chances");
		} else
			System.out.println("your number is right " + guessnumber + "is" + secretnumber);

	}

}
