package VasilStringManipulation;

import java.util.ArrayList;
import java.util.Arrays;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String target = "Java is fun";
		System.out.println(reverse(target));

		System.out.println(reverse2(target));

		ArrayList<String> aaa = new ArrayList<>();
		aaa.add("some");
		aaa.add("word");

		System.out.println(reverse3(aaa));

		String sentence = "What a beautidful day";
		System.out.println(reverse4(sentence));

	}

	public static String reverse(String str) {
		String word = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			// word+=str.charAt(i);
			word += str.substring(i, i + 1);
		}
		return word;

	}

	// ==========================================================================================

	public static String reverse2(String str) {
		String word1 = "";

		char[] chars = str.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--) {

			word1 += chars[i];

		}

		return word1;

	}

	public static String reverse3(ArrayList<String> str) {
		String word2 = "";

		for (int i = str.size() - 1; i >= 0; i--) {

			word2 += " " + str.get(i);

		}

		return word2;

	}

	public static ArrayList<String> reverse4(String str) {

		String[] arr = str.split(" ");
		ArrayList<String> list = new ArrayList<>();

		for (int i = arr.length - 1; i >= 0; i--) {

			list.add(arr[i]);

		}
		System.out.println(list.size());
		return list;

	}

	public static String reverseLetters(String str) {
		// convert string into array of chars
		// because string is immutable
		// so it's easier to swap values with array
		char[] arr = str.toCharArray();
		// i starts from he beginning
		// j starts from the end
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			// until character under position i is not a letter
			// it will keep moving
			while (!Character.isLetter(arr[i])) {
				i++;
			}
			// until character under position j is not a letter
			// it will keep moving
			while (!Character.isLetter(arr[j])) {
				j--;
			}
			// once we have letter from left side and from the right side
			// we can swap them
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		// convert array of chars into string
		String result = new String(arr);
		return result;
	}

}
