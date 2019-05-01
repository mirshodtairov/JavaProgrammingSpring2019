package Day23;

import java.util.Scanner;

public class SummaryOfWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String words = "";
		String w = "";

		for (int i = 0; i < 6; i++) {
			w = scan.next();
			if (w.contains("java")) {
				continue;
			}

			words = words + w+",";
		}
		System.out.println(words.substring(0, words.length()-1));

	}

}
