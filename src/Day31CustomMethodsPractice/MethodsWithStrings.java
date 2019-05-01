package Day31CustomMethodsPractice;

import java.util.Arrays;

public class MethodsWithStrings {

	public static void main(String[] args) {
		countWords("I love java");
		googleSearchResults("about 121,000,000 results (0.73 seconds)");

	}

	public static void countWords(String sentance) {
		String[] words = sentance.split(" ");
		System.out.println("Words in sentence " + Arrays.toString(words));
		System.out.println("numbers of wordsWords in sentence " + words.length);

	}
	public static void googleSearchResults(String result) {
		String []  app = result.split(" ");
		System.out.println("result count "+app[1].replace(",", ""));
		System.out.println("Time of search "+app[3].substring(1, app.length));
	}
	

}
