package CoddingBat;

public class RepeatOfPrefix {

	public static void main(String[] args) {
		String str = "abXYabc";
		int n = 2;
		int counter = 0;
		String temp = str.substring(0, n);

		for (int i = 0; i < str.length() - n; i++) {
			if (temp.equals(str.substring(i, i + n))) {
				counter++;
			}
		}
			if (counter > n) {
				System.out.println(true);
			} else {
				System.out.println(false);

			}
		}
	}

