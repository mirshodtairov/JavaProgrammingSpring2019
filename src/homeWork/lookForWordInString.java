package homeWork;

public class lookForWordInString {

	public static void main(String[] args) {
		String word = "he said hi, then she replied hi, hi guys!";
		int count = 0;

		for (int i = 0; i < word.length() - 1; i++) {
			String temp = word.substring(i, i+2);
			if (temp.equals("hi")) {
				count++;

			}
			

		}
       System.out.println(count);
	}

}
