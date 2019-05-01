package RplIt;

public class uniqueWordInArray {

	public static void main(String[] args) {

	}

	public static void printUniqueWords(String[] words) {
		for (int outer = 0; outer < words.length; outer++) {
			String current = words[outer];
			boolean duplicate = false;
			for (int inner = 0; inner < words.length; inner++) {
				if (words[inner].equals(current) && (outer != (inner))) {
					duplicate = true;
					break;

				}

			}
			if (duplicate == false) {
				System.out.println(current);
			}

		}

	}

}
