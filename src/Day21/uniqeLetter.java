package Day21;

import java.util.Scanner;

public class uniqeLetter {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String uniqe = "";
		for (int i = 0; i < word.length(); i++) {
			char any = word.charAt(i);
			if (!uniqe.contains("" + any)) {
				uniqe = uniqe + any;
			}

		}
		System.out.println(uniqe);

	}
}