package homeWork;

import java.util.Scanner;

public class MiddleChars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		 if (word.length() == 2) {
			System.out.println(word + "" + word);
		} else if (word.length() == 1) {
			System.out.println(word + "" + word + "" + word);
		} else if (word.length() % 2 != 0) {
			System.out.println(word.charAt(word.length() / 2));
		} else if (word.length() % 2 == 0) {
			System.out.println(word.charAt(word.length() / 2 - 1) + "" + word.charAt(word.length() / 2));
		}

	}

}
