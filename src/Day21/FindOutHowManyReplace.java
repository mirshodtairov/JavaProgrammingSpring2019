package Day21;

public class FindOutHowManyReplace {

	public static void main(String[] args) {
		String word = "incuding webpage, images";
		int count = 0;

		for (int i = 0; i < word.length() - 1; i++) {
			String temp = word.substring(i, i + 1);
			if (temp.equals("e")) {
				count++;
				

			}

		}
		System.out.println(count);
	}

}
