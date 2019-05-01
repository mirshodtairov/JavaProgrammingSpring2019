package ArrayAssignments;

import java.util.Arrays;

public class ArrraysbinarrySearch {

	public static void main(String[] args) {
		String[] words = { "cake", "tomato", "wooden spoon", "pizza" };
		Arrays.sort(words);
		for (String string : words) {
			System.out.println(string);
		}
		System.out.println(Arrays.binarySearch(words, "pizza"));

		String name[] = { "Mirshod", "Mansur", "Maruf", "Adolat", "Mukhamad" };
		int inndex = -1;
		for (int i = 0; i < name.length; i++) {
			if (name[i].equals("Mansur")) {
				inndex = i;
				break;
			}

		}
		System.out.println(inndex);

	}

}
