package homeWork;

import java.util.Scanner;

public class CatAndDog {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;

		String word = scan.next();
		// int end = word.length();

		for (int i = 0; i < word.length() - 2; i++) {
//			 String sub = word.substring(i, i+2);

			if (word.substring(i, i + 3).equals("cat")) {
				countOfCats++;

			} else if (word.substring(i, i + 3).equals("dog")) {
				countOfDogs++;

			}

		}
		System.out.println(countOfCats == countOfDogs);

	}

}
