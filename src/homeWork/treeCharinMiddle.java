package homeWork;

import java.util.Scanner;

public class treeCharinMiddle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		if (word.length() % 2 != 0) {
			System.out.println(word.charAt(word.length() / 2 )+""+(word.charAt(word.length() / 2 - 1)+""+(word.charAt(word.length() / 2 + 1))));
		} else if (word.length() == 5) {
			System.out.println(word.charAt(word.length() / 2 )+""+(word.charAt(word.length() / 2 - 1)+""+(word.charAt(word.length() / 2 + 1))));
		} else {
			System.out.println("invalid");

		}

	}

}