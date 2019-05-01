package homeWork;

import java.util.Scanner;

public class startsWithEndsWithInCombine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		if (word.startsWith("x") && word.endsWith("X")) {
			String word1 = word.substring(word.indexOf("x") + 1, word.indexOf("X"));
			System.out.println(word1);
		} else if (word.startsWith("x") && word.endsWith("x")) {
			String word2 = word.substring(word.indexOf("x") + 1, word.indexOf("x"));
			System.out.println(word2);
		} else if (word.startsWith("x") && word.endsWith("x")) {
			String word2 = word.substring(word.indexOf("x") + 1, word.indexOf("x"));
			System.out.println(word2);
		} else if (word.startsWith("X") && word.endsWith("x")) {
			String word3 = word.substring(word.indexOf("X") + 1, word.indexOf("x"));
			System.out.println(word3);
		} else if (word.startsWith("X") && word.endsWith("X")) {
			String word4 = word.substring(word.indexOf("X") + 1, word.indexOf("X"));
			System.out.println(word4);
		} else {
			System.out.println(word);
		}

	}

}
