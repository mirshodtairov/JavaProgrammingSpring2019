package CoddingBat_String2;

public class ZipZap {

	public static void main(String[] args) {
		System.out.println(zipZap("zlpZzap"));

	}

	public static String zipZap(String str) {
	

		int len = str.length();

		String finalString = "";

		for (int i = 0; i < len; i++) {

			finalString += str.substring(i, i + 1);

			if (i > 0 && i < len - 1) {
				if (str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p')

					finalString = finalString.substring(0, finalString.length() - 1);

			}

		}

		return finalString;

	}
}
