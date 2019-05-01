package RplIt;

public class badWordOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(clean("", "two"));

	}

	public static String clean(String text, String badWord) {

		if (text.contains(" ")) {
			String arr[] = text.split(" ");
			String temp = "";
			for (int i = 0; i < arr.length; i++) {

				if (!arr[i].equals(badWord)) {

					temp += arr[i] + " ";

				}
			}
			return temp;
		}
		return badWord;

	}
}