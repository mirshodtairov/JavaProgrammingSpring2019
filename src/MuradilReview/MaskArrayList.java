package MuradilReview;

import java.util.*;

public class MaskArrayList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> inputs = new ArrayList<>();
		List<String> masked = new ArrayList<>();
		List<Integer> lenghtList = new ArrayList<>();
		String answer = "";
		do {
			System.out.println("Enter word:");
			String word = scan.next();
			inputs.add(word);
			masked.add(maskWord(word));
			lenghtList.add(word.length());
			System.out.println("You want to add another word?");
			answer=scan.next();
		} while (answer.equalsIgnoreCase("y"));
		System.out.println(inputs);
		System.out.println(masked);
		System.out.println(lenghtList);

	}

	public static String maskWord(String word) {
		String temp = "";
		for (int i = 1; i <= word.length(); i++) {
			temp += "*";

		}
		return temp;

	}

}
