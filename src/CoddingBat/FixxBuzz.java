package CoddingBat;

public class FixxBuzz {

	public static void main(String[] args) {

	}

	public static String[] fizzBuzz(int start, int end) {

		String[] str = new String[end - 1];
		for (int i = start; i < end - 1; i++) {
			if (i % 15 == 0) {
				str[i - 1] = "fizzbuzz";

			} else if (i % 5 == 0) {
				str[i - 1] = "buzz";
			} else if (i % 3 == 0) {
				str[i - 1] = "fizz";
			} else {
				str[i - start] = String.valueOf(i);
			}
		}
		return str;

	}

}
